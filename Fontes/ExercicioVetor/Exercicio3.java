class Exercicio3{
	public static void main(String[] args) {
		int[] A = new int[15];
		int[] B = new int[15];

		int contador;
		for (contador = 0; contador < 15; contador++) {
			A[contador] = contador + 1;
			B[contador] = A[contador] * A[contador];
			System.out.println(A[contador]+", "+B[contador]);
		}
	}
}