import java.util.Scanner;
class Exercicio15{
	public static void main(String[] args) {
		int contador, multiplicador;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		multiplicador = leia.nextInt();
		for(contador=0;contador<=10;contador++){
			System.out.println(multiplicador+"x"+contador+"="+(multiplicador*contador));
		}
	}
}