
package boletin4_4;

public class Restaurante {
    //atributos
    private int pulpo,patatas;
    
    //métodos de acceso
    public void añadirPulpo(int plp){
        pulpo = plp;
    }
    public void añadirPatatas(int ptt){
        patatas = ptt;
    }
    public int calcularPersonas(){
        return (pulpo/2+patatas)/3;
    }
    public void mostrarPulpo(){
        System.out.println("Kilos de pulpo ="+pulpo);
    }
    public void mostrarPatatas(){
        System.out.println("Kilos de patatas ="+patatas);
    }
    
}
