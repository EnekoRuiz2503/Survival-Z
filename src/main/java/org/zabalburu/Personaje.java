package org.zabalburu;

public class Personaje {

        private String nombre;
        private String tipo;
        private int vida;
        private int habilidad;
        private int botiquines;



        
        public Personaje(String nombre, String tipo, int vida, int habilidad, int botiquines) {
            this.nombre = nombre;
            this.tipo = tipo;
            this.vida = vida;
            this.habilidad = habilidad;
            this.botiquines = botiquines;
        }




        public String getNombre() {
            return nombre;
        }




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
            return vida;
        }




        public void setVida(int vida) {
            this.vida = vida;
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
            return "Personaje [nombre=" + nombre + ", tipo=" + tipo + ", vida=" + vida + ", habilidad=" + habilidad
                    + ", botiquines=" + botiquines + "]";
        }



    





}
