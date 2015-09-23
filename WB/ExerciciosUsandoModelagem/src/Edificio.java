
public class Edificio extends Imovel {
	Porta[] portas = new Porta[10];
	private int totalDePortas = 0;
	private int totalDeAndares = 0;
	
	public void adicionaPorta(Porta porta){
		this.portas[this.totalDePortas] = porta;
		this.totalDePortas +=1;
	}
	
	public int mostraTotalDePortas(){
		return Porta.mostraTotalDePortas();
	}

	@Override
	public int quantidadeDePortasAbertas() {
		return Porta.mostraTotalDePortasAbertas();
	}
	
}
