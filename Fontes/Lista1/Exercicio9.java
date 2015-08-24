import java.util.Scanner; 
class Exercicio9{ 
	public static void main(String[] args) { 
		String mes; 
		int dia; 
		Scanner ler = new Scanner(System.in); 
		System.out.println("Digite o nome do mês de seu aniversário: "); 
		mes = ler.next(); 
		System.out.println("Digite o dia do seu aniversário: "); 
		dia = ler.nextInt(); 
		if((mes.equalsIgnoreCase("janeiro"))&&(dia>1)&&(dia<32)){ 
			System.out.println("Data válida e o mês é: "+mes+" nascido no primeiro trimestre."); 
		} 
		if((mes.equalsIgnoreCase("fevereiro"))&&(dia>1)&&(dia<30)){ 
			System.out.println("Data válida e o mês é: "+mes+" nascido no primeiro trimestre."); 
		} 
		if((mes.equalsIgnoreCase("marco"))&&(dia>1)&&(dia<32)){ 
			System.out.println("Data válida e o mês é: "+mes+" nascido no primeiro trimestre."); 
		} 
		if((mes.equalsIgnoreCase("abril"))&&(dia>1)&&(dia<31)){ 
			System.out.println("Data válida e o mês é: "+mes+" nascido no segundo trimestre."); 
		} 
		if((mes.equalsIgnoreCase("maio"))&&(dia>1)&&(dia<32)){ 
			System.out.println("Data válida e o mês é: "+mes+" nascido no segundo trimestre."); 
		} 
		if((mes.equalsIgnoreCase("junho"))&&(dia>1)&&(dia<31)){ 
			System.out.println("Data válida e o mês é: "+mes+" nascido no segundo trimestre."); 
		} 
		if((mes.equalsIgnoreCase("julho"))&&(dia>1)&&(dia<32)){ 
			System.out.println("Data válida e o mês é: "+mes+" nascido no terceiro trimestre."); 
		} 
		if((mes.equalsIgnoreCase("agosto"))&&(dia>1)&&(dia<32)){ 
			System.out.println("Data válida e o mês é: "+mes+" nascido no terceiro trimestre."); 
		} 
		if((mes.equalsIgnoreCase("setembro"))&&(dia>1)&&(dia<31)){ 
			System.out.println("Data válida e o mês é: "+mes+" nascido no terceiro trimestre."); 
		} 
		if((mes.equalsIgnoreCase("outubro"))&&(dia>1)&&(dia<32)){ 
			System.out.println("Data válida e o mês é: "+mes+" nascido no quarto trimestre."); 
		} 
		if((mes.equalsIgnoreCase("novembro"))&&(dia>1)&&(dia<31)){ 
			System.out.println("Data válida e o mês é: "+mes+" nascido no quarto trimestre."); 
		} 
		if((mes.equalsIgnoreCase("dezembro"))&&(dia>1)&&(dia<32)){ 
			System.out.println("Data válida e o mês é: "+mes+" nascido no quarto trimestre."); 
		} 
	} 
} 