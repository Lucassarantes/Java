import java.util.Scanner;
class Exercicio4{
	public static void main(String[] args) {
		int dia, mes, ano;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o dia de hoje:"); 
		dia = leia.nextInt()
		System.out.println("Digite o mês atual:");
		mes = leia.nextInt() 
		System.out.println("Digite o ano atual:");
		ano = leia.nextInt(); 
		if(ano % 4 == 0 ou ano % 100 == 0 ou ano % 400 == 0) {  
		if(mes == 1 e dia >= 1 e dia <= 31){ 
			System.out.println(dia+"/"+mes+"/"+ano+" data válida");

	}
}