
package principal;

public class SerHumano extends SerVivo implements GustoMusical{
    private String genero;

    public SerHumano(String genero, int tamaño, int edad) {
        super(tamaño, edad);
        this.genero = genero;
    }

    @Override
    public String obtenertipomucica() {
        return "rock";
    }

    
}
