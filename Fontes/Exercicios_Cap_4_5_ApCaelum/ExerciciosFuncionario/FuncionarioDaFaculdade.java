class FuncionarioDaFaculdade{
	private String nome;
	private double salario;

	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setSalario(double valor){
		if (valor<788) {
			System.out.println("Valor invalido");
		}else{
			this.salario = valor;
		}
	}

	public double getSalario(){
		return this.salario;
	}

	public double getGastos(){
		return this.salario;
	}

	public String getInformacoes(){
		return "nome: "+this.getNome()+" salário: "+this.getSalario(); 
	}
}