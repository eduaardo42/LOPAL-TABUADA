package br.dev.eduardo.tabuada;

import javax.swing.JFrame;

import br.dev.eduardo.tabuada.gui.telaTabuada;

import model.Tabuada;

public class Main {

	public static void main(String[] args) {

		telaTabuada tela = new telaTabuada();
		tela.criarTela("Tabuada DS1MA");

		// brincando com vetores
		/*double[] notas = new double[4];
		notas[0] = 7.7;
		notas[1] = 8.3;
		notas[2] = 8.1;
		notas[3] = 6.9;

		System.out.println(notas[2]);

		System.out.println(notas.length);

		double media = (notas[0] + notas[1] + notas[2] + notas[3]) / notas.length;
		System.out.println("Média" + media);

		int i = 0;
		double totalNotas = 0.0;
		while (i < notas.length) {
			totalNotas += notas[i];
			i++;
		}
		
		media = totalNotas / notas.length;

		System.out.println("A média do aluno é" + media);
		
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println();
		
		String[] cidades = new String [6];
		cidades[0] = "Aracaju";
		cidades[1] = "Porto Velho";
		cidades[2] = "Maceio";
		cidades[3] = "Manaus";
		cidades[4] = "Campinas";
		cidades[5] = "Pariconha";
		
		
		i = 0;
		while (i < cidades.length) {
			System.out.println(i + "-" + cidades [i]);
			i++;
		}
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println();
		
		String[] equipamentos = {
				"Mouse",
				"Teclado",
				"Monitor",
				"Impressora",
				"Scanner",
				"Acess Point",
				"Roteador"
				};
		i = 0;
		while (i < equipamentos.length) {
			System.out.println(i + 1 + "-" + equipamentos[i]);
			i++;
		}
		
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println();
		
		double precos [] = {12.5, 28.99, 65.78, 71.99};
		*/
	}
}
