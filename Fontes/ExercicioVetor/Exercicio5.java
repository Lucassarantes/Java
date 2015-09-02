class Exercicio5{
	public static void main(String[] args) {
		int[] A = new int[10];
		int[] B = new int[10];

		int contador;

		for (contador = 0; contador < 10; contador++) {
			A[contador] = contador + 1;
			B[contador] = A[contador]*contador;
			System.out.println(A[contador]+", "+B[contador]);
		}
	}
}