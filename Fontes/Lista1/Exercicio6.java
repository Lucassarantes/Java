import java.util.Scanner;
class Exercicio6{
	public static void main(String[] args) {
		String nome;
		int nota1, nota2, nota3, media, mediaRecuperacao, notaRecuperacao;
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite o nome da materia: ");
		nome = ler.nextLine();
		System.out.println("Digite a primeira nota: ");
		nota1 = ler.nextInt();
		System.out.println("Digite a segunda nota: ");
		nota2 = ler.nextInt();
		System.out.println("Digite a terceira nota: ");
		nota3 = ler.nextInt();

		media = (nota1+nota2+nota3)/3;
		mediaRecuperacao = (media+notaRecuperacao)/2;

		if (media<5) {
			System.out.println(nome+" Reprovado "+media)
		}if(media>=5 && media<7){
			System.out.println(nome+" Recuperação "+media);
		}if (media>7) {	
			System.out.println(nome+" Aprovado "+media);
		}
		if(media>=5 && media<7){		
			if (mediaRecuperacao>5) {
				System.out.println(nome+" Aprovado "+mediaRecuperacao);
			}
		}
	}
}