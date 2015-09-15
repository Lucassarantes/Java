
public class TestaAluno {

	public static void main(String[] args) {
		ListaAlunos lista = new ListaAlunos(7);
		Aluno aluno1 = new Aluno();
		Aluno aluno2 = new Aluno();
		Aluno aluno3 = new Aluno();
		Aluno aluno4 = new Aluno();
		Aluno aluno5 = new Aluno();
		Aluno aluno6 = new Aluno();
		Aluno aluno7 = new Aluno();
		aluno1.setNome("Lucas");
		aluno2.setNome("Ze");
		aluno3.setNome("Maria");
		aluno4.setNome("Joao");
		aluno5.setNome("Josefina");
		aluno6.setNome("Josefinissima");
		aluno7.setNome("Caixa Dagua");
		
		aluno1.setData(33, 02, 2014);
		//System.out.println(aluno1.mostraInformacoes());
		
		lista.adiciona(aluno1);
		lista.adiciona(aluno2);
		lista.adiciona(aluno3);
		lista.adiciona(aluno4);
		lista.adiciona(aluno5);
		lista.adiciona(aluno6);
		
		System.out.println(lista.mostraAluno(0));
		System.out.println(lista);
		lista.removeAluno(0);
		System.out.println(lista);
		lista.removeAluno(7);
		System.out.println(lista);
		lista.adiciona(6, aluno7);
		System.out.println(lista);
		
		
	}

}
