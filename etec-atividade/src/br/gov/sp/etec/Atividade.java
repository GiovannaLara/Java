package br.gov.sp.etec;

import java.util.Scanner;

public class Atividade {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantidade de notas: ");
		int qtdNotas = entrada.nextInt();
		
		double[] notas;
		notas = new double[qtdNotas];
		
		for(int x = 0; x<qtdNotas; x++) {
			System.out.println("Digite a nota: ");
			notas[x] = entrada.nextDouble();			
		}
		
		double soma = 0;
		for(double nota:notas) {
			soma=soma+nota;
		}
		
		double media = 0;
		media = soma/qtdNotas;
		
		System.out.println("Média de notas: "+media);
		
		
		
	}

}
