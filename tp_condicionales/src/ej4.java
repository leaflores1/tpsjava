/*Ejercicio 4: Calculadora de IMC con Recomendaciones
Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
peso, peso normal, sobrepeso, obesidad). */
import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double peso, altura, imc;

        // Solicitar el peso y la altura al usuario
        System.out.println("Ingrese su peso en kilogramos: ");
        peso = sc.nextDouble();
        System.out.println("Ingrese su altura en metros: ");
        altura = sc.nextDouble();

        // Calcular el IMC
        imc = peso / (altura * altura);

        // Mostrar el resultado del IMC
        System.out.printf("Su índice de masa corporal (IMC) es: %.2f%n", imc);

        // Recomendación basada en el IMC
        if (imc < 18.5) {
            System.out.println("Usted tiene bajo peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Usted tiene un peso normal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Usted tiene sobrepeso.");
        } else {
            System.out.println("Usted tiene obesidad.");
        }

        // Cerrar el escáner
        sc.close();
    }
}

