
package principal;

public class Animal extends SerVivo {
    private String especie;

    public Animal(String especie, int tamaño, int edad) {
        super(tamaño, edad);
        this.especie = especie;
    }
    
}
