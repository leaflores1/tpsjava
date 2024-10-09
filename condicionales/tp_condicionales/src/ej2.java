/*Ejercicio 2: Calculadora de Descuentos
Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
(estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
15% para jubilados. Imprime el precious final después del descuento*/

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio=0;
        double newprecio=0;

        System.out.println("Escriba la categoría del cliente\n" +
                "(estudiante, adulto, jubilado): ");
        String categoria = sc.next();

        System.out.println("ingrese el precio del producto: ");
        precio = sc.nextFloat();


        if(categoria.equals("estudiante")){
            newprecio = precio * 0.1 ;
            System.out.println("El descuento aplicado es del 10% por lo tanto el precio queda en: "+newprecio);
        }else if(categoria.equals("adulto")){
            newprecio = precio * 0.05;
            System.out.println("El descuento aplicado es del 5% por lo tanto el precio queda en:"+newprecio);
        }else if(categoria.equals("jubilado")){
            newprecio = precio * 0.15;
            System.out.println("El descuento aplicado es del 15% por lo tanto el precio queda en:"+newprecio);
        }

        // Cerrar el escáner
        sc.close();
    }
}
