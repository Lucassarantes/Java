class TestaEmpresa{
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		funcionario1.dataDeEntrada = new Data();
		funcionario2.dataDeEntrada = new Data();

		funcionario1.setNomeDoFuncionario("Lucas");
		funcionario1.dataDeEntrada.setDia(31);
		funcionario1.dataDeEntrada.setMes(8);
		funcionario1.dataDeEntrada.setAno(2015);

		funcionario2.setNomeDoFuncionario("Zé");
		funcionario2.dataDeEntrada.setDia(31);
		funcionario2.dataDeEntrada.setMes(8);
		funcionario2.dataDeEntrada.setAno(2015);

		empresa.adicionaFuncionario(funcionario1);
		empresa.adicionaFuncionario(funcionario2);

		empresa.mostraFuncionarios();
		System.out.println(empresa.contemFuncionario("Lucas"));
	}
}