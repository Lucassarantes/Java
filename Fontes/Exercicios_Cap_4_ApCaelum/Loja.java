import java.util.Scanner;
class Loja{
	public static void main(String [] args){
		Scanner leia = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		System.out.println(" \n");
		System.out.println("------------- CADASTRO DE FUNCIONARIOS -------------");
        System.out.println(" ");

		System.out.println("Digite o nome do Funcionário: ");
		funcionario.setNome(leia.nextLine());
		System.out.println("Digite o salário do Funcionário: ");
		funcionario.setSalario(leia.nextDouble());
		System.out.println("Digite o salário do Funcionário: ");
		System.out.println("Nome: "+funcionario.getNome()+"\nSalario: "+funcionario.getSalario());
		System.out.println("Digite o valor do aumento do funcionário: ");
		funcionario.recebeAumento(leia.nextDouble());
		System.out.println("\nNome: "+funcionario.getNome()+"\nSalario com aumento: "+funcionario.getSalario());
		System.out.println("O ganho anual é de: "+funcionario.calculaGanhoAnual());
	}
}