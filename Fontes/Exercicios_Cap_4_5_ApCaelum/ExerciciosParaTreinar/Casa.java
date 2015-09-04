class Casa{
	String cor;
	int totalDePortas;
	Porta[] portas;
	int contador = 0;

	void pinta(String cor){
		this.cor = cor;
	}
	String mostraCor(){
		return this.cor;
	}
	
	void setPortas(int portas){
		this.portas = new Porta[portas];
		this.totalDePortas = portas;
	}

	void adicionaPorta(){
		if (this.contador<this.totalDePortas) {
			this.portas[contador] = new Porta();
			contador +=1;
		}
	}

	int getTotalDePortas(){
		return this.totalDePortas;
	}

	int quantasPortasEstaoAbertas(){
		int portasAbertas = 0;
		for (int i = 0; i < contador; i++) {
			if (this.portas[i].mostraEstadoDaPorta() == true) {
				portasAbertas += 1;
			}
		}
		return portasAbertas;
	}

	void mostraInformacoesDaCasa(){
		System.out.println("A cor da casa é: "+mostraCor());
		System.out.println("O total de portas da casa é: "+getTotalDePortas());
		System.out.println("A quantidade de portas abertas na casa é: "+quantasPortasEstaoAbertas());
	}
}
