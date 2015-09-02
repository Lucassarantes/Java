class Exercicio15{
	public static void main(String[] args) {
		int[] A = new int[10];
		int somaDeTodosValoresImpares = 0;
		int somaDeTodosValoresPares = 0;
		int contador;

		for (contador = 0; contador<10; contador++) {
			A[contador] = contador + 1;
			if (A[contador] % 2 != 0){
				somaDeTodosValoresImpares += A[contador]; 
			}else{
				somaDeTodosValoresPares += A[contador]; 
			}
		}
		System.out.println("Media de todos os valores impares: "+(((somaDeTodosValoresImpares*10)/100)+","+((somaDeTodosValoresPares*10)/100)));
	}
}