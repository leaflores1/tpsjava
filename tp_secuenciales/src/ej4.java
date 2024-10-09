import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar el estado de ánimo al usuario
        System.out.println("¿Cuál es tu estado de ánimo? (feliz, triste, enérgico, relajado): ");
        String estadoAnimo = sc.nextLine().toLowerCase(); // Convertir a minúsculas para facilitar la comparación

        // Sugerir lista de reproducción según el estado de ánimo
        switch (estadoAnimo) {
            case "feliz":
                System.out.println("Lista de reproducción para cuando estás feliz:");
                System.out.println("- Pharrell Williams - Happy");
                System.out.println("- Justin Timberlake - Can't Stop the Feeling");
                System.out.println("- Katrina and the Waves - Walking on Sunshine");
                break;

            case "triste":
                System.out.println("Lista de reproducción para cuando estás triste:");
                System.out.println("- Adele - Someone Like You");
                System.out.println("- Coldplay - Fix You");
                System.out.println("- Radiohead - Creep");
                break;

            case "enérgico":
                System.out.println("Lista de reproducción para cuando estás enérgico:");
                System.out.println("- Survivor - Eye of the Tiger");
                System.out.println("- AC/DC - Thunderstruck");
                System.out.println("- The White Stripes - Seven Nation Army");
                break;

            case "relajado":
                System.out.println("Lista de reproducción para cuando estás relajado:");
                System.out.println("- Norah Jones - Don't Know Why");
                System.out.println("- Jack Johnson - Banana Pancakes");
                System.out.println("- John Mayer - Gravity");
                break;

            default:
                System.out.println("Estado de ánimo no reconocido. Inténtalo de nuevo.");
                break;
        }

        // Cerrar el escáner
        sc.close();
    }
}
