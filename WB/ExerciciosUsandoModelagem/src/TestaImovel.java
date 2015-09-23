
public class TestaImovel {

	public static void main(String[] args) {
		Edificio edificio = new Edificio();
		
		Porta porta1 = new Porta();
		porta1.pinta("branco");
		porta1.setDimensaoX(20);
		porta1.setDimensaoY(20);
		porta1.setDimensaoZ(30);
		porta1.abre("aberta");
		porta1.fecha("aberta");
		
		edificio.adicionaPorta(porta1);
		edificio.pinta("Azul");
		System.out.println(edificio.mostraTotalDePortas());
		System.out.println(edificio.portas[1].getCor());
	}

}
