class Motor{
	int potencia;
	String tipo;
}

class Carro{
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	Motor motor;

	// ligando o carro:
	void liga(){
		System.out.println("O carro está ligado!");
	}

	// Acelerando o carro:
	void acelera(int quantidade){
		double velocidadeAcelerada = this.velocidadeAtual+quantidade;
		this.velocidadeAtual = velocidadeAcelerada;
	}

	// Marcha do carro:
	int Marcha(){
		if ( this.velocidadeAtual < 0 ) {
			return -1;
		}
		if ( this.velocidadeAtual >= 0 && this.velocidadeAtual < 100 ) {
			return 1;
		}
		if ( this.velocidadeAtual >= 40 && this.velocidadeAtual <= 200 ) {
			return 2;
		}
		return 3;
	}
}