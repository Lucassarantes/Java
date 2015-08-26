class Asterisco{
	public static void main(String[] args) {
		int contador, numero, asterisco;
		for(contador=2;contador<=8;contador++){
			for(numero=1;numero<contador;numero++){
				System.out.print(numero);
			}
			for(asterisco=7;asterisco>=contador;asterisco--){
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}