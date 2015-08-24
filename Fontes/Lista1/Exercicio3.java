import java.util.Scanner;
class Exercicio3{
	public static void main(String[] args) {
		double percentualHomens, percentualMulheres, converteHomens, converteMulheres, homens, mulheres, turma;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a quantidade de pessoas na turma: ");
		turma = leia.nextDouble();
		System.out.println("Digite a quantidade de homens na turma: ");
		homens = leia.nextDouble();
		System.out.println("Digite a quantidade de mulheres na turma: ");
		mulheres = leia.nextInt();
		percentualHomens = 100*(homens/turma);
		percentualMulheres = 100*(mulheres/turma);
		System.out.println("O percentual de homens é: "+percentualHomens+" e o percentual de mulheres é: "+percentualMulheres);
	}
}