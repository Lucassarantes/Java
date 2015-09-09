class ContaPoupanca extends Conta{
	public void atualiza(double taxa){
		this.saldo += this.getSaldo() * (taxa * 3);
	}
}