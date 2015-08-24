class Exercicio16{
	public static void main(String[] args) {
		int acumulador, contador;
		acumulador = 1;
		for(contador=2;contador<=64;contador++){
			acumulador = (acumulador+acumulador);
		}
		System.out.println("A quantidade de grãos é: "+acumulador);
	}
}