import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        *Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado por pantalla.
        *Recuerda que la fórmula para calcular esto es: (base * altura) / 2 (base por altura dividido dos).
        * */
        System.out.println("Programa para calcular el área de un triángulo.");

        //Declaración de variables
        double base, altura, area;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Solicitud de los parámetros
        System.out.println("Por favor, ingrese la base del triángulo en cm:");
        base = scanner.nextDouble();
        System.out.println("Por favor, ingrese la altura del triángulo en cm:");
        altura = scanner.nextDouble();

        //Cálculo
        area = (base * altura) / 2;

        //Mostramos el resultado por pantalla
        System.out.println("Para un triángulo de base " + base + "cm y altura de " + altura
                + "cm, el área del triángulo resultante es de " + area + "cm2.");
    }
}