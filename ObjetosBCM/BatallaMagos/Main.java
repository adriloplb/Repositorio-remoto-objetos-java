package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Mago mago = new Mago("Felipe");
        Mago mago2 = new Mago("Alfredo");
        mago.lanzarHechizo(mago2);

        System.out.println(mago.getEnergia());
        System.out.println(mago2.getVida());
    }
}
