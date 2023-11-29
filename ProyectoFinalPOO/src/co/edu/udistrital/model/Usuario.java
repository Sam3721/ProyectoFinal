package co.edu.udistrital.model;

import java.util.ArrayList;

public class Usuario extends Persona {

	private int edad;
	private int tarjeta;

	public Usuario(String nombre, String contra, String gmail,String rol, int edad, int tarjeta) {
		super(nombre, contra, gmail, rol);
		this.edad = edad;
		this.tarjeta = tarjeta;

	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setTarjeta(int tarjeta) {
		this.tarjeta = tarjeta;
	}

	public int getTarjeta() {
		return tarjeta;
	}



}
