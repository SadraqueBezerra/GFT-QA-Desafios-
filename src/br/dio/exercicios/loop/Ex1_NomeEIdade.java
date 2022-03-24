/*Fa�a um programa que leia conjuntos de dois valores, o primeiro representando 
o nome do aluno e o segundo representando a sua idade. (Pare o programa inserindo o valor 0 
no campo nome).*/


package br.dio.exercicios.loop;

import java.util.Scanner;

public class Ex1_NomeEIdade {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			String nome;
			int idade;
			
			
			while (true) {
				
				System.out.println("Nome: ");
				nome = scan.next();
				if (nome.equals("0")) break;
				
				System.out.println("Idade: ");
				idade = scan.nextInt();		
				
			}
		}
		
		System.out.println("\nContinua aqui...");
			
	}

}
