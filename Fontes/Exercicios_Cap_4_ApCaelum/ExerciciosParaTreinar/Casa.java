class Casa{
	String cor;
	boolean porta1;
	boolean porta2;
	boolean porta3;

	void setCor(String tinta){
		this.cor = tinta;
	}
	String getCor(){
		return this.cor;
	}

	void setPorta1(String porta){
		if (porta.equalsIgnoreCase("aberta")) {
			this.porta1 = true;
		}else{
			this.porta1 = false;
		}
	}
	boolean getPorta1(){
		return this.porta1;
	}

	void setPorta2(String porta){
		if (porta.equalsIgnoreCase("aberta")) {
			this.porta2 = true;
		}else{
			this.porta2 = false;
		}
	}
	boolean getPorta2(){
		return this.porta2;
	}

	void setPorta3(String porta){
		if (porta.equalsIgnoreCase("aberta")) {
			this.porta3 = true;
		}else{
			this.porta3 = false;
		}
	}
	boolean getPorta3(){
		return this.porta1;
	}

	int mostraQuantasPortasAbertas(){
		int portasAbertas = 0;
		if (this.getPorta1() == true) {
			portasAbertas = portasAbertas + 1;
		}
		if (this.getPorta2() == true) {
			portasAbertas = portasAbertas + 1;	
		}
		if (this.getPorta3() == true) {
			portasAbertas = portasAbertas + 1;
		}
		return portasAbertas;
	}
}