class TestaPrimo{
	public static void main(String[] args) {
		Primo primo = new Primo();
		if (primo.testaNumeroPrimo(3) == true){
            System.out.println("É primo!");
        } else
            System.out.println("Nao é primo!");
	}
}
