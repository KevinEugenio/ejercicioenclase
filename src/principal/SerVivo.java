
package principal;


public abstract class SerVivo {
    int tamaño;
    int edad;

    public SerVivo(int tamaño, int edad) {
        this.tamaño = tamaño;
        this.edad = edad;
    }

    public int getTamaño() {
        return tamaño;
    }

    public int getEdad() {
        return edad;
    }
}
