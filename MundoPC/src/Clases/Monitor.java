
package Clases;

public class Monitor {
    //Atributos
    private int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;
    
    //Constructor
    public Monitor(String marca, double tamanio) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
    //Getters y Setters

    public int getIdMonitor() {
        return idMonitor;
    }

    public void setIdMonitor(int idMonitor) {
        this.idMonitor = idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    
    
    //Metodos
    @Override
    public String toString() {
        return "\nMonitor" + 
                "\nid monitor=" + idMonitor + 
                "\nmarca=" + marca + 
                "\ntamanio=" + tamanio;
    }
    
}
