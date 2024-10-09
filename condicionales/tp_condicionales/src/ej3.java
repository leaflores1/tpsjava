/*Ejercicio 3: Sistema de Recomendación de Libros
Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
ciencia ficción) y luego recomiende un libro basado en su elección.*/

import java.util.Scanner;

public class ej3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba su genero de libro favorito fantasía, misterio, romance,\n" +
                "ciencia ficción)");

        String pelicula = sc.next();

        if(pelicula.equals("fantasia")){
            System.out.println("Mira --> El señor de los anillos");
        }else if(pelicula.equals("misterio")){
            System.out.println("Mira --> Harry potter");
        }else if(pelicula.equals("romance")){
            System.out.println("Mira --> Antes de ti");
        }else if(pelicula.equals("ciencia")){
            System.out.println("Mira --> Mundos posibles");
        }

        // Cerrar el escáner
        sc.close();
    }
}
