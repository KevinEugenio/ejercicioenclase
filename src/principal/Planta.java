
package principal;

public class Planta extends SerVivo {
    private String tipo;

    public Planta(String tipo, int tamaño, int edad) {
        super(tamaño, edad);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    @Override
   public String toString(){
        return"El tipo de planta es: "+tipo+"\nSu tamaño: "+tamaño+"mts"+"\nsu edad es: "+edad+" años\n";
    }
}
