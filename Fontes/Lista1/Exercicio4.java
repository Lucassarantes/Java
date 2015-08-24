import java.util.Scanner;
class Exercicio4{
	public static void main(String[] args) {
		int idade;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		if(idade<16){
			System.out.println("Não pode votar ainda.");
		}if (idade>16 && idade<18||idade>70) {
			System.out.println("O voto é facultativo.");
		}if(idade>18 && idade<70){
			System.out.println("O voto é obrigatório.");
		}
	}
}