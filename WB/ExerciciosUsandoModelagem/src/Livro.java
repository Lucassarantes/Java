
public class Livro {
	private String autor;
	private String titulo;
	private String genero;
	private double peso;
	private int quantidadeDePaginas;
	private String editora;
	private int edicao;
	private String idioma;
	
	public Livro(String titulo){
		this.setTitulo(titulo);
	}
	public Livro(){
		
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if(peso<=0){
			System.out.println("Peso inválido");
		}else{ 
			this.peso = peso;
		}
	}
	public int getQuantidadeDePaginas() {
		return quantidadeDePaginas;
	}
	public void setQuantidadeDePaginas(int quantidadeDePaginas) {
		this.quantidadeDePaginas = quantidadeDePaginas;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		if(edicao<=0){
			System.out.println("Peso inválido");
		}else{ 
			this.edicao = edicao;
		}
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public void mostraInformacoes(){
		System.out.println("Título: "+this.getTitulo()+"\n"+"Genero: "+this.getGenero()+"\n"+"Autor: "+this.getAutor()+"\n"+"Quantidade de páginas: "+this.getQuantidadeDePaginas()+"\n"+"Editora: "+this.getEditora()+"\n"+"Edição: "+this.getEdicao()+"\n"+"Idioma: "+this.getIdioma()+"\n"+"Peso: "+this.getPeso());
	}
}
