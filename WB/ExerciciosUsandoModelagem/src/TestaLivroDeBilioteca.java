
public class TestaLivroDeBilioteca {

	public static void main(String[] args) {
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		livro.setTitulo("O picolé da alegria.");
		livro.setAutor("Lucas.");
		livro.setEdicao(1);
		livro.setIdioma("Portugês.");
		livro.setGenero("Aventura.");
		livro.setReferencia(true);
		livro.setDataDeDevolucao(22, 9, 2015);
		livro.mostraInformacoes();
		
	}

}
