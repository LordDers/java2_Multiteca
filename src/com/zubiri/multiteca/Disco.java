package com.zubiri.multiteca;

import java.util.Scanner;

public class Disco extends Obra{
	
	private String discografica;
	private int nCanciones;
	
	/*public Disco() {
		
	}*/
	
	public Disco(String titulo, Artista autor, int anyoEdicion, String discografica, int nCanciones) {
		
		super(titulo, autor, anyoEdicion);
		this.discografica = discografica;
		this.nCanciones = nCanciones;
	}
	
	public Disco(Scanner sc) {
		super(sc);
		
		System.out.println("Discografica: ");
		this.setDiscografia(sc.next());
		
		do {
			System.out.println("Número de canciones: ");
			this.setnCanciones(sc.nextInt());
		} while (this.nCanciones <= 0);
	}
	
	public String getDiscografia() {
		
		return discografica;
	}
	
	public void setDiscografia(String discografia) {
		
		this.discografica = discografia;
	}
	
	public int getnCanciones() {
		
		return nCanciones;
	}
	
	public void setnCanciones(int nCanciones) {
		
		this.nCanciones = nCanciones;
	}
	
	@Override
	public String formattedObra() {
		
		//super.formattedObra();
		String obraStr = 
		super.formattedObra() + 
	/*	"Nombre Obra: " + super.getTitulo() + "\n" + 
		"Autor: " + super.getAutor()  + "\n" +
		"Año de edición: " + super.getAnyoEdicion() + "\n" +*/
		"Discografica: " + this.discografica + "\n" + 
		"Número de canciones: " + this.nCanciones + "\n";
		
		return obraStr;
	}
	
	@Override
	public void mostrarObra() {

		super.mostrarObra();
		System.out.println("Discografica: " + this.discografica);
		System.out.println("Número de canciones: " + this.nCanciones + "\n");
	}
}
