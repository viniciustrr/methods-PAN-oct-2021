package com.unica.funcoes;

import javax.swing.JOptionPane;

public class Inputs {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual � seu nome? ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual � sua idade? "));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Qual � seu peso? "));
		
		
		System.out.println("O nome �: "+ nome);
		System.out.println("A idade �: "+ idade);
		System.out.println("O peso �: "+ peso);
	}
}
