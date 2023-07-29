
import java.util.Scanner;
import java.util.regex.Pattern;

// Programa Java para validar una contraseña en Java
public class Usuario {

    private static final String PASSWORD_REGEX =
            "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,16}$";

    private static final Pattern PASSWORD_PATTERN =
            Pattern.compile(PASSWORD_REGEX);

    public static void main(String[] args) {
        /*
        Escribir un algoritmo que valide si un usuario y una contraseña ingresados por el
        usuario corresponden a los almacenados en constantes. Al final se debe mostrar
        un mensaje al usuario indicando que el usuario y contraseña son correctos.
        * */
        Scanner sc = new Scanner(System.in);

        //usuario
        System.out.println("Ingrese el usuario, por favor");
        String name = sc.nextLine();
        System.out.println("Ingrese su contraseña, por favor");
        String password = sc.nextLine();
        final String userSaved= name;
        final String passwordSaved = password;

        while (!name.equals(userSaved)||!password.equals(passwordSaved)){
            System.out.println("usuario incorrecto, escriba su usuario nuevamente: ");
            name = sc.nextLine();
            System.out.println("contraseña incorrecta, escriba su contraseña nuevamente: ");
            password = sc.nextLine();
        }

        /*// Validar una contraseña
        if (PASSWORD_PATTERN.matcher(password).matches()) {
            System.out.print("The Password " + password + " es valid");
        }
        else {
            System.out.print("The Password " + password + " no es valida");
        }

        //validar un usuario
        while (PASSWORD_PATTERN.matcher(password).matches()|| !name.equals(name)){
            System.out.println("Usuario o contraseña incorrectos. Intente nuevamente.");
            System.out.println("Ingrese el usuario, por favor");
            name = sc.nextLine();
            System.out.println("Ingrese su contraseña, por favor");
            password = sc.nextLine();
        }*/

    }
}
