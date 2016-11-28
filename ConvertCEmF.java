/**

* Unicesumar Curitiba - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Repositório: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descrição: Exercício 1) B - Ler uma temperatura em Celsius e 

* Exibi-la convertida em graus Fahrenheit

*/
public class ConvertCEmF
{
	// Método de acesso;
	public static void main(String[] args)
	{
		// Conversão da variável celsius para o parâmetro (args);
		float Celsius = Float.parseFloat( args[0] );
		double Fahrenheit = 0;
		
		// Formula para conversão de celsius para fahrenheit;
		Fahrenheit = (9 * Celsius + 160)/5;

		// Printando resultado na tela;
		System.out.println("A temperatura convertida de C para F é: "+Fahrenheit);
	}
}