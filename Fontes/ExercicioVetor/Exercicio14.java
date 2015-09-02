class Exercicio14{
	public static void main(String[] args) {
		int[] A = new int[10];
		int somaDeTodosValoresImpares = 0;
		int acumuladoraDeNumerosImpares = 0;
		int contador;

		for (contador = 0; contador<10; contador++) {
			A[contador] = contador + 1;
			if (A[contador] % 2 != 0){
				acumuladoraDeNumerosImpares += 1;
				somaDeTodosValoresImpares += A[contador]; 
			}
		}
		System.out.println("Media de todos os valores impares: "+(somaDeTodosValoresImpares/acumuladoraDeNumerosImpares));
	}
}