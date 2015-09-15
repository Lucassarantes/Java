class ContaCorrente extends Conta{
	public void atualiza(double taxa){
		this.saldo += this.getSaldo() * (taxa * 2);
		System.out.println(this.getSaldo());
	}

	public void deposita(double valor){
		this.saldo += (valor - 1.0);
	}
}