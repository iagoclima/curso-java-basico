package com.iago.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);

        if(media == 10){
            System.out.println("Aprovado com distinção");
        } else if(media < 7){
            System.out.println("Reprovado");
        } else if(media >= 7){
            System.out.println("Aprovado");
        }
    }
}
