
package calcularcirculo;

public class Circulo {
    //atributos
    private double radio,pi;
    //constructores
    public Circulo(){
        radio = 0;
        pi = 3.14;
    }
    public Circulo(double ra, double pi){
        radio = ra;
        pi = 3.14;
    }
    //métodos de acceso
    public double getRadio(){
        return radio;
    }
    public double getPi(){
        return pi;
    }
    public void setRadio(double ra){
        radio = ra;
    }
    public void setPi(double pi){
    }
    public double calcularArea(){
        return (Math.pow((pi*radio),2));
    }
    public double calcularLongitud(){
        return (2*pi*radio);
    }
     
}
