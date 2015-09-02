class Data{
	int dia;
	int mes;
	int ano;

	void setDia(int dia){
		if (dia < 0 || dia > 31) {
			System.out.println("Dia inválido!");
		}else{
			this.dia = dia;
		}
	}
	void setMes(int mes){
		if (mes < 0 || mes > 12) {
			System.out.println("Mês inválido!");
		}if (mes == 2 && this.dia > 29) {
			System.out.println("Data inválida!");
		}else{
			this.mes = mes;
		}
	}
	void setAno(int ano){
		if (ano < 0) {
			System.out.println("Ano inválido");
		}else{
			this.ano = ano;
		}
	}
	int getDia(){
		return this.dia;
	}
	int getMes(){
		return this.mes;
	}
	int getAno(){
		return this.ano;
	}
	String mostraData(){
		return this.getDia()+"/"+this.getMes()+"/"+this.getAno();
	}
}