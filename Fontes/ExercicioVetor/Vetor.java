class Vetor{
	public static void main(String[] args) {
		int[] vet = new int[10];
		int contador;
		for (contador = 0;contador <= 9;contador++ ) {
			vet[contador] = contador+1;
			System.out.println(vet[contador]);
		}
	}
}