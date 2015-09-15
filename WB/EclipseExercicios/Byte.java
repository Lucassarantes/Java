
public class Byte {
	private long bits;
	private double vByte = 0;
	private double kilo = 0;
	private double mega = 0;
	private double giga = 0;
	private double tera = 0;
	private int tipoAConverter = 0;
	
	private int getTipoAConverter() {
		return tipoAConverter;
	}

	public long getBits() {
		return this.bits;
	}

	public void setBits(long numero){
		if(numero <=0){
			System.out.println("Quantidade inv�lida!");
		}else{
			this.bits = numero;
		}
	}
	public double getvByte() {
		return vByte;
	}

	public double getKilo() {
		return kilo;
	}

	public double getMega() {
		return mega;
	}

	public double getGiga() {
		return this.giga;
	}

	public double getTera() {
		return this.tera;
	}
	
	public void convertido(int tipoAConverter){
		if(tipoAConverter <0 || tipoAConverter > 5){
			System.out.println("Tipo inv�lido!");
		}else{
			this.tipoAConverter = tipoAConverter;
		}
		if(this.getTipoAConverter() == 0){
			System.out.println("Mantido em bits: "+this.getBits());
		}else{
			if(this.getTipoAConverter() == 1){
				this.vByte = this.getBits()/8;
				System.out.println("Convers�o para Byte: "+this.getvByte());
			}else {
				if(this.getTipoAConverter() == 2){
					this.vByte = this.getBits()/8;
					this.kilo = this.getvByte()/1024;
					System.out.println("Convers�o para KiloByte: "+this.getKilo());
				}else {
					if(this.getTipoAConverter() == 3){
						this.vByte = this.getBits()/8;
						this.kilo = this.getvByte()/1024;
						this.mega = this.getKilo()/1024;
						System.out.println("Convers�o para MegaByte: "+this.getMega());
					}else {
						if(this.getTipoAConverter() == 4){
							this.vByte = this.getBits()/8;
							this.kilo = this.getvByte()/1024;
							this.mega = this.getKilo()/1024;
							this.giga = this.getMega()/1024;
							System.out.println("Convers�o para GigaByte: "+this.getGiga());
						}else {
							if(this.getTipoAConverter() == 5){
								this.vByte = this.getBits()/8;
								this.kilo = this.getvByte()/1024;
								this.mega = this.getKilo()/1024;
								this.giga = this.getMega()/1024;
								this.tera = this.getGiga()/1024;
								System.out.println("Convers�o para TeraByte: "+this.getTera());
							}
						}
					}
				}
			}
		}
	}
}
