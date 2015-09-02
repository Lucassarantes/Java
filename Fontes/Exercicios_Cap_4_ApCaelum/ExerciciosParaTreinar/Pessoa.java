class Pessoa{
	String nome;
	int idade;

	void setNome(String nome){
		this.nome = nome;
	}
	void setIdade(int anos){
		if (anos < 0) {
			System.out.println("Idade inválida!");
		}else{
			this.idade = anos;
		}
	}
	String getNome(){
		return this.nome;
	}
	int getIdade(){
		return this.idade;
	}
	void fazAniversario(){
		this.setIdade(getIdade()+1);
		System.out.println("Feliz aniversario de "+this.getIdade()+" anos.");
	}
}