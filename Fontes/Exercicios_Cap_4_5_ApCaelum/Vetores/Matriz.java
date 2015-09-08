class Matriz{
	public static void main(String[] args) {
		int[][] matriz = new int[2][3];
		int contador;
		int i;

		matriz[0][0] = 1;
		matriz[1][0] = 2;
		matriz[0][1] = 3;
		matriz[1][1] = 4;
		matriz[0][2] = 5;
		matriz[1][2] = 6;

		for (contador = 0; contador < 3; contador++) {
			for (i = 0; i < 2; i++) {
				System.out.print(matriz[i][contador]+" ");  
			}
			System.out.println(" ");
		}
	}
}