/*Ejercicio 5: Juego de Piedra, Papel o Tijera
Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
elige una opción al azar y determina quién gana. Imprime el resultado del juego.*/

import java.util.Scanner;
import java.util.Random;

public class ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nro;

        System.out.println("Ingrese un nro: piedra = 1; papel = 2; tijera = 3: ");
        nro = sc.nextInt();

        Random random = new Random();
        int numeroAl = random.nextInt(4)+1;

        if(numeroAl==1){
            System.out.printf("El programa eligió piedra: %d\n",numeroAl);
        }else if(numeroAl==2){
            System.out.printf("El programa eligió papel: %d\n",numeroAl);
        }else if(numeroAl==3){
            System.out.printf("El programa eligió tijera: %d\n",numeroAl);
        }

        if(nro==1){
            if(numeroAl==1){
                System.out.println("Empate ");
            }
            if(numeroAl==2){
                System.out.println("Perdi, papel envuelve piedra ");
            }
            if(numeroAl==3){
                System.out.println("Gane, piedra mata tijera ");
            }
        }
        if(nro==2){
            if(numeroAl==1){
                System.out.println("Gane, papel envuelve piedra ");
            }
            if(numeroAl==2){
                System.out.println("Empate ");
            }
            if(numeroAl==3){
                System.out.println("Perdi, tijera corta papel");
            }
        }
        if(nro==3){
            if(numeroAl==1){
                System.out.println("Perdi, piedra mata tijera ");
            }
            if(numeroAl==2){
                System.out.println("Gane, tijera corta papel");
            }
            if(numeroAl==3){
                System.out.println("Empate");
            }
        }

        // Cerrar el escáner
        sc.close();
    }
}


