import java.util.Random;

/**
 * Modela un dado
 * 
 * @author (Roberta Ivanna Pineda Diaz) 
 * @version (1.0)
 */
public class Dado
{
    //ATRIBUTOS
    private int caras;
    private int caraActual;
    
    //CONSTRUCTOR
    public Dado(){
        caras= 6;
        lanzar();
    }
    
    
    public Dado(int cantidadCaras){
        caras= cantidadCaras;
        lanzar();
    }
    public int getcaras(){
        return caras;
    }
    
    
    public int getCaraActual(){
        return caraActual;
    }
    public int lanzar(){
        Random rmd= new Random();
        caraActual= rmd.nextInt(6)+1;
        return caraActual;
    }
    public String toString(){
        return("Dado: "+caraActual);
    }
}