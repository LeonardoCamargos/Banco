public class Conta {
	
	//Atributos
	int numero;
	String titular;
	double saldo;
	
	//Métodos
	
	public void saca(double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	
	public void deposita(double quantidade) {
		this.saldo += quantidade;
	}
	
}
