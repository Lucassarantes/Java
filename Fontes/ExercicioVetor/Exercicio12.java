class Exercicio12{
	public static void main(String[] args) {
		int[] A = new int[10];
		int somaDeTodosValores = 0;
		int contador;

		for (contador = 0; contador<10; contador++) {
			A[contador] = contador + 1;
			somaDeTodosValores += A[contador]; 
		}
		System.out.println("Soma dos valores: "+somaDeTodosValores);
	}
}