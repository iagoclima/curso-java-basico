package com.iago.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Entre com um valor de base: ");
        int base = scan.nextInt();
        System.out.println("Entre com um valor de expoente: ");
        int expoente = scan.nextInt();

        int resultado = base;

        for (int i=1; i<expoente; i++){
            resultado *= base;
        }

        System.out.println(base + " ^ " + expoente + " = " + resultado);
    }
}
