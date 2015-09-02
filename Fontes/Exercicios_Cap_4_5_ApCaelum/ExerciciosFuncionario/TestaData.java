class TestaData{
	public static void main(String[] args) {
		Data data = new Data();

		data.setDia(31);
		data.setMes(8);
		data.setAno(2015);

		System.out.println(data.mostraData());
	}
}