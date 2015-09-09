class Funcionario{
	public String nomeDoFuncionario;
	private String departamento;
	protected double salario;
	public Data dataDeEntrada;
	protected String rg;
	protected static int quantidadeDeFuncionarios = 0;

	public Funcionario(){
		Funcionario.quantidadeDeFuncionarios = Funcionario.quantidadeDeFuncionarios +1;
	}
	public static int getQuantidadeDeFuncionarios(){
		return Funcionario.quantidadeDeFuncionarios;
	}

	public Funcionario(String nome){
		this.nomeDoFuncionario = nome;
	}

	public double getBonificacao(){
		return this.getSalario() *  0.10;
	}

	public void setNomeDoFuncionario(String nome){
		this.nomeDoFuncionario = nome;
	}
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	public void setSalario(double valor){
		if (valor < 0) {
			System.out.println("Valor inválido.");
		}else{
			this.salario = valor;
		}
	}
	//void setDataDeEntrada(String data){
	//	this.dataDeEntrada = data;
	//}
	public void setRg(String rg){
		this.rg = rg;
	}
	public void recebeAumento(double valor){
		if (valor < 0) {
			System.out.println("Valor inválido.");
		}else{
			this.setSalario(this.getSalario()+valor);
		}
	}
	public double mostraGanhoAnual(){
		return this.getSalario()*12;
	}
	public String getNomeDoFuncionario(){
		return this.nomeDoFuncionario;
	}
	public String getDepartamento(){
		return this.departamento;
	}
	public double getSalario(){
		return this.salario;
	}
	//String getDataDeEntrada(){
	//	return this.dataDeEntrada;
	//}
	public String getRg(){
		return this.rg;
	}
	public void mostra(){
		System.out.println("Nome do Funcionário: "+this.getNomeDoFuncionario());
		System.out.println("Departamento que o funcionário trabalha: "+this.getDepartamento());
		System.out.println("salário do funcionário: "+this.getSalario());
		System.out.println("Data de entrada do funcionário na empresa: "+this.dataDeEntrada.mostraData());
		System.out.println("RG do funcionário: "+this.getRg());
		System.out.println("Ganho anual: "+this.mostraGanhoAnual());
	}

}