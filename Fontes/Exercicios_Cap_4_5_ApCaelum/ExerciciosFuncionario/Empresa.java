class Empresa{
	String nomeDaEmpresa;
	String cnpj;
	Funcionario[] funcionario = new Funcionario[10];
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
		this.funcionario[contador] = funcionario;
		contador += 1;
	}
	void mostraFuncionarios(){
		for (int i = 0; i < contador; i++) {
			System.out.println(" Informações do funcionário: \n");
			funcionario[i].mostra();
			System.out.println(" Funcionário na posição: "+i);
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
}