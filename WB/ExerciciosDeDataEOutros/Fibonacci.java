package banco;

public class Fibonacci {
	private int a = 1;
	private int b = 1;
	private int aux = 0;
	
	public boolean estaNaSerieFibonacci(int valor){
		for(int i = 1;i<=valor;i++){
			this.aux = this.a + this.b;
			this.b = this.a;
			this.a = this.aux;
			if(valor == this.a){
				return true;
			}
		}
		return false;
	}
}
