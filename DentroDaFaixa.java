/**

* Unicesumar Curitiba - Centro Universit�rio Cesumar

* Curso: An�lise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Reposit�rio: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descri��o: Exerc�cio 2) G - Ler um valor inteiro e verificar se

* Est� entre 1 e 9

*/
public class DentroDaFaixa
{
	// M�todo de acesso;
	public static void main(String[] args)
	{
		// Convers�o da vari�vel para o par�metro (args);
		int number = Integer.parseInt( args[0] );
		
		// Condi��o para verificar se o valor est� entre 1 e 9;
		if((number > 0) && (number < 9)){
			System.out.println("O valor est� na faixa permitida");

		// Caso a primeira condi��o n�o seja atendida, executa-se essa;
		} else{
			System.out.println("O valor esta fora da faixa permitida");
		}
	}
}