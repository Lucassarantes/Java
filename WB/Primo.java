class Primo{
	int numero;

	void setNumero(int numero){
		if (numero <=0) {
			System.out.println("Número inválido.");
		}else{
			this.numero = numero;
		}
	}
	String getNumero(){
		return this.numero;
	}
	String mostraNumeroPrimo(){
		
	}
}