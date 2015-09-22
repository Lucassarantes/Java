import java.util.Scanner;
import java.util.Vector;

public class TestaPalavra {

	public static void main(String[] args) {
		Palavra[] reservadas = new Palavra[49];
		String palavra;
		Scanner read = new Scanner(System.in);
		reservadas[0] = new Palavra("private", "Acesso apenas dentro da classe.");
		reservadas[1] = new Palavra("protected", "Acesso por classes no mesmo pacote e subclasses.");
		reservadas[2] = new Palavra("public", "Acesso de qualquer classe.");
		reservadas[3] = new Palavra("abstract",
				"Classe que não pode ser instanciada ou método que precisa ser implementado por uma subclasse não abstrata.");
		reservadas[4] = new Palavra("class", "Especifica uma classe.");
		reservadas[5] = new Palavra("extends", "Indica a superclasse que a subclasse está herdando.");
		reservadas[6] = new Palavra("final",
				"Impossibilita que uma classe seja extendida, que um método seja reescrito ou que uma variável seja reinicializada.");
		reservadas[7] = new Palavra("implements", "Indica as interfaces que uma classe irá implementar.");
		reservadas[8] = new Palavra("interface", "Especifica uma interface.");
		reservadas[9] = new Palavra("native",
				"Indica que um método está escrito em uma classe dependente de plataforma, como c.");
		reservadas[10] = new Palavra("new", "Instancia um novo objeto chamando seu construtor");
		reservadas[11] = new Palavra("static",
				"Faz um método ou variável pertencer à classe ao invés de pertencer às instâncias.");
		reservadas[12] = new Palavra("strictfp",
				"Usado em frente à um método ou classe para indicar que todos os valores de ponto flutuante seguiram a regra de ponto flutuante em todas as expressões.");
		reservadas[13] = new Palavra("synchronized",
				"Indica que um método só pode ser acessado por uma thread de cada vez.");
		reservadas[14] = new Palavra("transient", "Impede a serialização de campos.");
		reservadas[15] = new Palavra("volatile", "Indica que uma variável pode ser alterada durante o uso de threads.");
		reservadas[16] = new Palavra("break", "Sai do bloco de código em que ele está.");
		reservadas[17] = new Palavra("case", "Exercuta um bloco de código dependendo do teste do switch.");
		reservadas[18] = new Palavra("continue", "Pula a proxima execução de código para a próxima passagem do loop.");
		reservadas[19] = new Palavra("default",
				"Executa um bloco de código caso nenhum dos testes do switch seja verdadeiro.");
		reservadas[20] = new Palavra("do",
				"Executa um bloco de código uma vez, e então realiza um teste em conjunto do while para saber se o código será executado novamente.");
		reservadas[21] = new Palavra("else", "Executa um bloco de código alternativo caso o teste do if seja falso.");
		reservadas[22] = new Palavra("for", "Usado para realizar um loop condicional de um bloco de código.");
		reservadas[23] = new Palavra("if",
				"Usado para realizar um teste de verdadeiro ou falso e se verdadeiro executa um bloco de código.");
		reservadas[24] = new Palavra("instanceof",
				"Determina se um objeto é uma instância de determinada classe, superclasse ou interface.");
		reservadas[25] = new Palavra("return",
				"Retorna de um método sem executar qualquer código que venha depois dessa linha.");
		reservadas[26] = new Palavra("switch", "Indica a variável a ser comparada nas expressões case.");
		reservadas[27] = new Palavra("while",
				"Executa um bloco de código repetidamente enquanto a condição for verdadeira.");
		reservadas[28] = new Palavra("assert",
				"Testa uma expressão condicional para verificar uma suposição do programador.");
		reservadas[29] = new Palavra("catch", "Declara o bloco de código usado para tratar uma exceção.");
		reservadas[30] = new Palavra("finally",
				"Bloco de código, após um try-catch, que é executado independente do fluxo de programa seguido ao lidar com uma exceção.");
		reservadas[31] = new Palavra("throw", "Usado para passar uma exceção para o método que o chamou.");
		reservadas[32] = new Palavra("throws",
				"Indica que um método pode passar uma exceção para o método que o chamou.");
		reservadas[33] = new Palavra("try",
				"Bloco de código que tentará ser executado, mas que pode causar uma exceção.");
		reservadas[34] = new Palavra("import", "Importa pacotes ou classes para dentro do código.");
		reservadas[35] = new Palavra("package", "Especifica a que pacote todas as classes de um arquivo pertencem.");
		reservadas[36] = new Palavra("boolean", "Um valor indicando verdadeiro ou falso.");
		reservadas[37] = new Palavra("byte", "Um inteiro de 8 bits.");
		reservadas[38] = new Palavra("char", "Um caracter unicode 16 bits.");
		reservadas[39] = new Palavra("double", "Um numero de ponto flutuante de 64 bits.");
		reservadas[40] = new Palavra("float", "Um numero de ponto flutuante de 32 bits.");
		reservadas[41] = new Palavra("int", "Um numero inteiro de 32 bits.");
		reservadas[42] = new Palavra("long", "Um numero inteiro de 64 bits.");
		reservadas[43] = new Palavra("short", "Um numero inteiro de 32 bits");
		reservadas[44] = new Palavra("super", "Refere-se a superclasse imediata");
		reservadas[45] = new Palavra("this", "Refere-se a instância atual do objeto.");
		reservadas[46] = new Palavra("void", "Indica que o método não tem retorno.");
		reservadas[47] = new Palavra("const", "Não utilize para criar constantes, utilize: public static final.");
		reservadas[48] = new Palavra("goto", "Não implementada na linguagem java por ser considerada prejudicial.");

		System.out.println("1 - Digite uma palavra que deseja procurar \n2 - Digite lista para ver todas as palavras \n3 - Digite inserir para adicionar uma nova palavra e sua descrição à lista \n4 - sair para encerrar o programa: ");
		String escolha = read.nextLine();
		while (!escolha.equals("sair")) {
			switch(escolha){
				case "lista":
						for(int contador = 0; contador < 49; contador++){
							System.out.println(reservadas[contador].getPalavra());
						}
				break;
				
				default:
					for(int contador = 0; contador < 49; contador ++){
						if(reservadas[contador].getPalavra().equals(escolha)){
							System.out.println("\n"+reservadas[contador].getPalavra()+"\n"+reservadas[contador].getDescricao());
							break;
						}
					}
					System.out.println();
				break;
			}
			System.out.println("1 - Digite uma palavra que deseja procurar \n2 - Digite lista para ver todas as palavras \n3 - Digite inserir para adicionar uma nova palavra e sua descrição à lista \n4 - sair para encerrar o programa: ");
			escolha = read.nextLine();
		}
	}
}
