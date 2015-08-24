import java.util.Scanner;

class Exercicio2{
	public static void main(String[] args) {
		double quantidadeDeSalarioMinimo, salarioMinimo, salarioAtual;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor do salário mínimo: ");
		salarioMinimo = leia.nextDouble();
		System.out.println("Digite o seu salário: ");
		salarioAtual = leia.nextDouble();
		quantidadeDeSalarioMinimo = salarioAtual/salarioMinimo;
		System.out.println("Você ganha atualmente "+quantidadeDeSalarioMinimo+" salários mínimos.");
	}
}