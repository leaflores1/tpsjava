import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar al usuario cuántas horas puede estudiar al día
        System.out.print("¿Cuántas horas puedes estudiar al día?: ");
        int horasPorDia = sc.nextInt();
        int totalHorasSemanales = horasPorDia * 7; // Calcular horas de estudio semanales

        // Distribuir las horas en diferentes materias
        System.out.println("Plan de estudio semanal:");
        System.out.println("Matemáticas: " + totalHorasSemanales * 0.25 + " horas");
        System.out.println("Programación: " + totalHorasSemanales * 0.30 + " horas");
        System.out.println("Física: " + totalHorasSemanales * 0.20 + " horas");
        System.out.println("Electrónica: " + totalHorasSemanales * 0.15 + " horas");
        System.out.println("Estudio libre: " + totalHorasSemanales * 0.10 + " horas");

        // Cerrar el escáner
        sc.close();
    }
}
