class TestaFuncionarioDaFaculdade{
	public static void main(String[] args) {
		FuncionarioDaFaculdade joao = new FuncionarioDaFaculdade();
		joao.setNome("Joao");
		joao.setSalario(800);
		GeraRelatorio relatorio = new GeraRelatorio();
		relatorio.adicionaFuncionario(joao);
	}
}