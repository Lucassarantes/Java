class Exercicio2{
	public static void main(String[] args) {
		int janeiro, fevereiro, marco, totalTrimestre, mediaMensal;
		janeiro=15000;
		fevereiro=23000;
		marco=17000;
		totalTrimestre=(janeiro+fevereiro+marco);
		System.out.println("total de gastos: "+totalTrimestre);
		mediaMensal=(totalTrimestre/3);
		System.out.println("Gasto Mensal: "+mediaMensal);
	}
}