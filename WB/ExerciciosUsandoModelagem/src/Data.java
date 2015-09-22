
public class Data {
	private int dia;
	private int mes;
	private int ano;
	public Data(int dia, int mes, int ano){
		this.setDia(dia);
		this.setMes(mes);
		this.setAno(ano);
	}
	public Data(){
		
	}
	public int getDia() {
		return this.dia;
	}
	public void setDia(int dia) {
		if(dia>31||dia<=0){
			System.out.println("Dia inv�lido!");
		}else {
			this.dia = dia;
		}
	}
	public int getMes() {
		return this.mes;
	}
	public void setMes(int mes) {
		if(mes<=0 || mes>12){
			System.out.println("M�s inv�lido");
		}if(mes == 2 && dia>29){
			System.out.println("M�s inv�lido");
		}else{
			this.mes = mes;
		}
	}
	public int getAno() {
		return this.ano;
	}
	public void setAno(int ano) {
		if(ano<=0){
			System.out.println("Ano inv�lido!");
		}else{
			this.ano = ano;
		}
	}	
	
	public String toString(){
		return "Data: "+this.getDia()+"/"+this.getMes()+"/"+this.getAno();
	}
}
