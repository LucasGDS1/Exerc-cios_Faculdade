/**

* Unicesumar Curitiba - Centro Universit�rio Cesumar

* Curso: An�lise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Reposit�rio: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descri��o: Exerc�cio 1) C - Ler uma temperatura em Fahrenheit e

* Exibi-la convertida em graus Celsius

*/
public class ConvertFEmC
{
	// M�todo de acesso;
	public static void main(String[] args)
	{
		// Convers�o da vari�vel fahrenheit para o par�metro (args);
		float fahrenheit = Float.parseFloat( args[0] );
		double celsius = 0;

		// Formula para converter fahrenheit em celsius;
		celsius = ((fahrenheit - 32)*5)/9;

		// Printando o resultado na tela;
		System.out.println("A temperatura convertida de F para C �: "+celsius);
	}
}