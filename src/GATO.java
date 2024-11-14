public class GATO extends MASCOTAS {
    String nombre;
    double peso;
    //CONSTRUCTOR CON PARAMETROS DE LA CLASE PADRE
    public GATO(String tipo, String color) {
        super(tipo,color);
    }
    //METODOS PESONALIZADOS
    public void mostrarNombreG() {
        System.out.println("Nombre: " + nombre);
    }
    public void mostrarPesoG() {
        System.out.println("Peso: " + peso);
    }
}
