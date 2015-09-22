
public class ConverteBytes {
	private long valor;

	public ConverteBytes(long valor){
		this.setValor(valor);
	}
	
	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}
	
	public long converteDeBytesParaBits(){
		return this.getValor()*8;
	}
}
