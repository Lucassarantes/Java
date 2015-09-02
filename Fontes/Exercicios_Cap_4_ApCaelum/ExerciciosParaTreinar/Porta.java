class Porta{
	String	aberta;
	String cor;
	double dimensaoX;
	double dimensaoY;
	double dimensaoZ;

	void abre(boolean aberta){
		if (aberta == true) {
			this.aberta = "aberta!";
		}else{
			this.aberta = "fechada!";
		}
	}
	String estaAberta(){
		return this.aberta;
	}

	void setCor(String cor){
		this.cor = cor;
	}
	String getCor(){
		return this.cor;
	}

	void setDimensaoX(double dimensao){
		if (dimensao <= 0) {
			System.out.println("Valor inválido!");
		}else{
			this.dimensaoX = dimensao;
		}
	}
	double getDimensaoX(){
		return this.dimensaoX;
	}

	void setDimensaoY(double dimensao){
		if (dimensao <= 0) {
			System.out.println("Valor inválido!");
		}else{
			this.dimensaoY = dimensao;
		}
	}
	double getDimensaoY(){
		return this.dimensaoY;
	}

	void setDimensaoZ(double dimensao){
		if (dimensao <= 0) {
			System.out.println("Valor inválido!");
		}else{
			this.dimensaoZ = dimensao;
		}
	}
	double getDimensaoZ(){
		return this.dimensaoZ;
	}
	String mostraDimensoes(){
		return this.getDimensaoX()+", "+this.getDimensaoY()+", "+getDimensaoZ();
	}
}