package com.javalabs.introduction.loops;

import java.util.Scanner;

public class PrimeiraClasse {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double n4 = 0;
		double media;
		
		String input = "";
		
		while(input.equals("")) {
			System.out.print("digite o nome do aluno");
			input = ent.nextLine();			
		}

		do {
			System.out.println("Digite a nota da Prova: ");
			input = ent.nextLine();		
			if (!input.equals("")) {
				n1 = Double.parseDouble(input);
			}
		} while(input.equals("") || input.equals("\n"));
		
		System.out.print("Digite a nota do projeto");
		n2 = ent.nextDouble();
		ent.nextLine();

		System.out.print("Digite a nota da lista de exercicios");
		n3 = ent.nextDouble();
		ent.nextLine();

		System.out.print("Digite a nota do projeto");
		n4 = ent.nextDouble();
		ent.nextLine();

// media das notas

		media = (n1 * 3 + n2 * 3 + n3 * 2 + n4 * 3) / 11;

		System.out.print("Media do semestre" + media);
		ent.nextLine();

		if (media >= 8) {
			System.out.print("aprovado");
			ent.nextLine();
		}

	}
}