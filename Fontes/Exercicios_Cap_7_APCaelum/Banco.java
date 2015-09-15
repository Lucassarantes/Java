class Banco{
	public static void main(String[] args){
		Conta[] contas = new Conta[3];
		contas[0] = new Conta();
		contas[1] = new ContaPoupanca();
		contas[2] = new ContaCorrente();
		AtualizadorDeContas atualizador = new AtualizadorDeContas(0.1);

		contas[0].deposita(1000.0);
		contas[1].deposita(1000.0);
		contas[2].deposita(1001.0);

		atualizador.roda(contas[0]);
		System.out.println(" ");
		contas[1].atualiza(0.1);
		System.out.println(" ");
		contas[2].atualiza(0.1);

	}
}