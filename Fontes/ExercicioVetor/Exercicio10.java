class Exercicio10{
	public static void main(String[] args) {
		double[] A = new double[10];
		double[] B = new double[10];

		int contador;

		for (contador = 0; contador<10; contador++) {
			A[contador] = contador + 1;
			B[contador] = A[contador] % 2;
			System.out.println(A[contador]+", "+B[contador]);
		}
	}
}