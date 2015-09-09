class TestaContas{
	public static void main(String[] args){
		Conta conta1 = new Conta();
		ContaPoupanca conta2 = new ContaPoupanca();
		ContaCorrente conta3 = new ContaCorrente();

		conta1.deposita(1000.0);
		conta2.deposita(1000.0);
		conta3.deposita(1000.0);

		conta1.atualiza(0.01);
		conta2.atualiza(0.02);
		conta3.atualiza(0.03);

		System.out.println(conta1.getSaldo()+"\n");
		System.out.println(conta2.getSaldo()+"\n");
		System.out.println(conta3.getSaldo()+"\n");
	}
}