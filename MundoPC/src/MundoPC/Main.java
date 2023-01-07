
package MundoPC;

import Clases.Computadora;
import Clases.Monitor;
import Clases.Orden;
import Clases.Raton;
import Clases.Teclado;

public class Main {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP" , 13);
        Monitor monitorLenovo = new Monitor("Lenovo", 20);
        Teclado tecladorLenovo = new Teclado("bluetooth", "Lenovo");
        Teclado tecladoHP = new Teclado("usb", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Raton ratonLenovo = new Raton("usb", "Lenovo");
        
        Computadora compHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        Computadora compLenovo = new Computadora("Computadora Lenovo", monitorLenovo, tecladorLenovo, ratonLenovo);
        
        Orden orden = new Orden();
        
        orden.agregarComputadora(compHP);
        orden.agregarComputadora(compLenovo);
        orden.mostrarOrden();
    }
}
