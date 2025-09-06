
/**
 * Dibuja un dado
 * 
 * @author (Roberta Ivanna Pineda Diaz) 
 * @version (1.0)
 */
public class DadoGrafico
{
    //declarar el cuadrado que corresponde a una cara del dado
    private Square cuadrado;

    //cada circulo corresponde a un punto que puede haber en una misma cara
    private Circle punto1;
    private Circle punto2;
    private Circle punto3;
    private Circle punto4;
    private Circle punto5;
    private Circle punto6;
    private Circle punto7;
    private Circle punto8;
    private Circle punto9;
    
    //atributos
    int posicionX;
    int posicionY;
    
    public DadoGrafico(int posicionX, int posicionY){
        
        this.posicionX= posicionX;
        this.posicionY= posicionY;

        //DEFINIR EL CUADRADO
        //parametros: int size,int x,int y,String color,boolean esV
        cuadrado= new Square(105,posicionX,posicionY,"yellow",true);
        cuadrado.makeVisible();
        
        
        // DEFINIR POSICION DE CADA PUNTO
        //parametros: int diameter,int x, int y,String color
        punto1= new Circle(15,cuadrado.getXposition()+15,cuadrado.getYposition()+15,"red");
        punto2= new Circle(15,cuadrado.getXposition()+45,cuadrado.getYposition()+15,"red");
        punto3= new Circle(15,cuadrado.getXposition()+75,cuadrado.getYposition()+15,"red");
        punto4= new Circle(15,cuadrado.getXposition()+15,cuadrado.getYposition()+45,"red");
        punto5= new Circle(15,cuadrado.getXposition()+45,cuadrado.getYposition()+45,"red");
        punto6= new Circle(15,cuadrado.getXposition()+75,cuadrado.getYposition()+45,"red");
        punto7= new Circle(15,cuadrado.getXposition()+15,cuadrado.getYposition()+75,"red");    
        punto8= new Circle(15,cuadrado.getXposition()+45,cuadrado.getYposition()+75,"red");
        punto9= new Circle(15,cuadrado.getXposition()+75,cuadrado.getYposition()+75,"red");
    }
        

    public void dibujarCara(int cara){

        switch(cara){
            case 1:
                punto5.makeVisible();
                break;
            case 2:
                punto3.makeVisible();
                punto7.makeVisible();
                break;
            case 3:
                punto1.makeVisible();
                punto5.makeVisible();
                punto9.makeVisible();
                break;
            case 4:
                punto1.makeVisible();
                punto3.makeVisible();
                punto7.makeVisible();
                punto9.makeVisible();
                break;
            case 5:
                punto1.makeVisible();
                punto3.makeVisible();
                punto5.makeVisible();
                punto7.makeVisible();
                punto9.makeVisible();
                break;
            case 6:
                punto1.makeVisible();
                punto2.makeVisible();
                punto3.makeVisible();
                punto7.makeVisible();
                punto8.makeVisible();
                punto9.makeVisible();
                break;
        }
    }
}