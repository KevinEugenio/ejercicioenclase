
package principal;

public class Principal {

  
    public static void main(String[] args) {
       
        SerVivo ser1 = new Animal("Reptil","Serpiente",6,20);
        SerVivo ser2 = new Planta("Frutal",5,3);
        System.out.println("CARACTERISTICAS DEL ANIMAL\n"+ser1.toString());
        System.out.println("CARACTERISTICAS DE LA PLANTA\n"+ser2.toString());
        GustoMusical gusto[]=new GustoMusical[1];
        gusto[0]=new SerHumano("Femenino","Juana",150,15);
        for(GustoMusical gus: gusto){
            System.out.println("CARACTERISTICAS DEL SER HUMANO"+"\n"+gus.toString()+"le gusta la musica: "+gus.obtenertipomucica());
        }
    }
    
}
