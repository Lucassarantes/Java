import java.util.Scanner;
class Exercicio12{
	public static void main(String[] args) {
		int numero1, numero2;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numero1 = leia.nextInt();
		System.out.println("Digite um número: ");
		numero2 = leia.nextInt();
		if(numero1>numero2){
			System.out.println(numero2+","+numero1);
		}if(numero2>numero1){
			System.out.println(numero1+","+numero2);
		}
	}
}