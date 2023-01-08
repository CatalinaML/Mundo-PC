
package main;

import manejoArchivo.ManejoArchivo;

public class Main {
    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
        //ManejoArchivo.crearArchivo(nombreArchivo);
        
        //ManejoArchivo.agregarArchivo(nombreArchivo, "Adios desde JAVA");
        
        ManejoArchivo.leerArchivo(nombreArchivo);
    }
}
