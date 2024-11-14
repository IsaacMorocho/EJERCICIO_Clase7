public class MASCOTAS {
    private String tipo;
    private String color;

    public MASCOTAS(String tipo, String color) {
        this.tipo = tipo;
        this.color = color;
    }

    public MASCOTAS() {
    }

    public void mostrarTipo() {
        System.out.println("Tipo: " + tipo);
    }

    public void mostrarColor() {
        System.out.println("Color: " + color);
    }
    //Metodo personalizado
    public void mostrarMascota(){
        System.out.println("El tipo de mascota es: "+tipo+" y su color es: "+color);
    }
}
