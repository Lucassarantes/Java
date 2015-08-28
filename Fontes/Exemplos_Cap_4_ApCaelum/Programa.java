class Programa{
	public static void main(String[] args) {
		Conta minhaConta;
		minhaConta = new Conta();
		Cliente cliente = new Cliente();
		minhaConta.titular.nome = "Lucas";
		minhaConta.saldo = 30000.0;
		minhaConta.saca(10000);
		minhaConta.deposita(50000);
		System.out.println(minhaConta.saldo);
	}
}