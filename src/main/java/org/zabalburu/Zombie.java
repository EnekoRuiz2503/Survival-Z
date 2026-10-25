package org.zabalburu;

public class Zombie {

    private String tipo;
    private int vida;



    
    public Zombie(String tipo, int vida) {
        int opcion = (int) (Math.random() * 3);

        switch (opcion) {
            case 0 -> {
                this.tipo = "Caminante";
                this.vida = 20;
            }
            case 1 -> {
                this.tipo = "Corredor";
                this.vida = 35;
            }
            case 2 -> {
                this.tipo = "Tanque";
                this.vida = 50;
            }
        }
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




    @Override
    public String toString() {
        return "Zombie [tipo=" + tipo + ", vida=" + vida + "]";
    }
    
    
    
    
}
