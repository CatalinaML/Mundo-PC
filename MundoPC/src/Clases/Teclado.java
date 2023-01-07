
package Clases;

public class Teclado extends DispositivoEntrada{
    //Atributos
    private int idTeclado;
    private static int contadorTeclados;
    
    //Constructor
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return "\nTeclado" + 
                "id teclado:" + this.idTeclado + 
                super.toString();
    }
    
    
}
