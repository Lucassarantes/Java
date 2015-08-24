import java.util.Scanner;
class Exercicio3{
	public static void main(String[] args) {
		double emprestimo, desconto, salarioBruto;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite seu salário bruto:");
		salarioBruto = ler.nextDouble();
		System.out.println("Digite a quantidade de desconto:");
		desconto = ler.nextDouble();
		System.out.println("Digite a quantidade de emprestimo:");
		emprestimo = ler.nextDouble();
		if((((100 - desconto) / 100) * salarioBruto) * 0.3 < emprestimo) { 
			System.out.println("O seu empréstimo não será possível!");
		}else{
			System.out.println("O emprestimo será possível");
		}

	}
}