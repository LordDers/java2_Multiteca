package com.zubiri.multiteca;

import java.util.Scanner;

public class Artista {

	private String nombre;
	private int anyoNacimiento;
	
	public Artista() {
		
	}
	
	public Artista(Scanner sc) {
		
		System.out.print("Nombre del artista: ");
		this.setNombre(sc.next());
		System.out.print("Año de nacimiento: ");
		this.setAnyoNacimiento(sc.nextInt());
	}

	public Artista(String nombre, int anyoNacimiento) {
	
		this.nombre = nombre;
		this.anyoNacimiento = anyoNacimiento;
	}
	
	public Artista(String lineaArtista, String separator) {
		
		String[] strArray = lineaArtista.split(separator);
		this.setNombre(strArray[0]);
		this.setAnyoNacimiento(Integer.parseInt(strArray[1]));
		}
	
	public String getNombre() {
		
		return nombre;
	}
	
	public void setNombre(String nombre) {
		
		this.nombre = nombre;
	}
	
	public int getAnyoNacimiento() {
		
		return anyoNacimiento;
	}

	public void setAnyoNacimiento(int anyoNacimiento) {
		
		this.anyoNacimiento = anyoNacimiento;
	}
	
	public String formattedArtista() {
		
		String artistaStr = 
		"Nombre Artista: " + this.nombre + "\n" +
		"Año de nacimiento: " + this.anyoNacimiento + "\n";
		
		return artistaStr;
	}
	
	public void mostrarArtista() {

		System.out.println("Nombre Artista: " + this.nombre);
		System.out.println("Año de nacimiento: " + this.anyoNacimiento);
	}
}
