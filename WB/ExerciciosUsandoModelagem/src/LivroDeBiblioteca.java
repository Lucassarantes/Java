
public class LivroDeBiblioteca extends Livro{
	private Data dataDeEmprestimo = new Data();
	private Data dataDeDevolucao = new Data();
	private boolean referencia;
	private int quantidadeDeDiasDeEmprestimo;
	
	public Data getDataDeEmprestimo() {
		return this.dataDeEmprestimo;
	}
	public void setDataDeEmprestimo(int dia, int mes, int ano) {
		this.dataDeEmprestimo.setDia(dia);
		this.dataDeEmprestimo.setDia(mes);
		this.dataDeEmprestimo.setDia(ano);		
	}
	public Data getDataDeDevolucao() {
		return this.dataDeDevolucao;
	}
	public void setDataDeDevolucao(int dia, int mes, int ano) {
		this.dataDeDevolucao.setDia(dia);
	}
	public boolean isReferencia() {
		return this.referencia;
	}
	public void setReferencia(boolean referencia) {
		this.referencia = referencia;
	}
	public int getQuantidadeDeDiasDeEmprestimo() {
		return this.quantidadeDeDiasDeEmprestimo;
	}
	public void setTempoPertidoDeEmprestimo(int quantidadeDeDiasDeEmprestimo) {
		this.quantidadeDeDiasDeEmprestimo = quantidadeDeDiasDeEmprestimo;
	}
	
	public void liberaEmprestimo(){
		if(this.isReferencia() == true){
			System.out.println("Livro de referência, não pode ser emprestado!");
		}else{
			System.out.println("O livro "+this.getTitulo()+" deve ser devolvido em: "+this.getDataDeDevolucao());
		}
	}
	public void mostraInformacoes() {	
		super.mostraInformacoes();
		this.liberaEmprestimo();
	}
}