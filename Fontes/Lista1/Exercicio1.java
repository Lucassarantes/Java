import java.util.Scanner;
class Exercicio1{
	public static void main(String[] args) {
			int idade, anoAtual, anoNascimento;
			Scanner leia = new Scanner(System.in);
			System.out.println("Digite o ano de nascimento: ");
			anoNascimento=leia.nextInt();
			System.out.println("Digite o ano atual: ");
			anoAtual=leia.nextInt();
			idade=(anoAtual-anoNascimento);
			System.out.println("Você vai fazer ou fez "+idade+" anos esse ano.");
		}	
}