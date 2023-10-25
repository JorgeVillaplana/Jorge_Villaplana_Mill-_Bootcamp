import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        *Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes operaciones
        * con ellos: suma, resta, multiplicación y división.
        * Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje amigable para el usuario.
        * */
        System.out.println("Programa para calcular diferentes operaciones entre dos números.");

        //Declaración de variables
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double num1, num2, suma, resta, producto, division;

        //Solicitud de los números
        System.out.println("Por favor, ingrese el primer número:");
        num1 = scanner.nextDouble();

        System.out.println("Por favor, ingrese un número distinto de 0.");
        num2 = scanner.nextDouble();

        //Realizamos los cálculos
        suma = num1 + num2;
        resta = num1 - num2;
        producto = num1 * num2;
        division =  num1 / num2;

        //Mostramos los resultados por pantalla
        System.out.println("Operación suma: " + num1 + " + " + num2 + " = " + suma);
        System.out.println("Operación resta: " + num1 + " - " + num2 + " = " + resta);
        System.out.println("Operación multiplicación: " + num1 + " x " + num2 + " = " + producto);
        System.out.println("Operación división: " + num1 + " / " + num2 + " = " + division);
    }
}