/**

* Unicesumar Curitiba - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Repositório: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descrição: Exercício 1) D - Ler uma temperatura em Celsius e

* Exibi-la convertida para graus Kelvin

*/
public class ConvertCEmK
{
	// Método de acesso;
	public static void main(String[] args)
	{
		// Conversão da variável celsius para o parâmetro (args);
		float celsius = Float.parseFloat( args[0] );
		double kelvin = 0;

		// Formula para converter celsius em kelvin;
		kelvin = celsius + 273.15;

		// Printando o resultado da converção;
		System.out.println("A temperatura convertida de C para K é: "+kelvin);
	}
}