
package calcularcirculo;

public class CalcularCirculo {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        circulo1.setRadio(5);
        double res1 = circulo1.calcularArea();
        double res2 = circulo1.calcularLongitud();
        System.out.println("Area = "+res1+ "Longitud = "+res2);
    }
    
}