package org.zabalburu.app;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


         Scanner scaner = new Scanner(System.in); 

        String tipo = "";
        int vidaPersonaje = 0;
        int botiquines = 0;
        int habilidad = 0;
        int vidaZombie = 0;





        System.out.println("================================");
        System.out.println("¡BIENVENIDO A SURVIVAL Z!");
        System.out.println("================================");
          System.out.println("Introduce tu nombre:");
          String  nombre = scaner.nextLine();
           System.out.println("================================");
        
     
        System.out.println("Selecciona una clase:");
        System.out.println("1) Médico");
        System.out.println("2) Policía");
        System.out.println("3) Bombero");
        System.out.print("Opción: ");

        int opcion = scaner.nextInt();




          switch (opcion) {
              case 1:
                  tipo = " Médico";  
                  vidaPersonaje = 120;
                  habilidad = 6;
                  botiquines = 3;
                  break;
              case 2:
                  tipo = " Policía ";
                  vidaPersonaje = 100;
                  habilidad = 8;
                  botiquines = 2;
                  break;
              case 3:
                  tipo = " Bombero ";
                  vidaPersonaje = 140;
                  habilidad = 7;
                  botiquines = 1;
                  break;
              default:
                  System.out.println("Opción inválida. Se asignará la clase por defecto: Médico.");
                  tipo = " Médico";
                  vidaPersonaje = 120;
                  habilidad = 6;
                  botiquines = 3;
                  break;
               
          }
                    int vidaMaxima = vidaPersonaje;



          Personaje personaje1 = new Personaje( nombre, tipo, vidaPersonaje, habilidad, botiquines);
          System.out.println("Información del personaje:");
          personaje1.mostrarInfo();

          
                       Zombie zombie1 = new Zombie(tipo, vidaZombie);

                 System.out.println("================================");
                 System.out.println("¡UN ZOMBI HA APARECIDO!");
                  System.out.println("================================");
                 System.out.println("Tipo de Zombi: " + zombie1.getTipo());
                 System.out.println("Vida del Zombi: " + zombie1.getVida());



        

                   for (int i = 1;i <= 5;i++) {
                System.out.println("================================");
                 System.out.println("DÍA " +i);
                 System.out.println("================================");

                    int experienciaTotalDia = 0;
                do{
                     System.out.println("================================");
                    System.out.println("¡NUEVA MISIÓN!");
                    System.out.println("================================");
                            
                    while (experienciaTotalDia <=100) {
                    System.out.println("================================");
                    System.out.println("¡NUEVA MISIÓN! Elige qué hacer:");
                    System.out.println("================================");
                    System.out.println("1) Combatir zombis");
                    System.out.println("2) Recoger suministros");
                    System.out.println("3) Explorar viviendas");
                    System.out.print("Opción: ");
                    int numMision = scaner.nextInt();



                        
                         String mision = switch (numMision) {
                        case 1-> "combatir zombis"; 
                        case 2 -> "recoger suministros";
                        case 3 -> "explorar viviendas"; 
                        default -> "";
                    };  


                    int experienciaMision = 0;

                    if (mision.isEmpty()) {
                         System.out.println("Opción inválida, elige 1, 2 o 3.(+0 exp)");
                    }else {
           
                        
                     experienciaMision = 10 + (int) (Math.random() * 21);  // entre 10 y 30
                 
                   System.out.println("Misión"+ mision+" (+" + experienciaMision + " exp)");
                   } 
                   experienciaTotalDia += experienciaMision;
                   System.out.println("Progreso del día: " + experienciaTotalDia + " / 100 exp"); 
                   
                    if (numMision == 1) {
                    
                        System.out.println("===============================");
                        System.out.println("¡COMBATE CONTRA ZOMBIS!");
                        System.out.println("===============================");
                       
                        vidaZombie = zombie1.getVida();
                        boolean huir = false;

                        while (vidaZombie > 0 && vidaPersonaje > 0 && !huir) {
                            
                            System.out.println(" Vida del personaje: " + vidaPersonaje +  " Zombie:" + vidaZombie + " Botiquines:  " + botiquines);
                            System.out.println("1) Atacar 2) Huir 3) Usar botiquín");
                            int accion = scaner.nextInt();

                            if (accion == 1) {
                                int dañoPersonaje = (int) (Math.random() * habilidad) + 1;
                                vidaZombie -= dañoPersonaje;
                                System.out.println("¡Has atacado al zombi y le has hecho " + dañoPersonaje + " de daño!");
                            } else if (accion == 2) {
                                huir = true;
                                System.out.println("¡Has decidido huir del combate!");
                                System.out.println("¡Has huido del combate! Pierdes 5 de vida.");
                                vidaPersonaje -= 5;
                            } else if (accion == 3 && botiquines > 0) {
                                vidaPersonaje += 20;
                                botiquines--;
                                System.out.println("¡Has usado un botiquín y recuperado 20 de vida!");
                            } else {
                                System.out.println("Opción inválida o no tienes botiquines.");
                            }

                              if (vidaZombie > 0 && !huir) {
                                        int danoZombie = 5 + (int) (Math.random() * 11);   // entre 5 y 15
                                        vidaPersonaje -= danoZombie;
                                        System.out.println("El zombi te muerde: -" + danoZombie);
                                      }


                        }
                    }
                
                
                
                
  


                             }  } while (experienciaTotalDia < 100);
           
                 
                   System.out.println("Dia" + i + "Completado!");
           
      




        
            } 

    }

}
