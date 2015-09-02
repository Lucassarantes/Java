class TestaCasa{
	public static void main(String[] args) {
		Casa casa = new Casa();

		casa.setCor("Azul");
		casa.setPorta1("aberta");
		casa.setPorta2("fechada");
		casa.setPorta3("aberta");

		System.out.println(casa.getCor());
		System.out.println("O número de portas abertas é: "+casa.mostraQuantasPortasAbertas());
	}
}