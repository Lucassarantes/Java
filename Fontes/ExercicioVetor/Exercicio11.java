class Exercicio11{
	public static void main(String[] args) {
		int[] A = new int[10];
		int acumulaNumerosPares = 0;
		int contador;

		for (contador = 0; contador<10; contador++) {
			A[contador] = contador + 1;
			if (A[contador] % 2 == 0){
				acumulaNumerosPares +=1; 
			}
		}
		System.out.println("Numeros pares: "+acumulaNumerosPares);
	}
}