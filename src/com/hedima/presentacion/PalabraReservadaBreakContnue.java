package com.hedima.presentacion;

public class PalabraReservadaBreakContnue {
    public static void main(String[] args) {
        //Palabra resevada break -> rompe el bucle
        System.out.println("Ejemplo de break");
        for (int i = 0; i <=10; i++) {
            if (i == 5) {
                break; //Rompe el bucle
            }
            System.out.println("El valor de i es " + i);
        }
        //Palabra resevada continue -> rompe la iteracion
        System.out.println("Ejemplo de continue");
        for (int i = 0; i <=10; i++) {
            if (i == 5) {
                continue; //Rompe con el 5 pero sigue el bucle
            }
            System.out.println("El valor de i es " + i);
        }
    }
}
