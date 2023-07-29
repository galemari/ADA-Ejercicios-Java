import java.util.Scanner;
public class Perro {
    //2 caracteristicas
    private String nombre;
    private int edad;
    // Constructor para crear un objeto Perro con características obligatorias
    public Perro(String nombre, int edad){
        this.nombre=nombre;
        this.edad = edad;
    }
    //Metodos adicionales para objeto Perro
    public void ladrar(){
        System.out.println("Guau guau!");
    }
    public void correr() {
        System.out.println(nombre + " está corriendo.");
    }

    // Getters y setters para acceder y modificar las características
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public static void main(String[] args) {
        /*
        * - Definir la clase Perro, con sus características, métodos y mínimo 2 características
            obligatorias al momento de instanciar un objeto de tipo perro.
            - Definir la clase Gato, con sus características, métodos y mínimo 2 características
            obligatorias al momento de instanciar un objeto de tipo gato.*/
        //definiendo las caracteristicas


}
}
