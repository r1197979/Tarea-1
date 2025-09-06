
/**
 * Integra la mecanica del juego con los elementos visuales
 * 
 * @author (Roberta Ivanna Pineda Diaz) 
 * @version (1.0)
 */
public class Integrador
{

    // dados graficos para dibujar las caras en el canvas,
    // cada dado tiene un grafico correspondiente
    private DadoGrafico dadoGrafico1;
    private DadoGrafico dadoGrafico2;
    private DadoGrafico dadoGrafico3;
    
    //crear juego para poder acceder a sus metodos
    private JuegoDado juego;
    
    public Integrador(){
        juego= new JuegoDado();
        dadoGrafico1= new DadoGrafico(200,20);
        dadoGrafico2= new DadoGrafico(200,200);
        dadoGrafico3= new DadoGrafico(320,200);
    }
    
    public void empezarJuego(){
        // lanzamiento de dados
        juego.lanzar3Dados();
        
        // acceder a los dados para conseguir los resultados que fueron lanzados
        int primerDado= juego.getDado1().getCaraActual();
        int segundoDado= juego.getDado2().getCaraActual();
        int tercerDado= juego.getDado3().getCaraActual();
        
        // mandarlos a dibujar
        dadoGrafico1.dibujarCara(primerDado);
        dadoGrafico2.dibujarCara(segundoDado);
        dadoGrafico3.dibujarCara(tercerDado);
        
        // resultados en consola
        System.out.println("*** RESULTADOS ***");
        System.out.println(juego.getDado1().getCaraActual());
        System.out.println(juego.getDado2().getCaraActual());
        System.out.println(juego.getDado3().getCaraActual());
        System.out.println("Suma de los dados: "+ juego.suma3Dados());
        
        // logica para analizar si cumple alguna de las condiciones para ganar
        if(juego.haGanado() == true){
           System.out.println("Has ganado!!!");
        }else{
            System.out.println("Intenta de nuevo");
        }
    }
}