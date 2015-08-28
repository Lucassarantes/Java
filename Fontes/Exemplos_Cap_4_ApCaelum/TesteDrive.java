class TesteDrive{
	public static void main(String[] args) {
		Carro meuCarro;
		meuCarro = new Carro();
		meuCarro.cor = "Branco";
		meuCarro.modelo = "Porshe Carrera 911";
		meuCarro.velocidadeAtual = 0;
		meuCarro.velocidadeMaxima = 300;

		// Ligando o carro:
		meuCarro.liga();

		// Acelerando:
		meuCarro.acelera(90);
		System.out.println(meuCarro.velocidadeAtual);
	}
}