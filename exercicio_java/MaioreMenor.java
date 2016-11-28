/**

* Unicesumar Curitiba - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Repositório: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descrição: Exercício 2) H - Ler cinco valores  inteiros e

* Apresentar, o maior e menor valor informado

*/
public class MaioreMenor
{	
	// Inicialização das variáveis ;	
	static int maior = 0;
	static int menor = 10;
	
	// Método de acesso;
	public static void main(String[] args)
	{
		// Vetor que recebe como atributos, a conversão dos valores;
		// Passados depois de (args);
		int VALOR[] = {Integer.parseInt( args[0] ), Integer.parseInt( args[1] ),
				Integer.parseInt( args[2] ), Integer.parseInt( args[3] ),
				Integer.parseInt( args[4] )};
		
		// (FOR), para percorrer o vetor;
		for(int i = 0; i < VALOR.length; i++)
		{
			// Condição para encontrar o maior valor informado;
			if(VALOR[i] > maior)
			{
				maior = VALOR[i];
			}
		}
		
		// (FOR), para percorrer o vetor;
		for(int i = 0; i < VALOR.length; i++)
		{	
			// Condição para encontrar o menor valor digitado;
			if(VALOR[i] < menor)
			{
				menor = VALOR[i];
			}
		}
		
		// Printando na tela, maior e menor valor encontrado;
		System.out.println("O maior valor digitado foi: "+maior);
		System.out.println("O menor valor digitado foi: "+menor);
	}
}					