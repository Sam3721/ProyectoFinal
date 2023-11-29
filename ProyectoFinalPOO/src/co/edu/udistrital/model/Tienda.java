package co.edu.udistrital.model;

public class Tienda {
	
	private String nombre;
	private Producto p1;
	private Producto p2;
	private Producto p3;
	
	
	public Tienda(String nombre,Producto p1,Producto p2, Producto p3) {
		this.nombre=nombre;
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Producto getP1() {
		return p1;
	}


	public void setP1(Producto p1) {
		this.p1 = p1;
	}


	public Producto getP2() {
		return p2;
	}


	public void setP2(Producto p2) {
		this.p2 = p2;
	}


	public Producto getP3() {
		return p3;
	}


	public void setP3(Producto p3) {
		this.p3 = p3;
	}
	
	

}
