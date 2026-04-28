package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        boolean encendido = true;
        Cafetera cafetera = new Cafetera("Xiaomi", 0);

        System.out.println("Bienvenido a la máquina de café. ¿Qué quieres hacer?");
        while(encendido) {
            Scanner scan = new Scanner(System.in);
            System.out.println("1. Echar agua");
            System.out.println("2. Poner cápsula");
            System.out.println("3. Hacer café");
            System.out.println("4. Salir");
            System.out.println("5. Estado máquina");

            int eleccion = 0;
            try {
                eleccion = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduce un número");
                main();

            }
            switch (eleccion) {
                case 1:
                    cafetera.echarAgua();
                    break;
                case 2:
                    cafetera.ponerCapsula();
                    break;
                case 3:
                    cafetera.hacerCafe();
                    break;
                case 4:
                    encendido = false;
                    break;
                case 5:
                    System.out.println(cafetera);
                default:
                    System.out.println("Por favor, elige una opción válida");
            }
        }
        System.out.println("Hasta luego");
    }
}
