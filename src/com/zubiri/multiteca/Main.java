package com.zubiri.multiteca;

import java.io.IOException;
import java.util.Scanner;

public final class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		Multiteca multiteca = null;
		int seleccion = -1;
		
		Artistas.leerArtistas(args[0]);
		
		do {

			System.out.println("Mostrar Artistas ----------------------------- 1");
			System.out.println("Buscar Artista ------------------------------- 2");
			System.out.println("Solicitar Obras ------------------------------ 3");
			System.out.println("Mostrar Obras -------------------------------- 4");
			System.out.println("SALIR DEL PROGRAMA --------------------------- 5");
			
			seleccion = sc.nextInt();
			
			switch(seleccion) {
				case 1: 
					Artistas.mostrarArtistas();
					break;
				case 2: 
					System.out.print("Introduce el artista a buscar: ");
					Artistas.buscarArtistas(sc.next());
					break;
				case 3:
					multiteca = new Multiteca(sc);
					break;
				case 4:
					if (multiteca == null) {
						System.out.println("No es posible mostrar productos sin haber sido solicitados");
						}
						multiteca.mostrarMultiteca();
						//multiteca.formattedMultiteca();
					break;
				case 5:
					System.out.println("Has decidido salir");
					break;
				default:
					System.out.println("Opción incorrecta");
			}
		} while (seleccion != 5);
		sc.close();
	}

}
