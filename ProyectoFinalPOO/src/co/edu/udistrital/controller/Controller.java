package co.edu.udistrital.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JOptionPane;

import co.edu.udistrital.model.DirectorioPareja;
import co.edu.udistrital.model.DirectorioTienda;
import co.edu.udistrital.model.DirectorioU;
import co.edu.udistrital.model.Pareja;
import co.edu.udistrital.model.Persona;
import co.edu.udistrital.model.Tienda;
import co.edu.udistrital.model.Usuario;
import co.edu.udistrital.view.VentanaPrincipal;
import co.edu.udistrital.view.VentanaU;
import co.edu.udistrital.view.Ventanaadd;

public class Controller implements ActionListener {

	private VentanaPrincipal vista;
	private DirectorioU datos;
	private VentanaU vistau;
	private Ventanaadd vistaad;
	private DirectorioPareja datospareja;
	private DirectorioTienda datostienda;
	

	public Controller() {
		vista = new VentanaPrincipal();
		datos = new DirectorioU();
		datospareja = new DirectorioPareja();
		datostienda = new DirectorioTienda();
		vistau = new VentanaU();
		vistaad = new Ventanaadd();
		asignarOyentes();
	}

	public void asignarOyentes() {

		vista.getPin().getBentrar().addActionListener(this);
		vista.getPin().getBadd().addActionListener(this);
		vista.getPin().getLrol().addActionListener(this);
		vistaad.getPb().getBadd().addActionListener(this);
		vistau.getPc().getLpareja().addActionListener(this);
		vistau.getPb().getLtienda().addActionListener(this);
		vistau.getPb().getLproducto().addActionListener(this);
		vistau.getPb().getBcompra().addActionListener(this);
		vistau.getPb().getBaddpareja().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		if (comando.equals("SING")) {

			Usuario encontrada = null;
			if (vista.getPin().getLrol().getSelectedItem().equals("Usuario")) {
				for (Usuario x : datos.getDirectoriou()) {
					if (x.getNombre().equals(vista.getPin().getCajanombre().getText())
							&& x.getContra().equals(vista.getPin().getCajacontra().getText())) {
						encontrada = x;
						vista.setVisible(false);
						vistau.setVisible(true);
						vistau.getPu().getEnombre().setText("Bienvenido/a " + encontrada.getNombre());
						vistau.getPc().getCajapersona1().setText(encontrada.getNombre());
						
					}

				}
				for ( Pareja z : datospareja.getDirectoriou()) {
					if(z.getNombre1().equals(vistau.getPc().getCajapersona1().getText())) {
						vistau.getPc().getLpareja().addItem(z.getNombre2());
						vistau.getPc().getCajacupo().setText(z.getCupo());
					}
				}
				
			} else {

			}

			if (encontrada == null) {
				JOptionPane.showMessageDialog(vista, "Error Persona no encontrada");
			}
			

			vista.getPin().getCajacontra().setText("");
			vista.getPin().getCajanombre().setText("");

		} else if (comando.equals("ADD")) {
			vista.setVisible(false);
			vistaad.setVisible(true);

		} else if (comando.equals("ADD2")) {
			String rol = (String) vistaad.getPadd().getLrol().getSelectedItem();
			String nombre = vistaad.getPadd().getCajanombre().getText();
			String contra = vistaad.getPadd().getCajacontra().getText();
			String email = vistaad.getPadd().getCajaemail().getText();
			int edad = Integer.parseInt(vistaad.getPadd().getCajaedad().getText());
			Random random = new Random();
			int tarjeta = random.nextInt(90000) + 10000;
			if (rol.equals("Usuario")) {
				Usuario nuevapersona = new Usuario(nombre, contra, email, rol, edad, tarjeta);
				datos.agregarPersona(nuevapersona);
				JOptionPane.showMessageDialog(vistaad, "Usuario agregado con exito");
			} else {

			}
			vistaad.getPadd().getCajanombre().setText("");
			vistaad.getPadd().getCajacontra().setText("");
			vistaad.getPadd().getCajaemail().setText("");
			vistaad.getPadd().getCajaedad().setText("");

			vista.setVisible(true);
			vistaad.setVisible(false);
		}else if(comando.equals("LISTA1")) {
			vistau.getPb().getLproducto().removeActionListener(this);
			vistau.getPb().getLproducto().removeAllItems();
			String tiendaBuscar = (String) vistau.getPb().getLtienda().getSelectedItem();
			for(Tienda x:datostienda.getDirectoriotienda()) {
				if(x.getNombre().equals(tiendaBuscar)) {
				vistau.getPb().getLproducto().addItem(x.getP1().getNombre());
				vistau.getPb().getLproducto().addItem(x.getP2().getNombre());
				vistau.getPb().getLproducto().addItem(x.getP3().getNombre());
				}
				vistau.getPb().getLproducto().addActionListener(this);
			}
			
		}else if(comando.equals("LISTA2")) {
			String productoBuscar = (String) vistau.getPb().getLproducto().getSelectedItem();
			Tienda encontrada = null;
			for(Tienda x:datostienda.getDirectoriotienda()) {
				if(x.getP1().getNombre().equals(productoBuscar)){
					encontrada=x;
					vistau.getPb().getCajaprecio().setText(encontrada.getP1().getPrecio());
				}else if(x.getP2().getNombre().equals(productoBuscar)) {
					encontrada=x;
					vistau.getPb().getCajaprecio().setText(encontrada.getP2().getPrecio());
				}else if(x.getP3().getNombre().equals(productoBuscar)) {
					encontrada=x;
					vistau.getPb().getCajaprecio().setText(encontrada.getP3().getPrecio());
				}
			}
			
		} else if (comando.equals("COMPRA")) {
		    // Obtener la pareja seleccionada desde el JComboBox
		    String nombreParejaSeleccionada = (String) vistau.getPc().getLpareja().getSelectedItem();

		    // Buscar la pareja en el directorio de parejas
		    Pareja parejaSeleccionada = null;
		    for (Pareja z : datospareja.getDirectoriou()) {
		        if (z.getNombre2().equals(nombreParejaSeleccionada)) {
		            parejaSeleccionada = z;
		            break;
		        }
		    }

		    // Verificar si se encontró la pareja
		    if (parejaSeleccionada != null) {
		        // Realizar el pago utilizando el método de la clase DirectorioPareja
		        datospareja.hacerPago(parejaSeleccionada, vistau.getPb().getCajaprecio().getText());
		       
		        
		        // Actualizar la etiqueta de cupo en la interfaz gráfica
		        vistau.getPc().getCajacupo().setText(parejaSeleccionada.getCupo());
		    } else {
		        JOptionPane.showMessageDialog(vista, "Error al obtener la pareja seleccionada");
		    }
		}

		

		/*
		    els e if (comando.equals("LISTA1")) {
            vista.getPd().getLista_nombres().removeActionListener(this);
            vista.getPd().getLista_nombres().removeAllItems();
            String generoBuscar = (String) vista.getPd().getLista_genero().getSelectedItem();
            for (Persona x : datos.getDirectorio()) {
                if (x.getGenero().equals(generoBuscar)) {
                    vista.getPd().getLista_nombres().addItem(x.getNombre());
                }
            }
            vista.getPr().getEnombre2().setText("");
            vista.getPr().getEciudad2().setText("");
            vista.getPr().getEtel2().setText("");
            vista.getPr().getEmail2().setText("");
            vista.getPim().getEtiqueta().setIcon(null);
		 */

	}

}
