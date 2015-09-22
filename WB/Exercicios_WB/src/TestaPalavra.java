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
				"Classe que n�o pode ser instanciada ou m�todo que precisa ser implementado por uma subclasse n�o abstrata.");
		reservadas[4] = new Palavra("class", "Especifica uma classe.");
		reservadas[5] = new Palavra("extends", "Indica a superclasse que a subclasse est� herdando.");
		reservadas[6] = new Palavra("final",
				"Impossibilita que uma classe seja extendida, que um m�todo seja reescrito ou que uma vari�vel seja reinicializada.");
		reservadas[7] = new Palavra("implements", "Indica as interfaces que uma classe ir� implementar.");
		reservadas[8] = new Palavra("interface", "Especifica uma interface.");
		reservadas[9] = new Palavra("native",
				"Indica que um m�todo est� escrito em uma classe dependente de plataforma, como c.");
		reservadas[10] = new Palavra("new", "Instancia um novo objeto chamando seu construtor");
		reservadas[11] = new Palavra("static",
				"Faz um m�todo ou vari�vel pertencer � classe ao inv�s de pertencer �s inst�ncias.");
		reservadas[12] = new Palavra("strictfp",
				"Usado em frente � um m�todo ou classe para indicar que todos os valores de ponto flutuante seguiram a regra de ponto flutuante em todas as express�es.");
		reservadas[13] = new Palavra("synchronized",
				"Indica que um m�todo s� pode ser acessado por uma thread de cada vez.");
		reservadas[14] = new Palavra("transient", "Impede a serializa��o de campos.");
		reservadas[15] = new Palavra("volatile", "Indica que uma vari�vel pode ser alterada durante o uso de threads.");
		reservadas[16] = new Palavra("break", "Sai do bloco de c�digo em que ele est�.");
		reservadas[17] = new Palavra("case", "Exercuta um bloco de c�digo dependendo do teste do switch.");
		reservadas[18] = new Palavra("continue", "Pula a proxima execu��o de c�digo para a pr�xima passagem do loop.");
		reservadas[19] = new Palavra("default",
				"Executa um bloco de c�digo caso nenhum dos testes do switch seja verdadeiro.");
		reservadas[20] = new Palavra("do",
				"Executa um bloco de c�digo uma vez, e ent�o realiza um teste em conjunto do while para saber se o c�digo ser� executado novamente.");
		reservadas[21] = new Palavra("else", "Executa um bloco de c�digo alternativo caso o teste do if seja falso.");
		reservadas[22] = new Palavra("for", "Usado para realizar um loop condicional de um bloco de c�digo.");
		reservadas[23] = new Palavra("if",
				"Usado para realizar um teste de verdadeiro ou falso e se verdadeiro executa um bloco de c�digo.");
		reservadas[24] = new Palavra("instanceof",
				"Determina se um objeto � uma inst�ncia de determinada classe, superclasse ou interface.");
		reservadas[25] = new Palavra("return",
				"Retorna de um m�todo sem executar qualquer c�digo que venha depois dessa linha.");
		reservadas[26] = new Palavra("switch", "Indica a vari�vel a ser comparada nas express�es case.");
		reservadas[27] = new Palavra("while",
				"Executa um bloco de c�digo repetidamente enquanto a condi��o for verdadeira.");
		reservadas[28] = new Palavra("assert",
				"Testa uma express�o condicional para verificar uma suposi��o do programador.");
		reservadas[29] = new Palavra("catch", "Declara o bloco de c�digo usado para tratar uma exce��o.");
		reservadas[30] = new Palavra("finally",
				"Bloco de c�digo, ap�s um try-catch, que � executado independente do fluxo de programa seguido ao lidar com uma exce��o.");
		reservadas[31] = new Palavra("throw", "Usado para passar uma exce��o para o m�todo que o chamou.");
		reservadas[32] = new Palavra("throws",
				"Indica que um m�todo pode passar uma exce��o para o m�todo que o chamou.");
		reservadas[33] = new Palavra("try",
				"Bloco de c�digo que tentar� ser executado, mas que pode causar uma exce��o.");
		reservadas[34] = new Palavra("import", "Importa pacotes ou classes para dentro do c�digo.");
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
		reservadas[45] = new Palavra("this", "Refere-se a inst�ncia atual do objeto.");
		reservadas[46] = new Palavra("void", "Indica que o m�todo n�o tem retorno.");
		reservadas[47] = new Palavra("const", "N�o utilize para criar constantes, utilize: public static final.");
		reservadas[48] = new Palavra("goto", "N�o implementada na linguagem java por ser considerada prejudicial.");

		System.out.println("1 - Digite uma palavra que deseja procurar \n2 - Digite lista para ver todas as palavras \n3 - Digite inserir para adicionar uma nova palavra e sua descri��o � lista \n4 - sair para encerrar o programa: ");
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
			System.out.println("1 - Digite uma palavra que deseja procurar \n2 - Digite lista para ver todas as palavras \n3 - Digite inserir para adicionar uma nova palavra e sua descri��o � lista \n4 - sair para encerrar o programa: ");
			escolha = read.nextLine();
		}
	}
}
