import java.util.Scanner;
class TestaConta{
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Conta conta = new Conta();
		System.out.println("\n****** CONTA ******");
		System.out.println("\nDigite o nome do titular da conta: ");
		conta.setNome(ler.nextLine());
		System.out.println("titular: "+conta.getNome());
		System.out.println("\nDigite o número da conta: ");
		conta.setNumero(ler.nextInt());
		System.out.println("\nDigite o dígito da conta: ");
		conta.setDigito(ler.nextInt());
		System.out.println("\nNúmero da conta: "+conta.getNumero()+"-"+conta.getDigito());
		System.out.println("\nDigite o cpf do titular da conta: ");
		conta.setCpf(ler.nextLine());
		System.out.println("\nDigite o endereço do titular da conta: ");
		conta.setEndereco(ler.nextLine());
		System.out.println("\nCpf: "+conta.getCpf()+"\nEndereço: "+conta.getEndereco());
		System.out.println("\nDigite o saldo do titular da conta: ");
		conta.setSaldo(ler.nextDouble());
		System.out.println("\nSaldo: "+conta.getSaldo());
		System.out.println("\nDigite o valor a ser depositado na conta: ");
		conta.deposita(ler.nextDouble());
		System.out.println("\nValor depositado: ");
		System.out.println("\nSaldo após depósito com bonus: "+conta.getSaldo());
		System.out.println("\nDigite o valor a ser sacado da conta: ");
		conta.saca(ler.nextDouble());
		System.out.println("\nSaldo após o saque: "+conta.getSaldo());
	}
}