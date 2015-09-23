package banco;

public class TestaFibonacci {

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		
		System.out.println("O valor inserido está na série Fibonacci? "+fibonacci.estaNaSerieFibonacci(20));
	}

}
