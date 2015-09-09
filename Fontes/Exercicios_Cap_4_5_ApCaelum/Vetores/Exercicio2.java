class Exercicio2{
	class Exercicio1{
     public static void main(String[] args) {
          int[][][] matriz = new int[3][3][3];
          int contador;
          int i;
          int j;
          int acumlaPares = 0;
          int acumlaImapres = 0;

          matriz[0][0][0] = 1;
          matriz[0][0][1] = 2;
          matriz[0][0][2] = 3;
          matriz[0][1][0] = 4;
          matriz[0][1][1] = 5;
          matriz[0][1][2] = 6;
          matriz[1][2][0] = 7;
          matriz[1][2][1] = 8;
          matriz[1][2][2] = 9;
          matriz[2][0][0] = 10;
          matriz[2][0][1] = 11;
          matriz[2][0][2] = 12;


          for (contador = 0; contador < 3; contador++) {
               for (i = 0; i < 3; i++) {
                    System.out.print(matriz[i][contador]+" ");  
               }
               System.out.println(" ");
          }
}