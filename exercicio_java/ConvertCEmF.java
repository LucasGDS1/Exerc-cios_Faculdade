/**

* Unicesumar Curitiba - Centro Universit�rio Cesumar

* Curso: An�lise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Reposit�rio: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descri��o: Exerc�cio 1) B - Ler uma temperatura em Celsius e 

* Exibi-la convertida em graus Fahrenheit

*/
public class ConvertCEmF
{
	// M�todo de acesso;
	public static void main(String[] args)
	{
		// Convers�o da vari�vel celsius para o par�metro (args);
		float Celsius = Float.parseFloat( args[0] );
		double Fahrenheit = 0;
		
		// Formula para convers�o de celsius para fahrenheit;
		Fahrenheit = (9 * Celsius + 160)/5;

		// Printando resultado na tela;
		System.out.println("A temperatura convertida de C para F �: "+Fahrenheit);
	}
}