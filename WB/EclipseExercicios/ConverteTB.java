
public class ConverteTB {
	ConverteGB conversor;
	private long valor;
	
	public ConverteTB(long valor){
		this.setValor(valor);
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}
	public long retornaValorConvertidoDeTBParaBits(){
		conversor  = new ConverteGB(this.getValor());
		return this.conversor.retornaValorConvertidoDeGBParaBits()*1024;
	}
}
