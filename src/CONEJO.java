public class CONEJO extends MASCOTAS{
    String habitat;
    double tamañoOrejas;
    //CONSTRUCTOR CON PARAMETROS DE LA CLASE PADRE E HIJA
    public CONEJO(String tipo,String color, String habitat, int tamañoOrejas){
        super(tipo,color);
        this.habitat = habitat;
        this.tamañoOrejas= tamañoOrejas;
    }
    //Metodos personalizados
    public void mostrarHabitat(){
        System.out.println("Habitat del conejo: " + habitat);
    }
    public void mostrartamañoOrejas(){
        System.out.println("Tamaño de las orejas: " +tamañoOrejas);
    }
}
