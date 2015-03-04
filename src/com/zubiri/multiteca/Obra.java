package com.zubiri.multiteca;

import java.util.Scanner;

public abstract class Obra {
	
	private String titulo;
	private Artista autor;
	private int anyoEdicion;
	
	public Obra() {
		
	}
	
	public Obra(Scanner sc) {
		
		System.out.print("Título de la obra: ");
		this.setTitulo(sc.next());
		Artista artista = new Artista(sc);
		System.out.print("Año de edición: ");
		this.setAnyoEdicion(sc.nextInt());
	}
	
	public Obra(String titulo, Artista autor, int anyoEdicion) {
	
		this.titulo = titulo;
		this.autor = autor;
		this.anyoEdicion = anyoEdicion;
	}
	
	public Artista getAutor() {
		
		return autor;
	}

	public void setAutor(Artista autor) {
		
		this.autor = autor;
	}

	public int getAnyoEdicion() {
		
		return anyoEdicion;
	}

	public void setAnyoEdicion(int anyoEdicion) {
		
		this.anyoEdicion = anyoEdicion;
	}

	public String getTitulo() {
		
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		
		this.titulo = titulo;
	}

	public String formattedObra() {
		
		String obraStr = 
		"Nombre Obra: " + this.titulo + "\n" + 
		"Autor: " + this.autor.formattedArtista()  + "\n" +
		"Año de edición: " + this.anyoEdicion + "\n";
		
		return obraStr;
	}
	
	public void mostrarObra() {
		
		Artista artista = new Artista();
		System.out.println("Título: " + this.getTitulo());
		/*System.out.println("Nombre del autor: " + artista.getNombre());
		System.out.println("Año de nacimiento del artista: " + artista.getAnyoNacimiento());*/
		artista.mostrarArtista(); // campos vacios
		//this.autor.mostrarArtista(); // error
		System.out.println("Año de edición: " + this.getAnyoEdicion());
	}
}