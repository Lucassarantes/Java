
public class Professor {
	private String nomeDoProfessor;
	private String nomeDoDepartamento;
	private Data dataDeAdmiss�o = new Data();
	private long numeroDeRegistro;
	
	public Professor(String nomeProfessor, String nomeDepartamento, int dia, int mes, int ano, long numeroRegistro){
		this.setNomeDoProfessor(nomeProfessor);
		this.setNomeDoDepartamento(nomeDepartamento);
		this.setNumeroDeRegistro(numeroRegistro);
		this.setDataDeAdmiss�o(dia, mes, ano);
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
	public Data getDataDeAdmiss�o() {
		return this.dataDeAdmiss�o;
	}
	public void setDataDeAdmiss�o(int dia, int mes, int ano) {
		this.dataDeAdmiss�o.setDia(dia);
		this.dataDeAdmiss�o.setMes(mes);
		this.dataDeAdmiss�o.setAno(ano);
	}
	public long getNumeroDeRegistro() {
		return this.numeroDeRegistro;
	}
	public void setNumeroDeRegistro(long numeroDeRegistro) {
		this.numeroDeRegistro = numeroDeRegistro;
	}
	public void mostraInformacoes(){
		System.out.println("Nome do professor: "+this.getNomeDoProfessor()+"\n"+"Departamento: "+this.getNomeDoDepartamento()+"\n"+"Data de Admiss�o"+this.getDataDeAdmiss�o()+"\n"+"Numero de registro: "+this.getNumeroDeRegistro());
	}
}
