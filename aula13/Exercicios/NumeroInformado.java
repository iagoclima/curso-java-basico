package com.iago.cursojava.aula13.exercicios;

import java.util.Scanner;

public class NumeroInformado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = scan.nextInt();
		System.out.println("O número informado foi: " + numero);
		
		scan.close();

	}

}
