package banco;

public class Data {
	private int dia;
	private int mes;
	private int ano;
	public int getDia() {
		return dia;
	}
	
	public Data(int dia, int mes, int ano) {
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
	}
	
	public void setDia(int dia) {
		if(dia<=0 || dia>31){
			System.out.println("Dia inválido");
		}else{
			this.dia = dia;
		}
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		if(mes<=0 || mes>12){
			System.out.println("Mês inválido");
		}if(this.getDia()>=30 && mes == 2){
			System.out.println("Esse mês possuí no máximo 29 dias!");
		}if(mes == 4 && dia == 31){
			System.out.println("Esse mês só possui 30 dias");
		}if(mes == 6 && dia == 31){
			System.out.println("Esse mês só possui 30 dias");
		}if(mes == 9 && dia == 31){
			System.out.println("Esse mês só possui 30 dias");
		}if(mes == 11 && dia == 31){
			System.out.println("Esse mês só possui 30 dias");
		}else{
			this.mes = mes;
		}
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		if(ano<=0){
			System.out.println("Ano inválido");
		}if(!(ano % 4 == 0) && !(ano % 100 != 0) || !(ano % 400 == 0)){
			if(mes == 2 && dia==29){
				System.out.println("Data inválida");
			}
		}else{
			this.ano = ano;
		}
	}
	public String mostraData(){
		return "Data: "+this.getDia()+"/"+this.getMes()+"/"+this.getAno()+".";
	}
	
}
