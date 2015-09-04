class TestaEmpresa{
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		Funcionario funcionario3 = new Funcionario();
		Funcionario funcionario4 = new Funcionario();
		Funcionario funcionario5 = new Funcionario();

		funcionario1.dataDeEntrada = new Data();
		funcionario2.dataDeEntrada = new Data();
		funcionario3.dataDeEntrada = new Data();
		funcionario4.dataDeEntrada = new Data();
		funcionario5.dataDeEntrada = new Data();

		funcionario1.setNomeDoFuncionario("Lucas");
		funcionario1.dataDeEntrada.setDia(31);
		funcionario1.dataDeEntrada.setMes(8);
		funcionario1.dataDeEntrada.setAno(2015);

		funcionario2.setNomeDoFuncionario("Joao");
		funcionario2.dataDeEntrada.setDia(31);
		funcionario2.dataDeEntrada.setMes(8);
		funcionario2.dataDeEntrada.setAno(2015);

		funcionario3.setNomeDoFuncionario("Maria");
		funcionario3.dataDeEntrada.setDia(31);
		funcionario3.dataDeEntrada.setMes(8);
		funcionario3.dataDeEntrada.setAno(2015);

		funcionario4.setNomeDoFuncionario("Joaquim");
		funcionario4.dataDeEntrada.setDia(31);
		funcionario4.dataDeEntrada.setMes(8);
		funcionario4.dataDeEntrada.setAno(2015);

		funcionario5.setNomeDoFuncionario("Godofredo");
		funcionario5.dataDeEntrada.setDia(31);
		funcionario5.dataDeEntrada.setMes(8);
		funcionario5.dataDeEntrada.setAno(2015);

		empresa.adicionaFuncionario(funcionario1);
		empresa.adicionaFuncionario(funcionario2);
		empresa.adicionaFuncionario(funcionario3);
		//empresa.adicionaFuncionario(funcionario4);
		//empresa.adicionaFuncionario(funcionario5);

		empresa.mostraFuncionarios();
		System.out.println(empresa.contemFuncionario("Lcas"));
	}
}