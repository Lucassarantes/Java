class Programa{
	public static void main(String[] args) {
		int total = Conta.getTotalDeContas();
		Conta minhaConta;
		minhaConta = new Conta();

		minhaConta.titular.setNome("Lucas");
		minhaConta.setSaldo(100);
		minhaConta.saca(50);
		minhaConta.deposita(0);
		System.out.println(minhaConta.getSaldo());
	}
}