class ContaCorrente extends Conta{
	public void atualiza(double taxa){
		this.saldo += this.getSaldo() * (taxa * 2);
	}

	public void deposita(double valor){
		this.saldo += this.getSaldo() + (valor - 0.10);
	}
}