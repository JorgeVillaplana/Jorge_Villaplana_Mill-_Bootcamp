import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Imagina que eres un cajero en un supermercado.
        * Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente.
        *
        * Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios
        * hasta que el usuario decida finalizar. Luego, muestra el total de la compra que debe abonar.
        * */

        System.out.println("Nueva cuenta de cliente:\nIngrese un precio de 0€ o menor para terminar de acumular en el total de la cuenta.");

        //Declaración de variables
        double precio = 1, total = 0;
        int contador = 0;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Hacemos un bucle para el ingreso de precios
        while ( precio > 0 ){
            System.out.println("Ingrese el precio del producto: ");
            precio = scanner.nextDouble();
            if(precio > 0) {
                total += precio;
                contador++;
            }
            System.out.println("Total hasta el momento: "+total);
        }

        //Para que el resultado quede redondeado
        total = BigDecimal.valueOf(total).setScale(2, RoundingMode.HALF_UP).doubleValue();

        //Mostramos el total
        System.out.println("Cantidad de artículos: " + contador);
        System.out.println("Total: " + total + "€");
    }
}