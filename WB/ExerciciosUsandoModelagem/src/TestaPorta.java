import java.util.Scanner;
public class TestaPorta {

	public static void main(String[] args) {
		String aberta;
		Porta porta = new Porta();
		Porta porta1 = new Porta();
		Scanner read = new Scanner(System.in);
		
		
		System.out.println("Digite a cor que deseja para uma porta: ");
		porta.pinta(read.nextLine());
		System.out.println("Digite a cor que deseja para a segunda porta: ");
		porta1.pinta(read.nextLine());
		
		System.out.println("Digite as dimenssões da porta: ");
		porta.setDimensaoX(read.nextDouble());
		porta.setDimensaoY(read.nextDouble());
		porta.setDimensaoZ(read.nextDouble());
		
		System.out.println("Digite as dimenssões da segunda porta: ");
		porta1.setDimensaoX(read.nextDouble());
		porta1.setDimensaoY(read.nextDouble());
		porta1.setDimensaoZ(read.nextDouble());
		
		
		System.out.println("Digite se a porta está aberta ou fechada: ");
		aberta = "aberta";
		porta.abre(aberta);
		porta.fecha(aberta);
		
		System.out.println("Digite se a segunda porta está aberta ou fechada: ");
		aberta = "aberta";
		porta1.abre(aberta);
		porta1.fecha(aberta);
		
		System.out.println("\n\nDados das portas: \nDimenssões da porta: "+porta.getDimensaoX()+" "+porta.getDimensaoY()+" "+porta.getDimensaoZ()+"\nCor da porta: "+porta.getCor()+"\nA porta está aberta? "+porta.estaAberta());
		System.out.println("\nDimenssões da segunda porta: "+porta1.getDimensaoX()+" "+porta1.getDimensaoY()+" "+porta1.getDimensaoZ()+"\nCor da segunda porta: "+porta1.getCor()+"\nA segunda porta está aberta? "+porta1.estaAberta()+"\nO total de portas abertas é: "+porta1.mostraTotalDePortasAbertas());
	}
}
