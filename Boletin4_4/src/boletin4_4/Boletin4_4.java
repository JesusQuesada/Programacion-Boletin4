
package boletin4_4;

public class Boletin4_4 {

    public static void main(String[] args) {
        Restaurante rest1 = new Restaurante();
        rest1.añadirPulpo(78);
        rest1.mostrarPulpo();
        rest1.añadirPatatas(16);
        rest1.mostrarPatatas();
        rest1.calcularPersonas();
        System.out.println("Cantidad personas = "+rest1.calcularPersonas());
    }
    
}
