import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Una recital permite únicamente el ingreso de mayores de 18 años.
        *  Para ello necesita un programa que, a partir de que un usuario ingrese su edad,
        *  determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento.
        *  El programa debe mostrar (según cada caso) un mensaje informando la situación.
        * */

        System.out.println("Programa para indicar si el usuario puede ingresar al recital.");

        //Declaración de variables
        int edad;
        Scanner scanner = new Scanner(System.in);

        //Solicitud de edad
        System.out.println("Por favor, ingrese su edad:");
        edad = scanner.nextInt();

        //Mostramos al usuario si puede o no ingresar al recital.
        if (edad >= 18){
            System.out.println("Gracias, usted puede ingresar al recital. Esperamos que lo disfrute.");
        }else {
            System.out.println("Lo lamentamos pero usted no tiene permitido el ingreso al recital.");
        }
    }
}