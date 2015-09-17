
public class ConverteMB {
	ConverteKB conversor;
	private long valor;
	
	public ConverteMB(long valor){
		this.setValor(valor);
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}
	public long retornaValorConvertidoDeMegaParaBits(){
		conversor = new ConverteKB(this.getValor());
		return this.conversor.retornaValorConvertidoDeKiloParaBits()*1024;
	}
}
