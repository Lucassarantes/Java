class Primo{
	int numero;

	void setNumero(int numero){
		if (numero <=0) {
			System.out.println("Número inválido.");
		}else{
			this.numero = numero;
		}
	}
	int getNumero(){
		return this.numero;
	}
	String mostraNumeroPrimo(){
		int acumulaLooping = 0;
		for (int i = 1; i <= this.getNumero() ; i++) {
			if (this.getNumero()%i == 0) {
				acumulaLooping +=1;
			}
		}
		if (acumulaLooping == 2) {
			return "É um número Primo! "+this.getNumero();
		}
		return "Não é um número primo! "+this.getNumero();
	}
}