import java.util.Scanner;
class Exercicio13{
	public static void main(String[] args) {
		int idade1, idade2;
		String nome1, nome2;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o nome de uma pessoa: ");
		nome1 = leia.nextLine();
		System.out.println("Digite a idade do(a) "+nome1+" : ");
		idade1 = leia.nextInt();
		System.out.println("Digite da segunda pessoa: ");
		nome2 = leia.nextLine();
		System.out.println("Digite a idade do(a) "+nome2+" : ");
		idade2 = leia.nextInt();
		if(idade1>idade2){
			System.out.println(nome1+", "+nome2+".");
		}if(idade2>idade1){
			System.out.println(nome2+", "+nome1+".");			
		}if(idade1==idade2){
			System.out.println("As duas pessoas tem a mesma idade!");
		}
	}
}