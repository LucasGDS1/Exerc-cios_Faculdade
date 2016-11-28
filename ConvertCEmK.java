/**

* Unicesumar Curitiba - Centro Universit�rio Cesumar

* Curso: An�lise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Reposit�rio: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descri��o: Exerc�cio 1) D - Ler uma temperatura em Celsius e

* Exibi-la convertida para graus Kelvin

*/
public class ConvertCEmK
{
	// M�todo de acesso;
	public static void main(String[] args)
	{
		// Convers�o da vari�vel celsius para o par�metro (args);
		float celsius = Float.parseFloat( args[0] );
		double kelvin = 0;

		// Formula para converter celsius em kelvin;
		kelvin = celsius + 273.15;

		// Printando o resultado da conver��o;
		System.out.println("A temperatura convertida de C para K �: "+kelvin);
	}
}