package notaaprobado;
import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Representar la superación de un examen considerando >=5, aprobado
 *
 */

public class NotaAprobado {

    public static void main(String[] args) {
        int nota;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca nota a analizar:");
        nota = entrada.nextInt();
        if (nota > 5) {
            System.out.println("Prueba superada ");
        }
    }

}
