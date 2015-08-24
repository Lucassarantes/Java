class Exercicio6{
	public static void main(String[] args) {
		int contador, multiplicador, resultado;
		for(contador=0;contador<=10;contador++){
			for(multiplicador=0;multiplicador<=10;multiplicador++){
				resultado = contador*multiplicador;
				System.out.println(contador+"*"+multiplicador+"="+resultado);
			}	
		}
	}
}