package co.edu.udistrital.model;

public class Persona {

	private String nombre;
	private String contra;
	private String gmail;
	private String rol;
	
	public Persona(String nombre, String contra, String gmail,String rol) {

		this.nombre = nombre;
		this.contra = contra;
		this.gmail = gmail;
		this.rol = rol;

	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContra() {
		return contra;
	}

	public void setContra(String contra) {
		this.contra = contra;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

}
