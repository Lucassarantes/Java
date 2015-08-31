class Conta{
	private String titular;
	private int numero;
	private int digito;
	private String cpf;
	private String endereco;
	private double saldo;

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
		if (valor<0) {
			System.out.println("Valor inválido.");
		}else{
			this.saldo = valor;
		}
	}
	double getSaldo(){
		return this.saldo;
	}
	void deposita(double valor){
		if (valor<0){
			System.out.println("Valor inválido.");
		}else{
			if (valor<=100) {
				valor = valor + (valor * 0.1);
			}else{
				valor = valor + (valor * 0.2);
			}
		}
		setSaldo(getSaldo()+valor);
	}
	void saca(double valor){
		if (valor<0 || valor>getSaldo()) {
			System.out.println("Valor inválido!");
		}else{
			setSaldo(getSaldo()-valor);
		}
	}
}