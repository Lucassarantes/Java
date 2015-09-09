class Data{
	private int dia;
	private int mes;
	private int ano;

	public void setDia(int dia){
		if (dia < 0 || dia > 31) {
			System.out.println("Dia inválido!");
		}else{
			this.dia = dia;
		}
	}
	public void setMes(int mes){
		if (mes < 0 || mes > 12) {
			System.out.println("Mês inválido!");
		}if (mes == 2 && this.dia > 29) {
			System.out.println("Data inválida!");
		}else{
			this.mes = mes;
		}
	}
	public void setAno(int ano){
		if (ano < 0) {
			System.out.println("Ano inválido");
		}else{
			this.ano = ano;
		}
	}
	public int getDia(){
		return this.dia;
	}
	public int getMes(){
		return this.mes;
	}
	public int getAno(){
		return this.ano;
	}
	public String mostraData(){
		return this.getDia()+"/"+this.getMes()+"/"+this.getAno();
	}
}