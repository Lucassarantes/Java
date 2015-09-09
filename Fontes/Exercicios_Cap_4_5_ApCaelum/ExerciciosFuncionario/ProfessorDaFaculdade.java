class ProfessorDaFaculdade extends FuncionarioDaFaculdade{
	private int horasDeAula;

	public void setHorasDeAula(int horas){
		this.horasDeAula = horas;
	}

	public double getGastos(){
		return this.getSalario()+horasDeAula*10;
	}

	public String getInformacoes(){
		String informacoesBasicas = super.getInformacoes();
		String informacao = informacoesBasicas+" horas de aula: "+this.horasDeAula;
		return informacao;
	}
}