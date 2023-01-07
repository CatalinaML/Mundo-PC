
package Clases;

public class Orden {
    //Atributos
    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;
    
    //Constructor

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }
    
    //Metodos
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < MAX_COMPUTADORAS){
            computadoras[contadorComputadoras++] = computadora;
        }else{
            System.out.println("Limite de computadoras sobrepasado: " + MAX_COMPUTADORAS);
        }
    }
    
    
    public void mostrarOrden(){
        System.out.println("Id de la orden: " + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i].toString());            
        }
    }
}
