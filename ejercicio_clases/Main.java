public class Main {
    public static void main(String[] args) {

        // Crear un objeto Perro con características obligatorias
        Perro perro1 = new Perro("Fido", 3);
        System.out.println("Nombre del perro: " + perro1.getNombre());
        System.out.println("Edad del perro: " + perro1.getEdad());
        Perro perro2 = new Perro("Lisa",5);
        System.out.println("Nombre del perro: " + perro2.getNombre());
        System.out.println("Edad del perro: " + perro2.getEdad());
        perro1.ladrar();
        perro1.correr();

        //Crear un objeto Gato con caracteristicas obligatorias
        Gato gato1= new Gato("Gotita","Blanco con negro");
        System.out.println("color de " + gato1.getNombre() +  " es " + gato1.getColor());
        gato1.maullar();
    }
}