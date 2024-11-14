public class Main {
    public static void main(String[] args) {
        System.out.println("CLASE PERRO");
        PERRO p1= new PERRO();
        p1.mostrarPerro();
        p1.mostrarPerro2();

        System.out.println("CLASE GATO");
        GATO g1= new GATO("Montes","Gris");
        g1.mostrarNombreG();
        g1.mostrarPesoG();
        g1.mostrarMascota();

        System.out.println("CLASE TORTUGA");
        TORTUGA t1= new TORTUGA("Popeye",1);
        t1.mostrarAltura();
        t1.mostrarApodo();

        System.out.println("CLASE CONEJO");
        CONEJO c1= new CONEJO("Domesticado","Blanco","Bosque",12);
        c1.mostrarHabitat();
        c1.mostrartamañoOrejas();
        c1.mostrarMascota();

        System.out.println("CLASE HAMSTER");
        HAMSTER h1= new HAMSTER();
        h1.setTamaño();
        h1.setEdad();
        h1.mostrarTamañoH(0.45);
        h1.mostrarEdadH(3);
    }
}
