class Empresa{
	String nomeDaEmpresa;

	String cnpj;

	Funcionario[] funcionario = new Funcionario[3];

	Funcionario[] funcionarios = new Funcionario[5];

	int contador = 0;

	void setNomeDaEmpresa(String nomeDaEmpresa){
		this.nomeDaEmpresa = nomeDaEmpresa;
	}
	String getNomeDaEmpresa(){
		return this.nomeDaEmpresa;
	}

	void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}	
	String getCnpj(){
		return this.cnpj;
	}

	void adicionaFuncionario(Funcionario funcionario){
		if(contador < this.funcionario.length) {
			this.funcionario[contador] = funcionario;
			contador += 1;
		}else{
			this.funcionarios[contador] = funcionario;
			contador += 1;
			for (int i = 0; i<this.funcionario.length; i++) {
				this.funcionarios[i] = this.funcionario[i];
			}
		}
	}

	boolean contemFuncionario(String funcionario){
		for (int i=0; i<this.contador;i++) {
			if (this.funcionario[i].getNomeDoFuncionario() == funcionario) {
				System.out.println("Contem o fundionario: "+funcionario);
				return true;
			}
		}
		return false;
	}

	void mostraFuncionarios(){
		if (contador <= this.funcionario.length) {
			for (int i = 0; i < contador; i++) {
				System.out.println(" Informações do funcionário: \n");
				funcionario[i].mostra();
				System.out.println(" Funcionário na posição: "+i);
			}
		}else{
			for (int i = 0; i < contador; i++) {
				System.out.println(" Informações do funcionário: \n");
				funcionarios[i].mostra();
				System.out.println(" Funcionário na posição: "+i);
			}
		}
	}
}