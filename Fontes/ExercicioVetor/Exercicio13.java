class Exercicio13{
	public static void main(String[] args) {
		int[] A = new int[10];
		int somaDeTodosValoresDivisiveisPorCinco = 0;
		int contador;

		for (contador = 0; contador<10; contador++) {
			A[contador] = contador + 1;
			if (A[contador] % 5 == 0){
				somaDeTodosValoresDivisiveisPorCinco += A[contador]; 
			}
		}
		System.out.println("Soma dos valores divisiveis por cinco: "+somaDeTodosValoresDivisiveisPorCinco);
	}
}