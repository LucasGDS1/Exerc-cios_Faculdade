/**

* Unicesumar Curitiba - Centro Universit�rio Cesumar

* Curso: An�lise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Reposit�rio: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descri��o: Exerc�cio 2) A - Ler dois valores n�meridos inteiros

* E apresentar o resultado da diferen�a do maior valor em rela��o

* Ao menor valor

*/
public class DiferencaDoisValores
{
	// M�todo de acesso;
	public static void main(String[] args)
	{
		// Convers�o da vari�vel para o par�metro (args);
		int valor_1 = Integer.parseInt( args[0] );

		// Convers�o da vari�vel para o par�metro (args);
		int valor_2 = Integer.parseInt( args[1] );

		float diferenca = 0;
		
		// Condi��o para saber se o 1� valor � maior que o 2� valor;
		if(valor_1 > valor_2){

			// Formula para a diferen�a;
			diferenca = valor_1 - valor_2;

		System.out.println("A diferen�a entre os n�meros digitados �: "+diferenca);

		// Caso a primeira condi��o n�o seja atendida, executa-se essa;
		} else {
			diferenca = valor_2 - valor_1;

		System.out.println("A diferen�a entre os n�meros digitados �: "+diferenca);
		}
	}
}