public class TORTUGA {
    String apodo;
    int altura;
    //Constructor
    public TORTUGA(String apodo, int altura){
        this.apodo = apodo;
        this.altura = altura;
    }
    //Metodos personalizados
    public void mostrarApodo(){
        System.out.println("Apodo de la tortuga: " + apodo);
    }
    public void mostrarAltura(){
        System.out.println("Altura de la tortuga: " + altura);
    }
}
