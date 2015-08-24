import java.util.Scanner;
class Exercicio7{
	public static void main(String[] args) {
		String mes;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome de um mês: ");
		mes = ler.next();
		if(mes.equalsIgnoreCase("janeiro")){
			System.out.println("Mês 1.");
		}
		if(mes.equalsIgnoreCase("fevereiro")){
			System.out.println("Mês 2.");
		}
		if(mes.equalsIgnoreCase("marco")){
			System.out.println("Mês 3.");
		}
		if(mes.equalsIgnoreCase("abril")){
			System.out.println("Mês 4.");
		}
		if(mes.equalsIgnoreCase("maio")){
			System.out.println("Mês 5.");
		}
		if(mes.equalsIgnoreCase("junho")){
			System.out.println("Mês 6.");
		}
		if(mes.equalsIgnoreCase("julho")){
			System.out.println("Mês 7.");
		}
		if(mes.equalsIgnoreCase("agosto")){
			System.out.println("Mês 8.");
		}
		if(mes.equalsIgnoreCase("setembro")){
			System.out.println("Mês 9.");
		}
		if(mes.equalsIgnoreCase("outubro")){
			System.out.println("Mês 10.");
		}
		if(mes.equalsIgnoreCase("novembro")){
			System.out.println("Mês 11.");
		}
		if(mes.equalsIgnoreCase("dezembro")){
			System.out.println("Mês 12.");
		}
	}
}