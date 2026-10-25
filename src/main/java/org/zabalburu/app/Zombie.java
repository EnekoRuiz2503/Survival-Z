package org.zabalburu.app;

public class Zombie {

    private String tipo;
    private int vidaZombie;



    
    public Zombie(String tipo, int vidaZombie) {
        int opcion = (int) (Math.random() * 3);

        switch (opcion) {
            case 1 :
                this.tipo = "Caminante";
                this.vidaZombie = 20;
                break;
            
            case 2 :
                this.tipo = "Corredor";
                this.vidaZombie = 35;
                break;

            case 3 :
                this.tipo = "Tanque";
                this.vidaZombie = 50;
                break;
            }
    }




    public String getTipo() {
        return tipo;
    }




    public void setTipo(String tipo) {
        this.tipo = tipo;
    }




    public int getVida() {
        return vidaZombie;
    }




    public void setVida(int vidaZombie) {
        this.vidaZombie = vidaZombie;
    }




    @Override
    public String toString() {
        return "Zombie [tipo=" + tipo + ", vida=" + vidaZombie + "]";
    }
    
    
    
    
}
