
public class ConverteGB {
	ConverteMB conversor;
	private long valor;
	
	public ConverteGB(long valor){
		this.setValor(valor);
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}
	public long retornaValorConvertidoDeGBParaBits(){
		conversor = new ConverteMB(this.getValor());
		return this.conversor.retornaValorConvertidoDeMegaParaBits()*1024;
	}
}
