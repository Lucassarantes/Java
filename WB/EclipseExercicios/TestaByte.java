import java.util.Scanner;
public class TestaByte {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Byte conversor = new Byte();
		System.out.println("Digite o valor desejado para conversão: ");
		conversor.setBits(leia.nextLong());
		System.out.println("Para qual tipo deseja converter: \n 0 - bits \n 1 - byte \n 2 - KiloByte \n 3 - MegaByte \n 4 - GigaByte \n 5 - TeraByte");
		conversor.convertido(leia.nextInt());
	}

}
