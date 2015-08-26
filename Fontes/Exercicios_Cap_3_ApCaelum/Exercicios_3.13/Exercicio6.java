class Exercicio6{
	public static void main(String[] args) {
		int contador, anterior, auxiliar, atual;
		anterior=0;
		auxiliar=0;
		atual=1;
		System.out.print(anterior+","+atual);
		for (contador=0;contador<10;contador++) {
			auxiliar=anterior+atual;
			anterior=atual;
			atual=auxiliar;
			System.out.print(","+auxiliar);
		}
	}
}