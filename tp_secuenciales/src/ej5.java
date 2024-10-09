/*Ejercicio 5: Calculadora de Costo de Viaje
Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
calcule e imprima el costo total del viaje.
*/
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float distancia, consumo, precio,total;

        System.out.print("Ingrese distancia en km: ");
            distancia = sc.nextInt();
         System.out.print("consumo de combustible en lts/km: ");
            consumo = sc.nextInt();
        System.out.print("Precio del combustible por litro $/lts:");
            precio = sc.nextInt();

            total = distancia * consumo * precio;

        System.out.print("el costo total del viajes es: $"+total);


        // Cerrar el escáner
        sc.close();
    }
}
