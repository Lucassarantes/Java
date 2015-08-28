class Funcionario{
	private String nomeDoFuncionario;
	String departamento;
	private double salario;
	String dataDeEntrada;
	String rg;

	void setNome(String nome){

		this.nomeDoFuncionario = nome;
	}

	String getNome(){
		return this.nomeDoFuncionario; 
	}
	void setSalario(double salario){
		if (salario < 0){
			System.out.println("invalido");
		}else{
			this.salario = salario;
		}
	}
	double getSalario(){
		return this.salario;
	}
	void recebeAumento(double aumento){
		setSalario(getSalario() + aumento);
	}
	double calculaGanhoAnual(){
		return getSalario()*12;
	}
}
