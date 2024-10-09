/*Ejercicio 6: Evaluador de Hábitos Saludables
Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
hábitos saludables basada en estos datos*/
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("¿Cuántas horas al día duerme?: ");
        int horasSueño = sc.nextInt();

        System.out.print("¿Cuántas horas al día hace ejercicio?: ");
        int horasEjercicio = sc.nextInt();

        System.out.print("¿Cuántas comidas saludables consume al día?: ");
        int comidasSaludables = sc.nextInt();

        // Evaluación de hábitos
        if (horasSueño >= 7 && horasEjercicio >= 1 && comidasSaludables >= 3) {
            System.out.println("¡Excelente! Tienes muy buenos hábitos saludables.");
        } else if (horasSueño >= 6 && horasEjercicio >= 0.5 && comidasSaludables >= 2) {
            System.out.println("Tus hábitos son buenos, pero podrías mejorarlos un poco.");
        } else {
            System.out.println("Deberías cuidar más tus hábitos para mejorar tu salud.");
        }

        // Cerrar el escáner
        sc.close();
    }
}
