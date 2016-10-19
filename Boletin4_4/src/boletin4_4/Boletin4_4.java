
package boletin4_4;

public class Boletin4_4 {

    public static void main(String[] args) {
        Restaurante rest1 = new Restaurante(); //instanciar objeto
        rest1.añadirPulpo(78); //añadir valor pulpo
        rest1.mostrarPulpo(); //mostrar valor pulpo
        rest1.añadirPatatas(16); //añadir valor patatas
        rest1.mostrarPatatas(); //mostrar valor patatas
        rest1.calcularPersonas(); //utilizar método para calculas el número de personas
        System.out.println("Cantidad personas = "+rest1.calcularPersonas()); //mostrar resultado
    }
    
}
