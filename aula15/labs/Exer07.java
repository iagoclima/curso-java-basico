package com.iago.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double n1 = scan.nextDouble();

        System.out.println("Digite o segundo número:");
        double n2 = scan.nextDouble();

        System.out.println("Digite o terceiro número:");
        double n3 = scan.nextDouble();

        double maior;
        if(n1 > n2 && n1 > n3){
            maior = n1;
        } else if(n2 > n3){
            maior = n2;
        } else{
            maior = n3;
        }

        double menor;
        if(n1 < n2 && n1 < n3){
            menor = n1;
        } else if(n2 > n3){
            menor = n2;
        } else{
            menor = n3;
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

    }
}
