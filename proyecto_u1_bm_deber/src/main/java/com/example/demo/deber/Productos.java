package com.example.demo.deber;

public class Productos {
	
	public tipo tipoComida;
	private String nombre;
	private double calorias;
	private vegetariano esVegetariano;

	
	public Productos(tipo tipoComida, String nombre, double calorias, vegetariano veg) {
		this.tipoComida=tipoComida;
		this.nombre = nombre;
		this. calorias = calorias;
		this.esVegetariano = veg;}

	
	
	@Override
	public String toString() {
		return "Tipo de plato: " + this.tipoComida + "\nNombre: " + this.getNombre() + "\n" + "N� de calorias: " 
	+ this.getCalorias() + "\nVegetariano: " + this.esVegetariano +"\n" +
				"\n--------------------------------------------";
	}
	
	
	
	// Get and Set
	public tipo getTipoComida() {
		return tipoComida;
	}
	public void setTipoComida(tipo tipoComida) {
		this.tipoComida = tipoComida;
	}
	
	public vegetariano getEsVegetariano() {
		return esVegetariano;
	}
	public void setEsVegetariano(vegetariano esVegetariano) {
		this.esVegetariano = esVegetariano;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCalorias() {
		return this.calorias;
	}
	public void setCalorias(double precioUnit) {
		this.calorias = precioUnit;
	}
	
	//Enum
	public enum tipo{entrada, fuerte, postre}
	
	public static enum vegetariano{si, no}
}