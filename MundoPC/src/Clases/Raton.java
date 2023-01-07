
package Clases;

public class Raton extends DispositivoEntrada{
    //Atributos
    private int idRaton;
    private static int contadorRatones;
    
    //Constructor
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }
    
    //Metodos

    @Override
    public String toString() {
        return "\nRaton" + 
                "id raton=" + idRaton + 
                super.toString();
    }
    
    
}
