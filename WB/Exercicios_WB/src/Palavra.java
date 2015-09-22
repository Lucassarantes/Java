
public class Palavra {
	private String palavra;
	private String descricao;
	
	public Palavra(String palavra, String descricao){
		this.setPalavra(palavra);
		this.setDescricao(descricao);
	}
	
	public boolean compara(String palavra){
		return this.getPalavra().equals(palavra);
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
