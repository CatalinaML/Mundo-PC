
package Clases;

public class DispositivoEntrada {
    //Atributos
    private String tipoEntrada;
    private String marca;
    
    //Constructor
    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }
    
    //Getters y Setters
    
    //Metodos

    @Override
    public String toString() {
        return "\ntipo de entrada: " + this.tipoEntrada + 
                "\nmarca=" + this.marca;
    }
  
}
