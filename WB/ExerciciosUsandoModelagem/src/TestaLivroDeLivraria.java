
public class TestaLivroDeLivraria {

	public static void main(String[] args) {
		LivroDeLivraria livro = new LivroDeLivraria(30);
		System.out.println("**********PROGRAMA DE LIVROS DO LUCAS**********");
		System.out.println("\n");
		livro.setPromocao("sim");
		livro.setDesconto(5);
		livro.setTitulo("A viagem nas nuvens do algod�o");
		livro.setAutor("Lucas.");
		livro.setEdicao(1);
		livro.setIdioma("Portug�s.");
		livro.setGenero("Aventura.");
		livro.mostraInformacoes();
	}
}
