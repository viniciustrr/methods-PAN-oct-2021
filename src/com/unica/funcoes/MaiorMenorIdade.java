package com.unica.funcoes;

import javax.swing.JOptionPane;

public class MaiorMenorIdade {
	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual � sua idade? "));
		
		if(idade < 18) {
			System.out.println("Menor de idade");
			System.out.println("ano que vem ser� maior");
		}else {
			JOptionPane.showMessageDialog(null,"Maior");
		}
	}
}
