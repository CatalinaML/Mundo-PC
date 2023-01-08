
package manejoArchivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManejoArchivo {
    
    public static void crearArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo); //crea el archivo
        try {
            //la clase PrintWriter que es la que creará el archivo en el disco duro
            //La clase PrintWriter se usa para imprimir líneas completas, con los métodos print() y println()
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Se creo el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void escribirArchivo(String nombreArchivo, String contenido){ //sobreescribe el archivo
        File archivo = new File(nombreArchivo); //crea el archivo
        try {
            PrintWriter salida = new PrintWriter(archivo);
            
            salida.println(contenido);
            
            salida.close();
            System.out.println("Se agrego al archivo");   
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void agregarArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo); //crea el archivo
        try {
            //La clase FileWriter se utiliza para escribir información a un archivo
            /*
            anexar información a un archivo ya creado.
La diferencia con el ejercicio anterior es la llamada al constructor de la
clase FileWriter, ahora le proporcionamos una bandera true, que significa
que la información se va a agregar a la ya existente, y con ello no se
pierde lo que ya se encuentra en el archivo, sino que anexa la
información proporcionada.

            */
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            
            salida.println(contenido);
            
            salida.close();
            System.out.println("Se agrego al archivo");   
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void leerArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        try {
            /*
            La clase FileReader se utiliza para leer caracteres.
La clase BufferedReader se utiliza para leer líneas completas.
            */
            var entrada = new BufferedReader(new FileReader(archivo));
            
            var lectura = entrada.readLine();
            while(lectura != null){
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
    }
}
