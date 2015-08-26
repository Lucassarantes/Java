class Exercicio4{
	public static void main(String[] args) {
		 n, fatorial;
		fatorial=1;
		for (n=1;n<=40;n++) {
			fatorial+=(fatorial*(n-1));
		}
		System.out.println(fatorial);
	}
}