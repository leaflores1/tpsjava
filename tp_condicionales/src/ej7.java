/*Ejercicio 7: Sistema de Recomendación de Actividades
Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
recomiende una actividad basada en su estado de ánimo.*/
import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el estado de ánimo al usuario
        System.out.println("¿Cómo te sientes hoy? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = sc.nextLine().toLowerCase();  // Convertir a minúsculas para evitar problemas de comparación

        // Recomendaciones basadas en el estado de ánimo
        switch (estadoAnimo) {
            case "feliz":
                System.out.println("¡Genial! Te recomendamos salir a caminar, disfrutar del aire libre o pasar tiempo con tus amigos.");
                break;
            case "triste":
                System.out.println("Lo siento. Tal vez ver una película, escuchar música que te guste o escribir sobre tus pensamientos te ayude a sentirte mejor.");
                break;
            case "enérgico":
                System.out.println("¡Estás lleno de energía! Podrías hacer ejercicio intenso, como correr o hacer algún deporte.");
                break;
            case "relajado":
                System.out.println("Qué bien. Te sugerimos leer un libro, meditar o disfrutar de una sesión de yoga.");
                break;
            default:
                System.out.println("Lo siento, no reconozco ese estado de ánimo. Intenta con feliz, triste, enérgico o relajado.");
                break;
        }

        // Cerrar el escáner
        sc.close();
    }
}
