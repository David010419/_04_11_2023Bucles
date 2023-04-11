package com.hedima.presentacion;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EjercicioAcumulados {

    public static void main(String[] args) {
//        //1. Definición de las variables.
//        int sumaPositivos = 0, sumaNegativos = 0, contadorPositivos = 0, contadorNegativos = 0, contadorCeros = 0;
//        Scanner s1 = new Scanner(System.in);
//        //2. Lógica
//        for (int i = 1; i <=10; i++) {
//            System.out.println("Escribe el número a evaluar");
//            int numero = s1.nextInt();
//            if (numero<0){
//                contadorNegativos++;
////                sumaNegativos= sumaNegativos+numero;
//                sumaNegativos+=numero;
//            }else if (numero==0){
//                contadorCeros++;
//            }else {
//                contadorPositivos++;
//                sumaPositivos+=numero;
//            }
//        }
//        System.out.println("Promedio de numeros negativos " + sumaNegativos/contadorNegativos);
//        System.out.println("Promedio de numeros positivos " + sumaPositivos/contadorPositivos);
//        System.out.println("Contador de ceros " + contadorCeros);

//        Pedir 5 sueldos. Mostrar su suma y cuantos hay mayores de 1000€.

        //1. Definición de las variables.
//        int sueldos = 0, sumasueldos = 0, sueltosmayores = 0;
//        Scanner s2 = new Scanner(System.in);
//        //2. Lógica
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Escribe los sueldos");
//            int numero = s2.nextInt();
//            if (numero < 0) {
//             sueldos++;
//             sumasueldos= sumasueldos+numero;
//            }
//        }
//        System.out.println("Suma de sueldos " + sumasueldos);

//        Scanner s1 = new Scanner(System.in);
//        int sueldo = 0; int con=0; int suma=0;
//        for (int i=1; i<=5;i++) {
//            System.out.println("El sueldo :"+i);
//            sueldo = s1.nextInt();
//            suma += sueldo;
//            System.out.println(sueldo);
//            if (sueldo>1000){
//                con++;
//            }
//        }
//        System.out.println("Sueldos superior a 1000 :"+con);
//        System.out.println("Suma de sueldos " + suma);

//        Dadas las edades  de 5 alumnos, mostrar la edad  media, la cantidad de alumnos mayores de 18 años,

        Scanner s2 = new Scanner(System.in);
        int edades = 0; int contadoredades = 0; int mayores = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Las edades son:"+i);
            edades = s2.nextInt();
            contadoredades = contadoredades + edades;
            System.out.println(edades);
            if (edades>=18){
                mayores++;
            }
        }
        System.out.println("Alumnos mayores de 18 años :"+mayores);
        System.out.println("Edad media " + (contadoredades/5));
    }
}
