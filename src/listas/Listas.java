package listas;

import java.util.ArrayList;
import java.util.List;

public class Listas {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("77");
		lista.add("Vinicius Trindade");
		lista.add("3033.33");
		lista.add("80");
		lista.remove("80");
		
		System.out.println("Lista com elementos diferentes: "+ lista);
		System.out.println("Lista com nome: "+ lista.get(1));
		System.out.println("Lista com salário: R$ "+ lista.get(2));
		lista.clear();
		System.out.println("Lista vazia: "+ lista);
	}
}
