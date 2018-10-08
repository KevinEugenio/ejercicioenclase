
package principal;

public class Animal extends SerVivo {
    private String especie;
    private String nombre;

    public Animal(String especie, String nombre, int tamaño, int edad) {
        super(tamaño, edad);
        this.especie = especie;
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getNombre() {
        return nombre;
    }
    @Override
    public String toString(){
        return"la especie del animal es: "+especie+"\nnombre: "+nombre+"\nsu tamaño es: "+tamaño+"mts"
                +"\nsu edad es: "+edad+"años"+"\n";
    }
    
}
