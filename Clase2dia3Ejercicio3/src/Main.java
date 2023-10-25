import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        * Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana,
        * calcule la temperatura máxima promedio que hubo.
        *
        *Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día.
        * Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.
        * */

        System.out.println("Programa para calcular la termperatura máxima promedio de una semana.");
        //Definición de variables
        String [] diasSemana= {"Lunes","Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        double [] tempMaximasDia = new double[7];
        double resultado = 0;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Solicitud de datos
        for ( int i = 0 ; i < diasSemana.length ; i++ ){
            System.out.println("Ingrese la temperatura máxima del " + diasSemana[i] + ":");
            tempMaximasDia[i] = scanner.nextDouble();
        }

        //Cálculo de los datos
        //Primero hacemos un sumatorio recorriendo el vector temMaximasDia
        for (double temperatura : tempMaximasDia) {
            resultado += temperatura;
        }
        //Luego hacemos el promedio, usando el sumatorio y el tamaño del vector
        resultado = resultado/ tempMaximasDia.length;

        //Mostramos el resultado por pantalla
        System.out.println("La temperatura promedio de la semana es de " + resultado);
    }
}