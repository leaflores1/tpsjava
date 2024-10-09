import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dd, mm, aa;

        // Solicitar la fecha de nacimiento al usuario
        System.out.println("Escriba su fecha de nacimiento en formato DD/MM/AAAA.");
        System.out.print("Ingrese DD: ");
        dd = sc.nextInt();
        System.out.print("Ingrese MM: ");
        mm = sc.nextInt();
        System.out.print("Ingrese AAAA: ");
        aa = sc.nextInt();

        // Mostrar la fecha de nacimiento
        System.out.printf("Su fecha de nacimiento es: %02d / %02d / %04d%n", dd, mm, aa);

        // Determinar el signo del zodiaco según la fecha de nacimiento
        String signo = "";

        if ((mm == 1 && dd >= 20) || (mm == 2 && dd <= 18)) {
            signo = "Acuario";
        } else if ((mm == 2 && dd >= 19) || (mm == 3 && dd <= 20)) {
            signo = "Piscis";
        } else if ((mm == 3 && dd >= 21) || (mm == 4 && dd <= 19)) {
            signo = "Aries";
        } else if ((mm == 4 && dd >= 20) || (mm == 5 && dd <= 20)) {
            signo = "Tauro";
        } else if ((mm == 5 && dd >= 21) || (mm == 6 && dd <= 20)) {
            signo = "Géminis";
        } else if ((mm == 6 && dd >= 21) || (mm == 7 && dd <= 22)) {
            signo = "Cáncer";
        } else if ((mm == 7 && dd >= 23) || (mm == 8 && dd <= 22)) {
            signo = "Leo";
        } else if ((mm == 8 && dd >= 23) || (mm == 9 && dd <= 22)) {
            signo = "Virgo";
        } else if ((mm == 9 && dd >= 23) || (mm == 10 && dd <= 22)) {
            signo = "Libra";
        } else if ((mm == 10 && dd >= 23) || (mm == 11 && dd <= 21)) {
            signo = "Escorpio";
        } else if ((mm == 11 && dd >= 22) || (mm == 12 && dd <= 21)) {
            signo = "Sagitario";
        } else if ((mm == 12 && dd >= 22) || (mm == 1 && dd <= 19)) {
            signo = "Capricornio";
        }

        // Imprimir el signo zodiacal y un mensaje de horóscopo
        System.out.printf("Su signo del zodiaco es: %s%n", signo);
        System.out.println("Este es su horóscopo del día: ¡Hoy es un buen día para hacer algo nuevo y emocionante!");

        // Cerrar el escáner
        sc.close();
    }
}
