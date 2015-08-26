class Asterisco2{
	public static void main(String[] args) {
		int contador, asterisco;
		for (contador=1;contador<=9;contador++) {
			for (asterisco=8;asterisco>=contador;asterisco--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}