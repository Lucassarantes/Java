class TestaCasa{
	public static void main(String[] args) {
		Casa casa = new Casa();

		casa.pinta("Azul");
		casa.setPortas(3);

		casa.adicionaPorta();
		casa.adicionaPorta();
		casa.adicionaPorta();

		casa.portas[0].estadoPorta("aberta");
		casa.portas[1].estadoPorta("fechada");
		casa.portas[2].estadoPorta("aberta");

		casa.mostraInformacoesDaCasa();
	}
}