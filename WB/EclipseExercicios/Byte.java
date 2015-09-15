
public class Byte {
	private long numero;
	private double baite = 0;
	private double kilo = 0;
	private double mega = 0;
	private double giga = 0;
	private double tera = 0;

	public Byte(long numeroL){
		this.setNumero(numeroL);
	}
	public long getNumero() {
		return this.numero;
	}

	public void setNumero(long numeroL){
		if(numeroL <=0){
			System.out.println("Quantidade inválida!");
		}else{
			this.numero = numeroL;
		}
	}
	public String mostraQuantidades(){
		this.baite = this.numero/8;
		this.kilo = this.baite/1024;
		this.mega = this.kilo/1024;
		this.giga = this.mega/1024;
		this.tera = this.giga/1024;
		
		return "Total de bits: "+this.numero+"\n"+"Total de bytes: "+this.baite+"\n"+"Total de KiloBytes: "+this.kilo+"\n"+"Total de MegaBytes: "+this.mega+"\n"+"Total de GigaBytes: "+this.giga+"\n"+"Total de TeraBytes: "+this.tera;
	}
	
}
