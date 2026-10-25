package org.zabalburu.app;

import org.zabalburu.Personaje;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Personaje personaje1 = new Personaje(
     
               "Alex", 
               "Médico", 
               120,
               6, 
               2
          );
          
         Scanner scanner = new Scanner(System.in);

          String nombre;
          String tipo;
          int vida;
          int habilidad;
          int botiquines;

          System.out.println("Introduce tu nombre:");
            nombre = scanner.nextLine();
          System.out.println("Selecciona una clase:");
            tipo = scanner.nextLine();
          switch (tipo) {
              case "Médico":
                  vida = 120;
                  habilidad = 6;
                  botiquines = 3;
                  break;
              case "Policía":
                  vida = 100;
                  habilidad = 8;
                  botiquines = 2;
                  break;
              case "Bombero":
                  vida = 140;
                  habilidad = 7;
                  botiquines = 1;
                  break;
              default:
                  throw new IllegalArgumentException("Clase no válida: " + tipo);
               
          }
           
}    
} 
