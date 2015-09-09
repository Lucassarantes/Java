class ControleDeBonificacao{
	private double totalDeBonificacoes = 0;

	public void registra(Funcionario funcionario){
		totalDeBonificacoes += funcionario.getBonificacao();
	}

	public double getTotalDeBonificacoes(){
		return this.totalDeBonificacoes;
	}
}