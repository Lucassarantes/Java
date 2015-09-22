import java.util.Scanner;
public class VetorDinamico {
	public static void main(String[] args) {
		int contador = 0;
		
		Scanner read = new Scanner(System.in);
		Alunos[] lista = new Alunos[2];
		Alunos[] lista2 = new Alunos[4];
		System.out.println("\nDigite inserir para inserir um aluno, ou digite lista para ver a lista de alunos ou digite sair para parar o programa: ");
		String opcao = read.nextLine();
		while(!opcao.equals("sair")){
			switch(opcao){
				case "inserir":
					if(contador <2){
						System.out.println("Digite o nome do aluno: ");
						String nome = read.nextLine();
						lista[contador] = new Alunos(nome);
						contador ++;
					}else{
						System.out.println("Digite o nome do aluno: ");
						String nome = read.nextLine();
						lista2 = new Alunos[contador*2];
						for(int i = 0; i < contador; i++){
							lista2[i] = lista[i];
						}
						lista2[contador] = new Alunos(nome);
						contador ++;
					}
				break;
				case "lista":
						if(contador<2){
							for(int i = 0; i < 2; i++){
								System.out.println(lista[i].getNome());
								if(lista[i] == null){
									break;
								}
							}
						}else{
							for(int i = 0; i < contador; i++){
								System.out.println(lista2[i].getNome());
								if(lista2[i] == null){
									break;
								}
							}
						}
					break;
			}
			System.out.println("\nInsira um aluno, ou digite lista para ver a lista de alunos ou digite sair para parar o programa: ");
			opcao = read.nextLine();
		}
	}
}
