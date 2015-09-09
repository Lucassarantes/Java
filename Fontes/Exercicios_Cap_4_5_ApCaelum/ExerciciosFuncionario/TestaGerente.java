class TestaGerente {
	public static void main(String[] args) {
		Gerente gerente = new Gerente(4231);
		gerente.setNomeDoFuncionario("João da Silva");
		System.out.println(gerente.getNomeDoFuncionario());
		System.out.println(gerente.getBonificacao());
	}
}