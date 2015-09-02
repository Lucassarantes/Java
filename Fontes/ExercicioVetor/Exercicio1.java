class Exercicio1{
	public static void main(String[] args) {
		int[] A = new int[5];
		int[] B = new int[5];

		int contador;

		for (contador = 0; contador < 5; contador++) {
			A[contador] = contador + 1;
			B[contador] = A[contador];
			System.out.println(A[contador]+", "+B[contador]);
		}


	}
}