package banco;

public class TestaComparavel {

	public static void main(String[] args) {
		Comparavel compara = new Comparavel(10);
		
		System.out.println("O valor � diferente de 5? "+compara.eDiferenteDe(5));
		System.out.println("O valor � menor ou igual � 5? "+compara.eMenorOuIgual(5));
		System.out.println("O valor � maior ou igual � 5? "+compara.eMaiorOuIgual(5));
		
	}
}
