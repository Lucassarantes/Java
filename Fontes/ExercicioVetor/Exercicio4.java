import java.lang.Math;
class Exercicio4{
	public static void main(String[] args) {
		int[] A = new int[15];
		double[] B = new double[15];

		int contador;
		for (contador = 0; contador < 15; contador++) {
			A[contador] = contador + 1;
			B[contador] = Math.sqrt(A[contador]);
			System.out.println(A[contador]+", "+B[contador]);
		}

	}
}