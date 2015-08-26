class Exercicio2{
	public static void main(String[] args) {
		int contador, acumulador;
		acumulador=0;
		for(contador=0;contador<=1000;contador++){
			acumulador= (acumulador+contador);
		}
		System.out.println(acumulador);
	}
}