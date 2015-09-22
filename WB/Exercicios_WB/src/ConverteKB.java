
public class ConverteKB {
	
	private long valor;
	ConverteBytes conversor;
	
	public ConverteKB(long valor){
		this.setValor(valor);
	}
	
	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}
	
	public long retornaValorConvertidoDeKiloParaBits(){
		conversor = new ConverteBytes(this.getValor());
		return this.conversor.converteDeBytesParaBits()*1024;
	}
}
