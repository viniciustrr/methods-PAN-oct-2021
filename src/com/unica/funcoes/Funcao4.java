package com.unica.funcoes;

public class Funcao4 {
	static int myMethod(int x) {
		return ++x;
	}
	
	static int myMethod2(int y) {
		return y++;
	}
	
	public static void main(String[] args) {
		System.out.println(myMethod(3));
		System.out.println(myMethod2(3));
	}
}
