
package consumo_coche;

public class Consumo_coche {

    public static void main(String[] args) {
        //instanciar objeto
        Consumo consumo1 = new Consumo();
        consumo1.setLitros(50f);
        consumo1.setPrecioGasolina(1.57f);
        
        Consumo consumo2 = new Consumo(100f,50f,80f,1.57f);
        System.out.println("Consumo medio = "+consumo2.consumoMedio());
        consumo2.setLitros(75f);
        consumo2.mostrar();
    }
    
}
