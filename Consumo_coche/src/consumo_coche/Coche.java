
package consumo_coche;

public class Coche {
    //declaro atributos
    private float kilometros,litros,velocidadMedia,precioGasolina;
    //constructores
    public Coche(){
        kilometros = 0;
        litros = 0;
        velocidadMedia = 0;
        precioGasolina = 0;
    }
    public Coche(float km, float lt, float vMed, float pGas){
        kilometros = km;
        litros = lt;
        velocidadMedia = vMed;
        precioGasolina = pGas;
    }
    //métodos de acceso
    public float getTiempo(){
        return velocidadMedia/kilometros;
    }
    public float consumoMedio(){
        return litros/kilometros*100;
    }
    public float consumoEuros(){
        return litros/kilometros*100*precioGasolina;
    }
    
}
