class Conta{
	protected double saldo = 900;

	public double getSaldo(){
		return this.saldo;
	}

	public void saca(double valor){
		if (valor<0 || valor>this.getSaldo()) {
			System.out.println("Valor inválido");
		}else{
			this.saldo = this.getSaldo() - valor;
		}
	}

	public void deposita(double valor){
		if (valor<0){
			System.out.println("Valor inválido");
		}else{
			this.saldo = this.getSaldo() + valor;
		}
	}

	public void atualiza(double taxa){
		this.saldo += getSaldo() * taxa;
	}

}