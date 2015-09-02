class Funcionario{
	String nomeDoFuncionario;
	String departamento;
	double salario;
	Data dataDeEntrada;
	String rg;

	void setNomeDoFuncionario(String nome){
		this.nomeDoFuncionario = nome;
	}
	void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	void setSalario(double valor){
		if (valor < 0) {
			System.out.println("Valor inválido.");
		}else{
			this.salario = valor;
		}
	}
	//void setDataDeEntrada(String data){
	//	this.dataDeEntrada = data;
	//}
	void setRg(String rg){
		this.rg = rg;
	}
	void recebeAumento(double valor){
		if (valor < 0) {
			System.out.println("Valor inválido.");
		}else{
			this.setSalario(this.getSalario()+valor);
		}
	}
	double mostraGanhoAnual(){
		return this.getSalario()*12;
	}
	String getNomeDoFuncionario(){
		return this.nomeDoFuncionario;
	}
	String getDepartamento(){
		return this.departamento;
	}
	double getSalario(){
		return this.salario;
	}
	//String getDataDeEntrada(){
	//	return this.dataDeEntrada;
	//}
	String getRg(){
		return this.rg;
	}
	void mostra(){
		System.out.println("Nome do Funcionário: "+this.getNomeDoFuncionario());
		System.out.println("Departamento que o funcionário trabalha: "+this.getDepartamento());
		System.out.println("salário do funcionário: "+this.getSalario());
		System.out.println("Data de entrada do funcionário na empresa: "+this.dataDeEntrada.mostraData());
		System.out.println("RG do funcionário: "+this.getRg());
		System.out.println("Ganho anual: "+this.mostraGanhoAnual());
	}

}