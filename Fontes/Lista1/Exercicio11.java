import java.util.Scanner;
class Exercicio11{
	public static void main(String[] args) {
		String mes; 
		int dia, anoAtual, anoNascimento, idade;
		Scanner ler = new Scanner(System.in); 
		System.out.println("Digite o ano de seu nascimento: "); 
		anoNascimento = ler.nextInt(); 
		System.out.println("Digite o ano atual: "); 
		anoAtual = ler.nextInt(); 
		System.out.println("Digite o nome do mês de seu aniversário: "); 
		mes = ler.next(); 
		System.out.println("Digite o dia do seu aniversário: "); 
		dia = ler.nextInt(); 
		if((mes.equalsIgnoreCase("janeiro"))&&(dia>1)&&(dia<32)){ 
			if(dia<=20){
				System.out.println("Data válida e o mês é: "+mes+" nascido no primeiro trimestre, e o signo é: Capricornio.");
			}else{
				System.out.println("Data válida e o mês é: "+mes+" nascido no primeiro trimestre, e o signo é: Aquario.");
			} 
		}if((mes.equalsIgnoreCase("fevereiro"))&&(dia>1)&&(dia<30)){ 
			if(dia<=19){
				System.out.println("Data válida e o mês é: "+mes+" nascido no primeiro trimestre, e o signo é: Aquario.");
			}else{
				System.out.println("Data válida e o mês é: "+mes+" nascido no primeiro trimestre, e o signo é: Peixes.");
			}
		}if((mes.equalsIgnoreCase("marco"))&&(dia>1)&&(dia<32)){ 
			if(dia<=20){
				System.out.println("Data válida e o mês é: "+mes+" nascido no primeiro trimestre, e o signo é: Peixes.");
			}else{
				System.out.println("Data válida e o mês é: "+mes+" nascido no primeiro trimestre, e o signo é: Aries.");
			}
		}if((mes.equalsIgnoreCase("abril"))&&(dia>1)&&(dia<31)){ 
			if(dia<=20){
				System.out.println("Data válida e o mês é: "+mes+" nascido no segundo trimestre, e o signo é: Aries.");
			}else{
				System.out.println("Data válida e o mês é: "+mes+" nascido no segundo trimestre, e o signo é: Touro.");
			}
		}if((mes.equalsIgnoreCase("maio"))&&(dia>1)&&(dia<32)){ 
			if(dia<=21){
				System.out.println("Data válida e o mês é: "+mes+" nascido no segundo trimestre, e o signo é: Touro.");
			}else{
				System.out.println("Data válida e o mês é: "+mes+" nascido no segundo trimestre, e o signo é: Gemeos.");
			}
		}if((mes.equalsIgnoreCase("junho"))&&(dia>1)&&(dia<31)){ 
			if(dia<=21){
				System.out.println("Data válida e o mês é: "+mes+" nascido no segundo trimestre, e o signo é: Gemeos.");
			}else{
				System.out.println("Data válida e o mês é: "+mes+" nascido no segundo trimestre, e o signo é: Cancer.");
			}
		}if((mes.equalsIgnoreCase("julho"))&&(dia>1)&&(dia<32)){ 
				if(dia<=23){
			System.out.println("Data válida e o mês é: "+mes+" nascido no terceiro trimestre, e o signo é: Cancer.");
		}else{
			System.out.println("Data válida e o mês é: "+mes+" nascido no terceiro trimestre, e o signo é: Leao.");
		}
		}if((mes.equalsIgnoreCase("agosto"))&&(dia>1)&&(dia<32)){ 
			if(dia<=23){
				System.out.println("Data válida e o mês é: "+mes+" nascido no terceiro trimestre, e o signo é: Leao.");
			}else{
				System.out.println("Data válida e o mês é: "+mes+" nascido no terceiro trimestre, e o signo é: Virgem.");
			}
		}if((mes.equalsIgnoreCase("setembro"))&&(dia>1)&&(dia<31)){ 
			if(dia<=23){
				System.out.println("Data válida e o mês é: "+mes+" nascido no terceiro trimestre, e o signo é: Virgem.");
			}else{
			System.out.println("Data válida e o mês é: "+mes+" nascido no terceiro trimestre, e o signo é: Libra.");
		}
		}if((mes.equalsIgnoreCase("outubro"))&&(dia>1)&&(dia<32)){ 
			if(dia<=23){
				System.out.println("Data válida e o mês é: "+mes+" nascido no quarto trimestre, e o signo é: Libra.");
			}else{
				System.out.println("Data válida e o mês é: "+mes+" nascido no quarto trimestre, e o signo é: Escorpiao.");
			}
		}if((mes.equalsIgnoreCase("novembro"))&&(dia>1)&&(dia<31)){ 
			if(dia<=22){
				System.out.println("Data válida e o mês é: "+mes+" nascido no quarto trimestre, e o signo é: Escorpiao.");
			}else{
				System.out.println("Data válida e o mês é: "+mes+" nascido no quarto trimestre, e o signo é: Sagitario.");
			}
		}if((mes.equalsIgnoreCase("dezembro"))&&(dia>1)&&(dia<32)){ 
			if(dia<=22){
				System.out.println("Data válida e o mês é: "+mes+" nascido no quarto trimestre, e o signo é: Sagitario.");
			}else{
				System.out.println("Data válida e o mês é: "+mes+" nascido no quarto trimestre, e o signo é: Capricornio.");
			}
		}
		idade = anoAtual-anoNascimento; 
		System.out.println("Você fez ou vai fazer: "+idade+" anos esse ano.");
	}	
}
