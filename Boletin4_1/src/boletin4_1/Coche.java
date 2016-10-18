
package boletin4_1;

public class Coche {
    private int velocidad;

    public Coche(){
        velocidad = 0;
    }
    public int getVelocidad(){
        return velocidad;
    }
    public void setVelocidad(int vl){
        velocidad = vl;        
    }
    public void acelerar (int acel){
        velocidad = velocidad+acel;
    }
    public void frenar (int frn){
        velocidad = velocidad-frn;
    }
    public void mostrar(){
        System.out.println("velocidad = " +velocidad);
    }
    
}
