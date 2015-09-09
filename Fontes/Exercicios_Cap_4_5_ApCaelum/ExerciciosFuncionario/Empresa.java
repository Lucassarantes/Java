class Empresa{
	private String nomeDaEmpresa;

	private String cnpj;
	Funcionario[] funcionario;

	public Empresa(int numeroDeFuncionarios){
		this.funcionario = new Funcionario[numeroDeFuncionarios];
	}

	Funcionario[] funcionarios = new Funcionario[5];

	int contador = 0;

	public void setNomeDaEmpresa(String nomeDaEmpresa){
		this.nomeDaEmpresa = nomeDaEmpresa;
	}
	public String getNomeDaEmpresa(){
		return this.nomeDaEmpresa;
	}

	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}	
	public String getCnpj(){
		return this.cnpj;
	}

	public void adicionaFuncionario(Funcionario funcionario){
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

	public boolean contemFuncionario(String funcionario){
		for (int i=0; i<this.contador;i++) {
			if (this.funcionario[i].getNomeDoFuncionario() == funcionario) {
				System.out.println("Contem o fundionario: "+funcionario);
				return true;
			}
		}
		return false;
	}

	public void mostraFuncionarios(){
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