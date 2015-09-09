public class Conta{
	private int numero;
	private double saldo;
	private double limite = 100;
	Cliente titular = new Cliente(); // Quando new Conta for chamado, haverá um new cliente para ele.
	private static int totalDeContas = 0;
	Conta(){
		totalDeContas = totalDeContas + 1;
	}
		public static int getTotalDeContas(){
			return Conta.totalDeContas;
		}

	// As Linhas de código abaixo definem quais os métodos que a classe têm.

		public void setConta(int numero){
			this.numero=numero;
		}
		public int getConta(){
			return this.numero;
		}


		public void setSaldo(double valor){
			if (valor<=0) {
				System.out.println("Valor invalido");
			}else{
				this.saldo = valor;
			}
		}
		public double getSaldo(){
			return this.saldo+this.limite;
		}

		public void saca(double valor){
			if (valor<=0 || valor > getSaldo()+limite) {
				System.out.println("Impossível sacar!");
			}else{
				this.setSaldo(this.getSaldo()-valor-this.limite);
			}
		}

		// Método para depositar um valor:
		public void deposita(double quantidade){
			if (quantidade<=0) {
				System.out.println("Valor invalido");
			}else{
				this.setSaldo(getSaldo() + quantidade);
			}
		}
		// Método para transferir um valor:
		public boolean transfere(Conta destino, double valor){
			if (valor<=0 || valor>this.getSaldo()+limite) {
				return false;
			}
			return true;
		}
}