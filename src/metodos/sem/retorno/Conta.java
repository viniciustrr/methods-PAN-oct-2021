package metodos.sem.retorno;

public class Conta {
	int numeroConta;
	String titular;
	double saldo;
	
	public void sacar(int valor) {
		saldo -= valor;
	}
	
	public void depositar(int valor) {
		saldo += valor;
	}
}
