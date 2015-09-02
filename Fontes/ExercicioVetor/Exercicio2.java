class Exercicio2{
	public static void main(String[] args) {
		int[] A = new int[8];
		int[] B = new int[8];

		int contador;

		for (contador = 0; contador < 8; contador++) {
			A[contador] = contador+1;
			B[contador] = A[contador]*2;
			System.out.println(A[contador]+", "+B[contador]);
		}

	}
}