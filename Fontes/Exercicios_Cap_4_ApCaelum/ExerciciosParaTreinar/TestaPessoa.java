class TestaPessoa{
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();

		System.out.println("****** ANIVERSARIO ******");
		System.out.println(" ");

		pessoa.setNome("Lucas");
		pessoa.setIdade(18);

		while(pessoa.getIdade() < 25){
			pessoa.fazAniversario();
		}
		System.out.println("Nome: "+pessoa.getNome()+", idade: "+pessoa.getIdade());
	}
}