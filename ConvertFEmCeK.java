/**

* Unicesumar Curitiba - Centro Universit�rio Cesumar

* Curso: An�lise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Reposit�rio: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descri��o: Exerc�cio 1) E - Ler uma temperatura em Fahrenheit e

* Apresenta-la convertida em graus Kelvin

*/
public class ConvertFEmCeK
{
	// M�todo de acesso;
	public static void main(String[] args)
	{
		// Convers�o da vari�vel fahrenheit para o par�metro (args);
		float fahrenheit = Float.parseFloat( args[0] );

		double celsius = 0;
		double kelvin = 0;
		
		// Formula para converter fahrenheit em celsius;
		celsius = ((fahrenheit - 32)*5)/9;

		// Formula para converter celsius em kelvin;
		kelvin = celsius + 273.15;
		
		// Printando na tela resultados de celsius e kelvin;
		System.out.println("A temperatura convertida de F para C �: "+celsius);
		System.out.println("A temperatura convertida de C para K �: "+kelvin);
	}
}