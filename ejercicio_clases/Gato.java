public class Gato {
    private String nombre;
    private String color;

    //constructor
    public Gato (String nombre, String color){
        this.nombre=nombre;
        this.color=color;
    }
    //metodo adicional
    public void maullar(){
        System.out.println("Miau miau");
    }
    public void dormir(){
        System.out.println( nombre + " está durmiendo");
    }
    //getters y setters

    public static void main(String[] args) {


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
