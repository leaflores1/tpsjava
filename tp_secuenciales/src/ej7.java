/*Ejercicio 7: Calculadora de Índice de Felicidad
Escribe un programa que pida al usuario varios factores de felicidad (nivel de satisfacción con la
vida, nivel de estrés, nivel de salud, etc.) en una escala del 1 al 10 y luego calcule e imprima un
índice de felicidad basado en esos factores.*/
import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int feliz, salud, estres, eco,total ;


        System.out.println("Escriba su nivel de satisfacion con la vida del 1 al 10: ");
            feliz = sc.nextInt();
        System.out.print("de estres: ");
            estres = sc.nextInt();
        System.out.print("de salud:  ");
            salud = sc.nextInt();
        System.out.print("de estabilidad economica: ");
            eco = sc.nextInt();

            //indice de felicidad (40MAX;0MIN)

        total = feliz + estres + salud + eco;

        if(total==0){
            System.out.print("tu vida es triste");
        }else if(total<=10){
            System.out.print("tu vida no es la mas feliz");
        }else if(total<=20){
            System.out.print("tu vida es normal");
        }else if(total<=30){
            System.out.print("tu vida es feliz pero puede ser mejor");
        }else if(total<=40){
            System.out.print("tu vida esta en su maxima felicidad");
        }






        // Cerrar el escáner
        sc.close();
    }
}
