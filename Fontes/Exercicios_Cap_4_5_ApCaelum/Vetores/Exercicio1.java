class Exercicio1{
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		int[][] matrizDobrada = new int[3][3];
		int contador;
		int i;

		matriz[0][0] = 1;
		matriz[1][0] = 2;
		matriz[2][0] = 3;
		matriz[0][1] = 4;
		matriz[1][1] = 5;
		matriz[2][1] = 6;
		matriz[0][2] = 7;
		matriz[1][2] = 8;
		matriz[2][2] = 9;


		for (contador = 0; contador < 3; contador++) {
			for (i = 0; i < 3; i++) {
				System.out.print(matriz[i][contador]+" ");  
			}
			System.out.println(" ");
		}

		System.out.println(" Matriz Dobrada");
		
		for (i = 0;i < 3; i++) {
			for (contador = 0;contador < 3; contador++) {
				matrizDobrada[contador][i] = matriz[contador][i] * 2;
			}
		}

		for (contador = 0; contador < 3; contador++) {
			for (i = 0; i < 3; i++) {
				System.out.print(matrizDobrada[i][contador]+" ");  
			}
			System.out.println(" ");
		}
	}
}