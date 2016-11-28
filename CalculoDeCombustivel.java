/**

* Unicesumar Curitiba - Centro Universit�rio Cesumar

* Curso: An�lise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Reposit�rio: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descri��o: Exerc�cio 1) A - Calcular a quantidade de litros de

* Combustivel gasta em uma viagem. Utilizando: tempo gasto e 

* Velocidade M�dia  

*/
public class CalculoDeCombustivel
{
	// M�todo de acesso;
	public static void main(String[] args)
	{		
		// Convers�o da vari�vel de tempo para o par�metro (args);
		float tempo = Float.parseFloat( args[0] );

		// Convers�o da vari�vel de veloMedia para o par�metro (args);
		float veloMedia = Float.parseFloat( args[1] );

		double distancia = 0;
		double litros_Usados = 0;

		//Formula para calculo de dist�ncia;
		distancia = tempo * veloMedia;

		//Formula para calcular listros usados;
		litros_Usados = distancia/12;
		
		// Printando na tela resultados dos calculos e valores recebidos;
		System.out.println("O tempo de viagem �: "+tempo +"Hrs");
		System.out.println("A velociadade media �: "+veloMedia +"Km");
		System.out.println("A distancia a ser percorrida �: "+distancia +"Km");
		System.out.println("A quantidade de litros usados �: "+litros_Usados +"l");
	}
}				