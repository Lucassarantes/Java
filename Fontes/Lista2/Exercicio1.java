import java.util.Scanner;
class Exercicio1{
	public static void main(String[] args) {
		int numerador, denominador;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numerador: ");
		numerador = leia.nextInt();
		System.out.println("Digite um denominador: ");
		denominador = leia.nextInt();
		if(denominador == 0){
			System.out.println("O denominador não pode ser zero!");
		}else{
			System.out.println("O resultado da divisão é o número real: "+(double)numerador/denominador);
		}
	}
}