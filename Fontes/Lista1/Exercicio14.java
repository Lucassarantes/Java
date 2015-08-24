import java.util.Scanner;
class Exercicio14{
	public static void main(String[] args) {
		int numero, acumulador, contador;
		Scanner ler = new Scanner(System.in);
		acumulador = 0;
		System.out.println("Digite um numero: ");
		numero = ler.nextInt();
		for(contador=1;contador<=numero;contador++){
			if((numero%contador)==0){
				acumulador = acumulador+1;
			}
		}
		if(acumulador==2){
			System.out.println("Sim, esse número é primo!");
		}else{
			System.out.println("Nao, este número não é primo!");
		}
	}
}