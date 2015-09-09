class Cliente {
	private int idade;
	private String nome;
	private String cpf;

	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}
	public int getIdade(){
		return this.idade;
	}

	public void mudaCPF(String cpf) {
		if (this.getIdade() <= 60) {
			this.validaCpf(cpf);
		}
		this.cpf = cpf;
	}

	private void validaCpf(String cpf){
		if (this.cpf.length()>11 || this.cpf.length()<11) {
			System.out.println("Cpf invalido");
		}	
	}
}