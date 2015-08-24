import java.util.Scanner;
class Exercicio2{
	public static void main(String[] args) {
		int idade;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		if(idade>=18){
			System.out.println("O usuário é maior de idade!");
		}else{
			System.out.println("O usuário é menor de idade!");
		}
	}
}