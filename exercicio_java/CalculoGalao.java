/**

* Unicesumar Curitiba - Centro Universit�rio Cesumar

* Curso: An�lise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Reposit�rio: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descri��o: Exerc�cio 1) F - Calcular e apresentar o valor do

* Volume de um gal�o

*/
public class CalculoGalao
{
	// M�todo de acesso;
	public static void main(String[] args)
	{
		// Convers�o da vari�vel raio para o par�metro (args);
		float raio = Float.parseFloat( args[0] );

		// Convers�o da vari�vel area para o par�metro (args);
		float area = Float.parseFloat( args[1] );
		
		// Inicializa��o de PI;
		double pi = 3.141592653589793;
		double volume = 0;

		// Formula para calcular o volume do gal�o;
		volume = pi * (raio * raio) * area;

		// Printando o volume;
		System.out.println("O valor do volume do gal�o �: "+volume +" litros");
	}
}