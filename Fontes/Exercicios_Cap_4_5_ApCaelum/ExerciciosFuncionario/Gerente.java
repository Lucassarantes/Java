class Gerente extends Funcionario{
	private int senha;
	private int numeroDeFuncionariosGerenciados;

	public Gerente(int senha){
		this.senha = senha;
	}
	private boolean autenticaSenha(int senha){
		if (this.senha == senha) {
			System.out.println("Acesso permitido.");
			return true;
		}else{
			System.out.println("Acesso negado.");
			return false;
		}
	}
	@Override
	public double getBonificacao(){
		return super.getBonificacao() + 100;
	}

}