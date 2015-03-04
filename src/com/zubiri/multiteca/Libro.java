package com.zubiri.multiteca;

import java.util.Scanner;

public class Libro extends Obra{
	
	private String editorial;
	private int numPaginas;
	
	/*public Libro() {
		
	}*/
	
	public Libro(String titulo, Artista autor, int anyoEdicion, String editorial, int numPaginas) {
		
		super(titulo, autor, anyoEdicion);
		this.editorial = editorial;
		this.numPaginas = numPaginas;
	}
	
	public Libro (Scanner sc){
		super(sc);
		
		do {
			System.out.print("Editorial del libro: ");
			this.setEditorial(sc.next());
			
		} while (editorial == null);
		
		do {
			System.out.print("Escribe el numero de paginas del libro: ");
			this.setNumPaginas(sc.nextInt());
		} while (this.numPaginas <= 0);
	}
	
	public String getEditorial() {
		
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		
		this.editorial = editorial;
	}
	
	public int getNumPaginas() {
		
		return numPaginas;
	}
	
	public void setNumPaginas(int numPaginas) {
		
		this.numPaginas = numPaginas;
	}
	
	@Override
	public String formattedObra() {
		
		String obraStr = 
		super.formattedObra() + 
		"Editorial: " + this.editorial + "\n" + 
		"Número de páginas: " + this.numPaginas + "\n";
		
		return obraStr;
	}
	
	@Override
	public void mostrarObra() {

		super.mostrarObra();
		System.out.println("Editorial: " + this.editorial);
		System.out.println("Número de páginas: " + this.numPaginas + "\n");
	}

}
