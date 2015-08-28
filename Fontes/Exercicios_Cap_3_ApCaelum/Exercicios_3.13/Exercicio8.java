class Exercicio8{
	public static void main(String[] args) {
		int contador, numero, multiplica, resultado;
		numero=1;
		resultado=0;
		for(contador=1;contador<=12;contador++){
			for(multiplica=1;multiplica<=contador;multiplica++){
				resultado=(numero*multiplica);
				System.out.print(resultado+" ");
			}
			System.out.println(" ");
			numero+=1;
		}
	}
}