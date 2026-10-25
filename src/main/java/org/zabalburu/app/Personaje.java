package org.zabalburu.app;

public class Personaje {

        private String nombre;
        private String tipo;
        private int vidaPersonaje;
        private int habilidad;
        private int botiquines;



        
  public Personaje(String nombre, String tipo, int vidaPersonaje, int habilidad, int botiquines) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.vidaPersonaje = vidaPersonaje;
            this.habilidad = habilidad;
            this.botiquines = botiquines;
        }



   
        public void mostrarInfo() {
            System.out.println("Nombre: " + this.nombre);
            System.out.println("Tipo: " + this.tipo);
            System.out.println("Vida: " + this.vidaPersonaje);
            System.out.println("Habilidad: " + this.habilidad);
             System.out.println("Botiquines: " + this.botiquines);


             if(this.vidaPersonaje <= 30) {
                System.out.println("CRÍTICO");
            } else if (this.vidaPersonaje> 30 && this.vidaPersonaje <= 70) {
                System.out.println("HERIDO");
            } else {
                System.out.println("ESTABLE");
            }
  }







        public String getNombre() { return nombre; }




        public void setNombre(String nombre) {
            this.nombre = nombre;
        }




        public String getTipo() {
            return tipo;
        }




        public void setTipo(String tipo) {
            this.tipo = tipo;
        }




        public int getVida() {
            
       return vidaPersonaje;
        }




        public void setVida(int vida) {
            this.vidaPersonaje = vida;
        }




        public int getHabilidad() {
            return habilidad;
        }




        public void setHabilidad(int habilidad) {
            this.habilidad = habilidad;
        }




        public int getBotiquines() {
            return botiquines;
        }




        public void setBotiquines(int botiquines) {
            this.botiquines = botiquines;
        }




        @Override
        public String toString() {
            return "Personaje [nombre=" + nombre + ", tipo=" + tipo + ", vida=" + vidaPersonaje + ", habilidad=" + habilidad
                    + ", botiquines=" + botiquines + "]";
        }



    





}
