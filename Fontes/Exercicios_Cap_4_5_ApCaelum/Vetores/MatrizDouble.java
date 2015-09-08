class MatrizDouble{
	public static void main(String[] args) {
		double[][] matriz = new double[2][5];
		int contador;
		int i;

		matriz[0][0] = 1;
		matriz[1][0] = 2;
		matriz[0][1] = 3;
		matriz[1][1] = 4;
		matriz[0][2] = 5;
		matriz[1][2] = 6;
		matriz[0][3] = 7;
		matriz[1][3] = 8;
		matriz[0][4] = 9;
		matriz[1][4] = 10;
		

		for (contador = 0; contador < 5; contador++) {
			for (i = 0; i < 2; i++) {
				System.out.print(matriz[i][contador]+" ");  
			}
			System.out.println(" ");
		}
	}
}