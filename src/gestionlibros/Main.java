/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author estudiante103
 */
package gestionlibros;

import java.util.Scanner;
import libro.Libro;

public class Main {
    public static void main(String[] args) {
       
        Libro libro1 = new Libro();

        try (
                Scanner scanner = new Scanner(System.in)) {
            Libro libro2 = new Libro();
            
            System.out.print("Ingrese el título del libro: ");
            libro2.setTitulo(scanner.nextLine());
            
            System.out.print("Ingrese el autor del libro: ");
            libro2.setAutor(scanner.nextLine());
            
            System.out.print("Ingrese el número de ejemplares: ");
            libro2.setNumEjemplares(scanner.nextInt());
            
            System.out.print("Ingrese el número de ejemplares prestados: ");
            libro2.setNumEjemplaresPrestados(scanner.nextInt());
            
         
            System.out.println("prestando el ibro ...");
            if (libro1.prestar()) {
                System.out.println("Préstamo exitoso.");
            } else {
                System.out.println("No hay ejemplares disponibles.");
            }
            
            System.out.println("devolviendo el libro");
            if (libro1.devolver()) {
                System.out.println("Devolución exitosa.");
            } else {
                System.out.println("No hay ejemplares prestados.");
            }
            
          
            System.out.println("\nInformación de los libros:");
            System.out.println(libro1);
            System.out.println(libro2);
        }
    }
}