/*Ejercicio 1: Sistema de Recomendación de Películas
Escribe un programa que pida al usuario su género de película favorito (acción, comedia, drama,
ciencia ficción) y luego recomiende una película basada en su elección.
*/
import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba su genero de pelicula favorito (acción, comedia, drama,\n" +
                "ciencia ficción): ");

        String pelicula = sc.next();

        if(pelicula.equals("accion")){
            System.out.println("Mira --> Terminator");
        }else if(pelicula.equals("comedia")){
            System.out.println("Mira --> Son como niños");
        }else if(pelicula.equals("drama")){
            System.out.println("Mira --> Manos milagrosas");
        }else if(pelicula.equals("ciencia")){
            System.out.println("Mira --> Interstellar");
        }

        // Cerrar el escáner
        sc.close();
    }
}
