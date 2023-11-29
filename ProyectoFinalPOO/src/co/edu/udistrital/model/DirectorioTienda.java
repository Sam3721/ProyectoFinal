package co.edu.udistrital.model;

import java.util.ArrayList;

public class DirectorioTienda {
	
	private ArrayList<Tienda> directoriotienda;
	
	public DirectorioTienda() {
		directoriotienda = new ArrayList<Tienda>();
		cargarDatosIniciales();
		
	}
	
	public void cargarDatosIniciales() {
		Tienda x;
		 Producto Leche = new Producto("Leche", "2000");
	     Producto Huevo = new Producto("Huevo", "30");
	     Producto Jabon = new Producto("Jabon", "25");
		x= new Tienda("D1",Leche,Huevo,Jabon);
		directoriotienda.add(x);
		
		Producto arroz2 = new Producto("Arroz", "15");
        Producto carne2 = new Producto("Carne", "50");
        Producto frutas2 = new Producto("Frutas", "40");
        x = new Tienda("SuperCol", arroz2, carne2, frutas2);
        directoriotienda.add(x);
        
        Producto galletas3 = new Producto("Galletas", "10");
        Producto yogurt3 = new Producto("Yogurt", "25");
        Producto pan3 = new Producto("Pan", "15");
        x= new Tienda("TiendaABC", galletas3, yogurt3, pan3);
        directoriotienda.add(x);
	}

	public ArrayList<Tienda> getDirectoriotienda() {
		return directoriotienda;
	}

	public void setDirectoriotienda(ArrayList<Tienda> directoriotienda) {
		this.directoriotienda = directoriotienda;
	}
	
	
	

}
