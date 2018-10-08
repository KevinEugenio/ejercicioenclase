
package principal;

public class SerHumano extends SerVivo implements GustoMusical{
    private final String genero;
    private final String nombre;

    public SerHumano(String genero, String nombre, int tamaño, int edad) {
        super(tamaño, edad);
        this.genero = genero;
        this.nombre = nombre;
    }

    public String obtenerGenero() {
        return genero;
    }
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public String toString(){
        return"el nombre de la persona es: "+nombre+"\nsu genero es: "+genero+"\nsu edad es: "+edad+"\nsu tamaño es: "+tamaño;
        
    }

    @Override
    public String obtenertipomucica() {
        return "rock";
    }

    
}
