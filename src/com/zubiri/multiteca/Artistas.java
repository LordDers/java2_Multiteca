package com.zubiri.multiteca;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Artistas {
	
	private static ArrayList<Artista> listaArtistas = new ArrayList<Artista>();
	
	/*private Artistas() {
	}*/
	
	public static void leerArtistas(String fichero) throws IOException {
		String linea;
		FileInputStream f;
		InputStreamReader fr;
		BufferedReader br;
		
		f = new FileInputStream(fichero);
		fr = new InputStreamReader(f, "UTF8");
		br = new BufferedReader(fr);
		linea = br.readLine();
		
		if (linea == null) {
			System.out.println("No existen artistas en el fichero");
		}
		
		while ((linea != null) && (linea.compareTo("") != 0)) {
			Artista artista = new Artista(linea,", ");
			listaArtistas.add(artista);
			linea = br.readLine();
		}
		br.close();
	}
	
	public static void mostrarArtistas() {
		
		if (listaArtistas.size() == 0) {
			System.out.println("No se han cargado los artistas del fichero");
		}
		for (int i = 0;i < listaArtistas.size();i++) {
			System.out.println(listaArtistas.get(i).formattedArtista());
		}
	}
	
	public static ArrayList<Artista> crearArtistas(Scanner sc){
		
		System.out.print("¿Cuántos artistas son? ");
		int opcion = sc.nextInt();
		
		for (int a=0; a<opcion; a++) {
			listaArtistas.add(new Artista(sc));
		}
		return listaArtistas;
	}
	
	public static void buscarArtistas(String nombre) {
		int i;
		
		for(i =0; i<listaArtistas.size(); i++) {
			if (listaArtistas.get(i).getNombre().equalsIgnoreCase(nombre)) {
				System.out.println(listaArtistas.get(i).formattedArtista());
				break;
			}/*
			else {
				System.out.println("No se ha encontrado el artista " + nombre);
			}*/
		}
		if (i == listaArtistas.size()) {
			System.out.println("No se ha encontrado el artista " + nombre);
		}
	}
	
	/*public static void buscarArtistas(String nombre) {
	    boolean encontrado = false;
	    
		for(int i=0; i<listaArtistas.size(); i++) {
			if (listaArtistas.get(i).getNombre().equalsIgnoreCase(nombre)) {
				encontrado = true;
				System.out.println(listaArtistas.get(i).formattedArtista());
			}
		}
		if (!encontrado) {
			System.out.println("No se ha encontrado el artista " + nombre);
		}	
 	}*/
}