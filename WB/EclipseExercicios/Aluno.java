
public class Aluno {
	private String nome;
	private String ra;
	private String cpf;
	private String entedeco;
	private Data data = new Data();
	
	public void setData(int dia, int mes, int ano){
		this.data.setDia(dia);
		this.data.setMes(mes);
		this.data.setAno(ano);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEntedeco() {
		return entedeco;
	}
	public void setEntedeco(String entedeco) {
		this.entedeco = entedeco;
	}
	
	@Override
	public String toString(){
		return this.getNome();
	}
	public String mostraInformacoes(){
		return "Nome: "+this.getNome()+"\n"+"RA: "+this.getRa()+"\n"+"CPF: "+this.getCpf()+"\n"+"Endereço: "+"\n"+data;
	}
}
