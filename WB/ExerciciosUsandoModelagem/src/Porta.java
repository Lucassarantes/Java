
public class Porta {
	private boolean aberta;
	private String cor;
	private double dimensaoX = 0;
	private double dimensaoY = 0;
	private double dimensaoZ = 0;
	private static int portasAbertas = 0;
	private static int totalDePortas = 0;
	
	public Porta(){
		Porta.totalDePortas += 1; 
	}
	public static int mostraTotalDePortasAbertas(){
		return Porta.portasAbertas;
	}
	public static int mostraTotalDePortas(){
		return Porta.totalDePortas;
	}
	public void abre(String aberta) {
		if(aberta.equals("aberta")){
			this.aberta = true;
			Porta.portasAbertas += 1;
		}
	}
	public void fecha(String fechada){
		if(fechada.equals("fechada")){
			this.aberta = false;
		}
	}
	public boolean estaAberta() {
		return this.aberta;
	}
	public String getCor() {
		return this.cor;
	}
	public void pinta(String cor) {
		this.cor = cor;
	}
	public double getDimensaoX() {
		return this.dimensaoX;
	}
	public void setDimensaoX(double dimensaoX) {
		if(!(dimensaoX == 0)){
			this.dimensaoX = dimensaoX;
		}
	}
	public double getDimensaoY() {
		return this.dimensaoY;
	}
	public void setDimensaoY(double dimensaoY) {
		if(!(dimensaoY == 0)){
			this.dimensaoY = dimensaoY;
		}
	}
	public double getDimensaoZ() {
		return this.dimensaoZ;
	}
	public void setDimensaoZ(double dimensaoZ) {
		if(!(dimensaoZ == 0)){
			this.dimensaoZ = dimensaoZ;
		}
	}
}
