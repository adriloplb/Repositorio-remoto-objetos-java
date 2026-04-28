package org.example;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Cafetera {
    private String modelo;
    private Integer capacidadDeposito;
    private Integer cantidadAguaActual;
    private Integer capsulas;

    public Cafetera(String modelo, Integer capsulas){
        this.modelo = modelo;
        this.capacidadDeposito = 1000;
        this.cantidadAguaActual = 0;
        this.capsulas = capsulas;
    }


    public void echarAgua(){
        // https://www.w3schools.com/java/java_user_input.asp
        int addAgua = 0;
        try {
            Scanner mlAgua = new Scanner(System.in);
            System.out.println("Selecciona la cantidad de agua a añadir: "); // El escáner permitirá al usuario escribir la cantidad de agua que le dé la gana.
            addAgua = Integer.parseInt(mlAgua.nextLine()); // Desde el escáner no me dejaba sumar la cantidad directamente, asi que supongo que habría que transformarlo en Integer?
        } catch (Exception e) {
            System.out.println("El valor no es un número");
            echarAgua();
        }

        this.cantidadAguaActual += addAgua;
        if (this.cantidadAguaActual > this.capacidadDeposito){
            this.cantidadAguaActual = this.capacidadDeposito;
            System.out.println("La cantidad de agua es de: " + this.cantidadAguaActual + "ml");
        } else {
            System.out.println("La cantidad de agua es de: " + this.cantidadAguaActual + "ml");
        }

    }

    public void ponerCapsula(){
        this.capsulas += 1;
        System.out.println("Se ha añadido una capsula y la cantidad es de " + this.capsulas + " capsulas totales");
    }

    public void hacerCafe(){
        if(this.cantidadAguaActual < 50 && this.capsulas < 1){
            System.out.println("Falta agua y capsulas");
        } else if (this.cantidadAguaActual < 50){
            System.out.println("Falta agua");
        } else if (this.capsulas < 1) {
            System.out.println("Faltan capsulas");
        } else {
            this.capsulas -= 1;
            this.cantidadAguaActual -= 50;
            System.out.println("Se ha hecho un cafe");
        }
    }
    public String toString() {
        return "Capacidad máxima: " + capacidadDeposito + " cantidad de agua actual: " + cantidadAguaActual + " cápsulas: " + capsulas;
    }
}
