import java.util.Scanner;
class Exercicio7{
	public static void main(String[] args) {
		double contador, dolar, valorInicial, valorFinal, incremento;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor incial");
		valorInicial = leia.nextDouble();
		System.out.println("Digite o valor final");
		valorFinal = leia.nextDouble();
		System.out.println("Digite o valor a ser incrementado");
		incremento = leia.nextDouble();
		System.out.println("Digite o valor do dólar");
		dolar =leia.nextDouble();
		for(contador=1;contador<=10;contador++){
			while(valorInicial<valorFinal){
				System.out.println("Real: "+valorInicial+"  =  Dolar: "+(valorInicial*dolar));
				valorInicial=valorInicial+incremento;
			}
		}
	}
}