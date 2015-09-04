class Porta{
	boolean	estadoDaPorta;


	void estadoPorta(String aberta){
		if (aberta.equalsIgnoreCase("aberta")) {
			this.estadoDaPorta = true;
		}else{
			this.estadoDaPorta = false;
		}
	}
	boolean mostraEstadoDaPorta(){
		return this.estadoDaPorta;
	}

}