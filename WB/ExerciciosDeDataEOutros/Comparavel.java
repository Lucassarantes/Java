package banco;

public class Comparavel {
	private int valor;
	
	Comparavel(int valor){
		this.setValor(valor);
	}
	
	public boolean eMaiorOuIgual(int valor){
		if(this.getValor() >= valor){
			return true;
		}
		return false;
	}
	
	public boolean eMenorOuIgual(int valor){
		if(this.getValor() <= valor){
			return true;
		}
		return false;
	}
	
	public boolean eDiferenteDe(int valor){
		if(!(this.getValor()== valor)){
			return true;
		}
		return false;
	}
	

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}
