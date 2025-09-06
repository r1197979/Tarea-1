
/**
 * Juego de tres dados. Se tiran los tres dados.
 * Gana el jugador que tiene 3 valores iguales o 
 * la suma de los dados es mayor a 14.
 * 
 * @author (RIPD) 
 * @version (1.0)
 */
public class JuegoDado
{
    private Dado dado1;
    private Dado dado2;
    private Dado dado3;
    
    public JuegoDado(){
        dado1= new Dado();
        dado2= new Dado();
        dado3= new Dado();
    }
    
    public void lanzar3Dados(){
        dado1.lanzar();
        dado2.lanzar();
        dado3.lanzar();
    }
    public boolean sonLos3Iguales(){
        if(dado1.getCaraActual()==dado2.getCaraActual() && dado2.getCaraActual()==dado3.getCaraActual()){
            return true;
        }else{
            return false;
        }
    }
    public int suma3Dados(){
        return dado1.getCaraActual()+dado2.getCaraActual()+dado3.getCaraActual();
    }
    public boolean haGanado(){
        if(suma3Dados() >14){
            return true;
        }else if(sonLos3Iguales() == true){
            return true;
        }else{
            return false;
        }
    }
    
    
    /*
    public void jugar(){
        lanzar3Dados();
        
        System.out.println("*** RESULTADOS ***");
        System.out.println(dado1);
        System.out.println(dado2);
        System.out.println(dado3);
        System.out.println("Suma de los dados: "+suma3Dados());
        if(haGanado()==true){
           System.out.println("Has ganado!!!"); 
        }else{
            System.out.println("Has perdido");
        }
        //String resultado= haGanado()? "Felicidades ganaste!" : "Perdiste";
        //System.out.println(resultado);
    }
    */
   
   
    // getters para los dados, se necesita el valor para la clase Integrador
    public Dado getDado1(){
        return dado1;
    }
    public Dado getDado2(){
        return dado2;
    }
    public Dado getDado3(){
        return dado3;
    }
}