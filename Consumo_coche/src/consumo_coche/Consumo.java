
package consumo_coche;

public class Consumo {
    //declaro atributos
    private float kilometros,litros,velocidadMedia,precioGasolina;
    //constructores
    public Consumo(){
        kilometros = 0;
        litros = 0;
        velocidadMedia = 0;
        precioGasolina = 0;
    }
    public Consumo(float km, float lt, float vMed, float pGas){
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
    public void setKilómetros(float km){
        kilometros = km;
    }
    public void setLitros(float lt){
        litros = lt;
    }
    public void setVelocidadMedia(float vMed){
        velocidadMedia = vMed;
    }
    public void setPrecioGasolina(float pGas){
        precioGasolina = pGas;
    }
    public void mostrar(){
        System.out.println("Velocidad media = "+velocidadMedia);
    }    
}
    
