
public class ListaAlunos {
	private Aluno[] alunos;
	private int totalDeVagas;
	private int totalDeAlunos = 0;
	
	public ListaAlunos(int total){
		this.alunos = new Aluno[total];
		this.totalDeVagas = total;
	}
	
	public void adiciona(Aluno aluno){
		this.alunos[totalDeAlunos] = aluno;
		this.totalDeAlunos++;
	}
	public void adiciona(int posicao, Aluno aluno){
		if(posicao < 0 || posicao > this.totalDeVagas-1){
			System.out.println("Posição inválida!");
		}if(this.alunos[posicao] == null){
			this.alunos[totalDeAlunos] = aluno;
			this.totalDeAlunos++;
		}else{
			System.out.println("Posição ocupada");
		}
	}
	
	public String mostraAluno(int posicao){
		return this.alunos[posicao].mostraInformacoes();
	}

	public void removeAluno(int posicao){
		if(posicao>totalDeAlunos || posicao < 0){
			System.out.println("Posição inválida!");
		}else{
			for(int i = posicao; i < totalDeAlunos; i++){
				this.alunos[i] = alunos[i+1];
			}
			this.totalDeAlunos --;
		}
	}
	public String toString() { 
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		for (int i = 0; i < this.totalDeAlunos - 1; i++) { 
			builder.append(this.alunos[i]); 
			builder.append(", "); 
		}
		builder.append(this.alunos[this.totalDeAlunos - 1]); 
		builder.append("]");
		return builder.toString();
	}
}
