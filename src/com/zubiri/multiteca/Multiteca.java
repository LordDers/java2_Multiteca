package com.zubiri.multiteca;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public final class Multiteca {
	
	private static ArrayList<Obra> multiteca = new ArrayList<Obra>();
	private static int numObras = 0;

	/*public Multiteca() {
		
	}*/
	
	public Multiteca(Scanner sc) {
		
		int numObras = -1;
		
		do {
			try {
				System.out.println("¿Cuantas obras quieres insertar? ");
				numObras = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Debes introducir un número.\n");
			}
			sc.nextLine(); // clears the buffer
		} while (numObras < 0);
		
		for (int i = 0; i < numObras; i++) {
			System.out.println("¿Qué obra quieres insertar?");
			System.out.println("PELICULA:--------1");
			System.out.println("LIBRO:----------2");
			System.out.println("DISCO:--------3");
			
			switch(sc.nextInt()) {
				case 1:
					Pelicula pelicula = new Pelicula(sc);
					this.multiteca.add(pelicula);
					break;
				case 2:
					Libro libro = new Libro(sc);
					multiteca.add(libro);
					break;
				case 3:
					Disco disco = new Disco(sc);
					multiteca.add(disco);
					break;
				default:
					System.out.println("No ha insertado la opción correcta.");
					break;
			}
		}
	} 

	public Multiteca(ArrayList<Obra> obras) {
		setMultiteca(obras);
	}
	
	public void setMultiteca(ArrayList<Obra> obras) {
		this.multiteca=obras;
	}
	
	public ArrayList<Obra> getMultiteca() {
		return multiteca;		
	}
	
	public int getNumObras() {
		return numObras;
	}

	public void setNumObras(int numObras) {
		Multiteca.numObras = numObras;
	}

	public void addObra(Obra obra) {
		
		multiteca.add(obra);
		numObras++;
	}
	
	public Obra obtainObra(int index) {
		
		return multiteca.get(index);
	}
	
	/*public static counter() {
	
	}*/
	
	public String formattedMultiteca() {
		String multitecaStr = null;
		
		for (int i = 0; i < multiteca.size(); i++) {
			multitecaStr += multiteca.get(i).formattedObra() + "\n";
		}

		return multitecaStr;
		
		/*NO
		String multitecaStr = 
		"Obras: " + this.getMultiteca() + "\n" + 
		"Número de obras: " + this.getNumObras();
		
		return multitecaStr;*/
	}
	
	public void mostrarMultiteca2() {

		System.out.println("Obras: " + this.getMultiteca());
		System.out.println("Número de obras: " + this.getNumObras());
	}
	
	public void mostrarMultiteca() {
		
		if (getMultiteca().size() == 0) {
			System.out.println("No se han cargado las obras");
		}
		
		for (int i=0; i<getMultiteca().size(); i++) {
			Obra obra = getMultiteca().get(i);
			obra.mostrarObra();
			System.out.println();
		}
	}
}
