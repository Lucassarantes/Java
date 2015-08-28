class Conta{
	String titular;
	int numero;
	int digito;
	String cpf;
	String endereco;
	double saldo;

	void setNome(String nome){
		this.titular = nome;
	}
	String getNome(){
		return this.titular;
	}
	void setNumero(int numero){
		this.numero = numero;
	}
	int getNumero(){
		return this.numero;
	}
	void setDigito(int numero){
		this.digito = numero;
	}
	int getDigito(){
		return this.digito;
	}
	void setCpf(String cpf){
		this.cpf = cpf;
	}
	String getCpf(){
		return this.cpf;
	}
	void setEndereco(String endereco){
		this.endereco = endereco;
	}
	String getEndereco(){
		return this.endereco;
	}
	void setSaldo(double valor){
		this.saldo = valor;
	}
	double getSaldo(){
		return this.saldo;
	}
	void deposita(double valor){
		if (valor<=100) {
			valor = valor + (valor*0.1);
		}else{
			valor = valor + (valor * 0.1);
		}
		setSaldo(getSaldo()+valor);
	}
	void saca(double valor){
		setSaldo(getSaldo()-valor);
	}
}



class TestaConta{
	public static void main(String[] args) {
		Conta conta = new Conta();
		System.out.println("\n****** CONTA ******");
		conta.setNome("Lucas");
		System.out.println("titular: "+conta.getNome());
		conta.setNumero(123456789);
		conta.setDigito(0);
		System.out.println("\nNúmero da conta: "+conta.getNumero()+"-"+conta.getDigito());
		conta.setCpf("470/190/118-02");
		conta.setEndereco("Rua Sao Pedro da Aldeia, 69.");
		System.out.println("\nCpf: "+conta.getCpf()+"\nEndereço: "+conta.getEndereco());
		conta.setSaldo(900);
		System.out.println("\nSaldo: "+conta.getSaldo());
		conta.deposita(200);
		System.out.println("\nSaldo após depósito com bonus: "+conta.getSaldo());
		conta.saca(50);
		System.out.println("\nSaldo após o saque: "+conta.getSaldo());
	}
}