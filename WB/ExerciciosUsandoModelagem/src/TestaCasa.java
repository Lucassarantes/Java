import java.util.Scanner;
public class TestaCasa {

	public static void main(String[] args) {
		Casa casa = new Casa();
		Scanner read = new Scanner(System.in);
		System.out.println("Escolha uma cor para a casa: ");
		casa.pinta(read.nextLine());
		
		System.out.println("Escolha uma cor para a primeira porta da casa: ");
		casa.porta1.pinta(read.nextLine());
		
		System.out.println("Escolha uma cor para a segunda porta da casa: ");
		casa.porta2.pinta(read.nextLine());
		
		System.out.println("Escolha uma cor para a terceira porta da casa: ");
		casa.porta3.pinta(read.nextLine());
		
		System.out.println("Digite aberta para deixar a primeira porta aberta ou fechada para deixar fechada: ");
		String aberta1 = read.nextLine();
		casa.porta1.abre(aberta1);
		casa.porta1.fecha(aberta1);
		
		System.out.println("Digite aberta para deixar a segunda porta aberta ou fechada para deixar fechada: ");
		String aberta2 = read.nextLine();
		casa.porta2.abre(aberta2);
		casa.porta2.fecha(aberta2);
		
		System.out.println("Digite aberta para deixar a terceira porta aberta ou fechada para deixar fechada: ");
		String aberta3 = read.nextLine();
		casa.porta3.abre(aberta3);
		casa.porta3.fecha(aberta3);
		
		System.out.println("\n\nDados da casa:"+"\nCor da casa: "+casa.getCor()+"\nTotal de portas: "+casa.mostraTotalDePortas());
		System.out.println("\nDados das portas: \n\nDimenssões da porta: "+casa.porta1.getDimensaoX()+" "+casa.porta1.getDimensaoY()+" "+casa.porta1.getDimensaoZ()+"\nCor da porta: "+casa.porta1.getCor()+"\nA porta está aberta? "+casa.porta1.estaAberta());
		System.out.println("\nDimenssões da segunda porta: "+casa.porta2.getDimensaoX()+" "+casa.porta2.getDimensaoY()+" "+casa.porta2.getDimensaoZ()+"\nCor da segunda porta: "+casa.porta2.getCor()+"\nA segunda porta está aberta? "+casa.porta2.estaAberta());
		System.out.println("\nDimenssões da segunda porta: "+casa.porta2.getDimensaoX()+" "+casa.porta2.getDimensaoY()+" "+casa.porta3.getDimensaoZ()+"\nCor da segunda porta: "+casa.porta3.getCor()+"\nA segunda porta está aberta? "+casa.porta3.estaAberta()+"\nO total de portas abertas é: "+casa.quantidadeDePortasAbertas());
	}

}
