
package consumo_coche;

public class Consumo_coche {

    public static void main(String[] args) {
        //instanciar objeto
        Consumo coche1 = new Consumo();
        coche1.setLitros(50f);
        coche1.setPrecioGasolina(1.57f);
        
        Consumo coche2 = new Consumo(100f,50f,80f,1.57f);
        System.out.println("Consumo medio = "+coche2.consumoMedio());
        coche2.setLitros(75f);
        coche2.mostrar();
    }
    
}
