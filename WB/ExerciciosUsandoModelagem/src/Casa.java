
public class Casa extends Imovel{
	 Porta porta1 = new Porta();
	 Porta porta2 = new Porta();
	 Porta porta3 = new Porta();
	 
	public int mostraTotalDePortas(){
		return Porta.mostraTotalDePortas();
	}

	@Override
	public int quantidadeDePortasAbertas() {
		return Porta.mostraTotalDePortasAbertas();
	}
}
