
public class LivroDeLivraria extends Livro{
	private double preco;
	private boolean promocao;
	private double desconto;
	
	public LivroDeLivraria(double preco) {
		super();
		this.setPreco(preco);
	}
	public LivroDeLivraria(String promocao){
		super();
		this.setPromocao(promocao);
	}
	
	public double getPreco() {
		return this.preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean isPromocao() {
		return this.promocao;
	}
	public void setPromocao(String promocao) {
		if(promocao.equals("sim")){
			this.promocao = true;
		}else{
			this.promocao = false;
		}
	}
	public double getDesconto() {
		return this.desconto;
	}
	public void setDesconto(double desconto) {
		if(this.isPromocao() == true){
			this.desconto = desconto;			
		}else{
			this.desconto = 0;
		}
	}
	@Override
	public void mostraInformacoes() {	
		super.mostraInformacoes();
		System.out.println("Preço: "+this.getPreco());
		System.out.println("Desconto de promoção: "+this.getDesconto());
		System.out.println("Preço com desconto: "+(this.getPreco()-this.getDesconto()));
	}
}
