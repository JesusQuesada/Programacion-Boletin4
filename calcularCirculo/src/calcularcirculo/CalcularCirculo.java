
package calcularcirculo;

public class CalcularCirculo {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(); //instanciar objeto
        circulo1.setRadio(5); //añadir valor radio
        double res1 = circulo1.calcularArea(); //utilizar método para calcular el area
        double res2 = circulo1.calcularLongitud(); //utilizar método para calcular la longitud
        System.out.println("Area = "+res1+ "Longitud = "+res2); //mostrar resultado
    }
    
}
