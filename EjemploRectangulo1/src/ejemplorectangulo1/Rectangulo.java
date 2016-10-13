
package ejemplorectangulo1;

public class Rectangulo {
    //declaro atributos
    private float base,altura;
    //constructores
    public Rectangulo(){
        base=0;
        altura=0;
    }
    public Rectangulo(float ba,float al){
        base=ba;
        altura=al;
    }
    //métodos de acceso
    public float getBase(){
        return base;
    }
    public void setBase(float ba){
        base = ba;
    }
    public float getAltura(){
        return altura;
    }
    public void setAltura(float al){
        altura = al;
    }
        public void mostrar(){
        System.out.println("base = " +base+ " altura = "+altura);
    }
    public void calcularArea(){
        /*float area = base*altura;
        System.out.println("Area = "+area);*/
        //También: 
        System.out.println("area = "+(base*altura));
    }
    public float calcularPerimetro(){
        /*float perimetro = 2*base+2*altura;
        return perimetro;*/
        //También:
        return (2*base+2*altura);
        
    }
}
