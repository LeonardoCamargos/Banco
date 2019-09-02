
public class Programa {

	public static void main(String[] args) {
		
		Conta minhaConta;
		minhaConta = new Conta();
		
		//Alterando os valores da conta
		minhaConta.titular = "Paulo";
		minhaConta.saldo = 1000.0;
		
		//saca 200reais
		
		minhaConta.saca(200);
		
		//deposita 500
		
		minhaConta.deposita(500);
		
		System.out.println("Valor em Conta = R$"+minhaConta.saldo);
			
	}

}
