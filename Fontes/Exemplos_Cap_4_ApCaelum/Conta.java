public class Conta{
	int numero;
	double saldo, limite;
	Cliente titular = new Cliente(); // Quando new Conta for chamado, haverá um new cliente para ele.
	String nome;
	// As Linhas de código abaixo definem quais os métodos que a classe têm.
	// Método para sacar um valor:
	void saca(double quantidade){
		double novoSaldo = this.saldo-quantidade;
		this.saldo = novoSaldo;
	}
	// Método para depositar um valor:
	void deposita(double quantidade){
		this.saldo+=quantidade;
	}
	// Método para transferir um valor:
	boolean transfere(Conta destino, double valor){
		boolean retirou=this.saca(valor);
		if(retirou == false){
			//nao deu para sacar!
			return false;
		}
		else{
			destino.deposita(valor);
			return true;
		}
	}
}