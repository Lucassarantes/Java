class TestaPorta{
	public static void main(String[] args) {
		Porta porta = new Porta();

		System.out.println("\n ****** PORTA ******\n");

		porta.setCor("Amarelo");
		porta.abre(false);
		porta.setDimensaoX(130);
		porta.setDimensaoY(200);
		porta.setDimensaoZ(30);

		System.out.println(porta.getCor());

		System.out.println("A porta está "+porta.estaAberta());

		System.out.println(porta.mostraDimensoes());
	}
}