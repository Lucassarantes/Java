class TestaControleDeBonificacao{
	public static void main(String[] args) {
		ControleDeBonificacao controleDeBonificacao = new ControleDeBonificacao();
		Gerente funcionario1 = new Gerente(12345678);
		funcionario1.setSalario(5000.0);
		controleDeBonificacao.registra(funcionario1);
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setSalario(1000.0);
		controleDeBonificacao.registra(funcionario2);
		System.out.println(controleDeBonificacao.getTotalDeBonificacoes());

	}
}