import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Escribir un programa en Java que muestre por pantalla un mensaje de Bienvenida a un usuario.
        * Por ejemplo: “Hola, bienvenido al sistema”.
        * */

        System.out.println("Hola, bienvenid@ al sistema.");

        /*
        * Una vez logrado esta primera parte, permitir que se almacene el nombre del usuario en una variable y se muestre el mismo en el mensaje.
        * Por ejemplo: “Hola Eduardo, bienvenida al sistema”.
        * */

        //Declaración de variables
        String userName;
        Scanner scanner = new Scanner(System.in);

        //Solicitud del nombre
        System.out.println("¿Cuál es su nombre?");
        userName = scanner.nextLine();

        //Resultado impreso por pantalla
        System.out.println("Hola " + userName + ", ¡bienvenid@ al sistema!");
    }
}