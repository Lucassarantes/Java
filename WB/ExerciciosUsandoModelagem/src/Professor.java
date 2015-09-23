
public class Professor {
	private String nomeDoProfessor;
	private String nomeDoDepartamento;
	private Data dataDeAdmissão = new Data();
	private long numeroDeRegistro;
	
	public Professor(String nomeProfessor, String nomeDepartamento, int dia, int mes, int ano, long numeroRegistro){
		this.setNomeDoProfessor(nomeProfessor);
		this.setNomeDoDepartamento(nomeDepartamento);
		this.setNumeroDeRegistro(numeroRegistro);
		this.setDataDeAdmissão(dia, mes, ano);
	}
	
	public String getNomeDoProfessor() {
		return this.nomeDoProfessor;
	}
	public void setNomeDoProfessor(String nomeDoProfessor) {
		this.nomeDoProfessor = nomeDoProfessor;
	}
	public String getNomeDoDepartamento() {
		return this.nomeDoDepartamento;
	}
	public void setNomeDoDepartamento(String nomeDoDepartamento) {
		this.nomeDoDepartamento = nomeDoDepartamento;
	}
	public Data getDataDeAdmissão() {
		return this.dataDeAdmissão;
	}
	public void setDataDeAdmissão(int dia, int mes, int ano) {
		this.dataDeAdmissão.setDia(dia);
		this.dataDeAdmissão.setMes(mes);
		this.dataDeAdmissão.setAno(ano);
	}
	public long getNumeroDeRegistro() {
		return this.numeroDeRegistro;
	}
	public void setNumeroDeRegistro(long numeroDeRegistro) {
		this.numeroDeRegistro = numeroDeRegistro;
	}
	public void mostraInformacoes(){
		System.out.println("Nome do professor: "+this.getNomeDoProfessor()+"\n"+"Departamento: "+this.getNomeDoDepartamento()+"\n"+"Data de Admissão"+this.getDataDeAdmissão()+"\n"+"Numero de registro: "+this.getNumeroDeRegistro());
	}
}
