/*Ejercicio 2: Calculadora de Calorías Quemadas
Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en
minutos y el tipo de ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las
calorías quemadas. Utiliza diferentes tasas de calorías quemadas por minuto para cada tipo de
ejercicio.
*/

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int peso, time;
        int cal_quemadas;

        // Solicitar la fecha de nacimiento al usuario
        System.out.println("Escriba su peso en kg");
             peso  = sc.nextInt();
        System.out.print("Ingrese duracion del ej en minutos: ");
             time = sc.nextInt();
        System.out.print("que tipo de ej realizo? (correr, nadar, andar en bicicleta): ");
            String ejercicio = sc.next();

        if(ejercicio.equals("correr")){ //50kcal x minuto
            cal_quemadas = 50 * time;
            System.out.printf("quemaste %d kcal",cal_quemadas);
        }else if(ejercicio.equals("nadar")){
            cal_quemadas = 100 * time;
            System.out.printf("quemaste %d kcal",cal_quemadas);
        }else if(ejercicio.equals("bicicleta")){
            cal_quemadas = 20 * time;
            System.out.printf("quemaste %d kcal",cal_quemadas);
        }

        // Cerrar el escáner
        sc.close();
    }
}
