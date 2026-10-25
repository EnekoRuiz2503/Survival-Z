package org.zabalburu.app;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


         Scanner scaner = new Scanner(System.in); 

        String tipo = "";
        int vida = 0;
        int botiquines = 0;
        int habilidad = 0;
     
          System.out.println("Introduce tu nombre:");
          String  nombre = scaner.nextLine();
          System.out.println("Selecciona una clase:");
        System.out.println("Médico");
        System.out.println("Policía");
        System.out.println("Bombero");
        System.out.print("Opción:");
        int opcion = scaner.nextInt();


          switch (opcion) {
              case 1:
                  tipo = "Médico : 1";  
                  vida = 120;
                  habilidad = 6;
                  botiquines = 3;
                  break;
              case 2:
                  tipo = "Policía : 2";
                  vida = 100;
                  habilidad = 8;
                  botiquines = 2;
                  break;
              case 3:
                  tipo = "Bombero : 3";
                  vida = 140;
                  habilidad = 7;
                  botiquines = 1;
                  break;
              default:
                  System.out.println("Opción inválida. Se asignará la clase por defecto: Médico.");
                  tipo = "Médico";
                  vida = 120;
                  habilidad = 6;
                  botiquines = 3;
                  break;
               
          }

          Personaje personaje1 = new Personaje( nombre, tipo, vida, habilidad, botiquines);
          System.out.println("Información del personaje:");
          personaje1.mostrarInfo();

           Zombie zombie1 = new Zombie(tipo, vida);


                 System.out.println("¡UN ZOMBI HA APARECIDO!");
                 System.out.println("Tipo de Zombi: " + zombie1.getTipo());
                 System.out.println("Vida del Zombi: " + zombie1.getVida());
}           

            
} 
