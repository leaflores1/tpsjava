/*Ejercicio 3: Generador de Rutinas de Ejercicio
Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y
duraciones.
*/

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dd, mm, aa;

        // Solicitar la fecha de nacimiento al usuario
        System.out.println("Escriba su nivel de condición física (principiante, intermedio,avanzado): ");
        String nivel = sc.next();

        if(nivel.equals("principiante")){
          System.out.print("Lunes: Espalda/Biceps\n Martes: descanso\n Miercoles:Piernas\n Jueves:descanso\n Viernes: Pecho/triceps\n" +
                  "Sabado: Descanso\n Domingo: Descanso");

        }else if(nivel.equals("intermedio")){
            System.out.print("Lunes: Espalda/Biceps\n Martes: descanso\n Miercoles:Piernas\n Jueves:descanso\n Viernes: Pecho/triceps\n" +
                    "Sabado: pecho/espalda \n Domingo: Descanso");
        }else if(nivel.equals("avanzado")){
            System.out.print("Lunes: Espalda/Biceps\n Martes: Pecho/triceps \n Miercoles:Piernas\nJueves:Espalda/biceps\n Viernes: Pecho/triceps\n" +
                    "Sabado: Brazo completo\n Domingo: Descanso");
        }

        // Cerrar el escáner
        sc.close();
    }
}
