
abstract class Imovel {
	protected String cor;
	 
	 public abstract int mostraTotalDePortas();

	public String getCor() {
		return this.cor;
	}
	public  abstract int quantidadeDePortasAbertas();

	public void pinta(String cor) {
		this.cor = cor;
	}
}
