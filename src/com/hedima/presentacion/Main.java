package com.hedima.presentacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner sn = new Scanner(System.in);
//        System.out.println("Escriba el número");
//        int a = sn.nextInt();
//        for (int i = 1; i <= a; i++) {
//            System.out.print(i+ ",");
//        }

//        Escribir todos los números del 100 al 0 de 7 en 7

//        for (int i = 100; i >= 0; i-=7) {
//            System.out.println(i+ ",");
//        }

//        Diseñar un programa que muestre el producto de los 10 primeros números impares
        int c = 1;
        for (int num = 1; num <= 19; num+=2){
            System.out.println("--Interacion--" + num);
            if(num%2!= 0){
                c*=num;
                System.out.println("numero impar " + num + " valor de c -> " + c);
            }

            System.out.println(" El resultado es -> " + c);
        }

//        Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
//          int sumapositivos = 0;
//          int contadorpositivos = 0;
//          int sumanegativos = 0;
//          int contadornegativos = 0;
//          int contadorceros = 0;




    }
}