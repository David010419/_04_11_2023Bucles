package com.hedima.presentacion;

import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
//        int i = 1;
//        while (i <= 5){
//            System.out.println(i);
//            i++;
//        }

//        Solicitar números por la consola hasta que escriban un número negativo. al final mostrar su suma

//        Scanner sc1 = new Scanner(System.in);
//        int a = 1;
//        int suma = 0;
//        while (a >= 0) {
//            System.out.println("Escribe un numero: ");
//            a = sc1.nextInt();
//            if (a >= 0) {
//                suma += a;
//            }
//
//
//        }
//        System.out.println("El numero introducido es menor de cero y la suma de los numeros es " + suma);
//
        Scanner sc1 = new Scanner(System.in);
//        int a = 1;
//        int suma = 0;
//        while (true) {
//            System.out.println("Escribe un numero: ");
//            a = sc1.nextInt();
//            if (a >= 0) {
//                suma += a;
//            }else {
//                break;
//            }
//
//
//        }
//        System.out.println("El numero introducido es menor de cero y la suma de los numeros es " + suma);

//        Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.

        int a = 1;
        while (true) {
            System.out.println("Escribe un numero: ");
            a = sc1.nextInt();
            if (a >= 0) {
                System.out.println(a=a*a);
            } else {
                break;
            }

        }
    }
}