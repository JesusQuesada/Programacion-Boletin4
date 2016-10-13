
package ejemplorectangulo1;

public class EjemploRectangulo1 {

    public static void main(String[] args) {
        //instanciar objeto
        Rectangulo rec1 = new Rectangulo(5f,10f);
        rec1.mostrar();
        rec1.setAltura(7f);
        rec1.mostrar();
        
        Rectangulo rec2 = new Rectangulo();
        rec2.setBase(14.2f);
        rec2.setAltura(6.9f);
        rec1.calcularArea();
        float res = rec1.calcularPerimetro();
        System.out.println("perimetro = "+res);
    }
    
}
