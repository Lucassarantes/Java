import java.util.Scanner;

public class TestaConversao {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		long valorParaConverter = 0;
		double valorConvertido = 0;
		
		System.out.println("Escolha o tipo que deseja inserir: \n 0 - Bits \n 1 - Bytes \n 2 - KiloBytes \n 3 - MegaBytes \n 4 - GigaBytes \n 5 - TeraBytes");
		int tipoInserido = read.nextInt();
		if(tipoInserido < 0 || tipoInserido > 5){
			while(tipoInserido < 0 && tipoInserido > 5){
				System.out.println("Tipo inválido, digite um novo tipo: ");
				tipoInserido = read.nextInt();
			}
		}
		
		System.out.println("Insira o valor desejado: ");
		long valor = read.nextLong();
		if(valor <= 0){
			while(valor <= 0){
				System.out.println("Valor inválido, digite um valor maior que zero: ");
				valor = read.nextLong();
			}
		}
		
		
		System.out.println("Escolha para qual tipo deseja converter: \n 0 - Bits \n 1 - Bytes \n 2 - KiloBytes \n 3 - MegaBytes \n 4 - GigaBytes \n 5 - TeraBytes");
		int tipoConversao = read.nextInt();
		if(tipoConversao < 0 || tipoConversao > 5){
			while(tipoConversao < 0 && tipoConversao > 5){
				System.out.println("Tipo inválido, digite um novo tipo: ");
				tipoInserido = read.nextInt();
			}
		}
		
		switch (tipoInserido) {
			case 1:
				ConverteBytes converteBytes = new ConverteBytes(valor);
				valorParaConverter = converteBytes.converteDeBytesParaBits();
				break;
			case 2:
				ConverteKB converteKB = new ConverteKB(valor);
				valorParaConverter = converteKB.retornaValorConvertidoDeKiloParaBits();
				break;
			case 3:
				ConverteMB converteMB = new ConverteMB(valor);
				valorParaConverter = converteMB.retornaValorConvertidoDeMegaParaBits();
				break;
			case 4:
				ConverteGB converteGB = new ConverteGB(valor);
				valorParaConverter = converteGB.retornaValorConvertidoDeGBParaBits();
				break;
			case 5:
				ConverteTB converteTB = new ConverteTB(valor);
				valorParaConverter = converteTB.retornaValorConvertidoDeTBParaBits();
				break;
	
			default:
				if(tipoInserido == 0){
					valorParaConverter = valor;
				}
				break;
		}
		
		switch (tipoConversao) {
			case 1:
				valorConvertido = valorParaConverter/8;
				System.out.println(valorConvertido);
				break;
			case 2:
				valorConvertido = valorParaConverter/(1024*8);
				System.out.println(valorConvertido);
				break;
			case 3:
				valorConvertido = valorParaConverter/(1024*1024*8);
				System.out.println(valorConvertido);
				break;
			case 4:
				valorConvertido = valorParaConverter/(1024*1024*1024*8);
				System.out.println(valorConvertido);
				break;
			case 5:
				valorConvertido = valorParaConverter/(1024*1024*1024*1024*8);
				System.out.println(valorConvertido);
				break;
	
			default:
				if(tipoConversao == 0){
					System.out.println(valorParaConverter);
				}
				break;
		}
	}
}
