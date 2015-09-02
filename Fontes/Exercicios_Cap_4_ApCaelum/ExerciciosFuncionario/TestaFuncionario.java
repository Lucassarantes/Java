class TestaFuncionario{
	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();

		Funcionario funcionario1 = new Funcionario();

		// A linha abaixo faz com que a segunda variavel(funcionario1) do tipo funcionario esteja armezenando o mesmo enderço da variavel (funcionario).
		//Funcionario funcionario1 = funcionario;

		Data data = new Data();
		funcionario.dataDeEntrada = data;

		System.out.println("****** FUNCIONARIO ******");
		System.out.println(" ");

		funcionario.setNomeDoFuncionario("Lucas");

		funcionario.setDepartamento("Marketing");

		funcionario.setSalario(100);

		funcionario.dataDeEntrada.setDia(31);
		funcionario.dataDeEntrada.setMes(8);
		funcionario.dataDeEntrada.setAno(2015);

		funcionario.setRg("12345-6");

		funcionario.recebeAumento(100);

		funcionario.mostra();

		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

		/* funcionario1.setNomeDoFuncionario("Lucas");

		funcionario1.setDepartamento("Marketing");

		funcionario1.setSalario(100);

		funcionario1.setDataDeEntrada("20/10/1999");

		funcionario1.setRg("12345-6");

		funcionario1.recebeAumento(100);

		funcionario1.mostra();

		if (funcionario == funcionario1) {
			System.out.println("Dois funcionários iguais!");
		}else{
			System.out.println("Dois funcionários diferentes!");
		}
		*/
	}
}