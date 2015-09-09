class PessoaFisica{
	String cpf;
	String nome;
	int idade;

	PessoaFisica(String numeroDoCpf){
		if (this.validaCpf(numeroDoCpf) == false) {
			System.out.println("CPF invalido");
		}else{
			this.cpf = numeroDoCpf;
		}
	}


	private boolean validaCpf(String cpf){
		if (cpf.length()<11 || cpf.length()>11) {
			return false;
		}
		return true;
	} 
}