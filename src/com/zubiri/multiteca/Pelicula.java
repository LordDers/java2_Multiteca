package com.zubiri.multiteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Pelicula extends Obra{

	private String productora;
	private ArrayList<Artista> interpretes;
	
	public Pelicula(String titulo, Artista autor, int anyoEdicion, String productora, ArrayList<Artista> interpretes) {
		
		super(titulo, autor, anyoEdicion);
		this.productora = productora;
		this.interpretes = interpretes;
	}
	
	public Pelicula (Scanner sc){
		super(sc);
		
		do {
			System.out.print("Productora de la pelicula: ");
			this.setProductora(sc.next());
			
		} while (productora == null);
		this.setInterpretes(Artistas.crearArtistas(sc));
			/*System.out.print("Intérpretes de la pelicula: ");
			this.setInterpretes(interpretes);*/
	}
		
	public String getProductora() {
		
		return productora;
	}
	
	public void setProductora(String productora) {
		
		this.productora = productora;
	}
	
	public ArrayList<Artista> getInterpretes() {
		
		return interpretes;
	}
	
	public void setInterpretes(ArrayList<Artista> interpretes) {
		
		this.interpretes = interpretes;
	}
	@Override
	public String formattedObra() {
		
		String obraStr = 
		super.formattedObra() + 
		"Productora: " + this.productora + "\n" + 
		"Intérpretes: " + this.interpretes + "\n";
		
		return obraStr;
	}

	@Override
	public void mostrarObra() {

		super.mostrarObra();
		System.out.println("Productora: " + this.productora);
		System.out.println("-- Intérpretes --");
		for (int i=0; i<interpretes.size(); i++) {
			System.out.println(interpretes.get(i).formattedArtista());
		}
	}
}
