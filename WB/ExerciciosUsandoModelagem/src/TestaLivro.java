
public class TestaLivro {
	public static void main(String[] args) {
		Livro livro = new Livro("Cidades de papel.");
		livro.setAutor("John Green.");
		livro.setEdicao(1);
		livro.setIdioma("Portugês.");
		livro.setGenero("Romance, drama, Aventura.");
		livro.mostraInformacoes();
	}

}
