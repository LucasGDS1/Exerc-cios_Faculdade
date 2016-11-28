/**

* Unicesumar Curitiba - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Repositório: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descrição: Exercício 1) E - Ler uma temperatura em Fahrenheit e

* Apresenta-la convertida em graus Kelvin

*/
public class ConvertFEmCeK
{
	// Método de acesso;
	public static void main(String[] args)
	{
		// Conversão da variável fahrenheit para o parâmetro (args);
		float fahrenheit = Float.parseFloat( args[0] );

		double celsius = 0;
		double kelvin = 0;
		
		// Formula para converter fahrenheit em celsius;
		celsius = ((fahrenheit - 32)*5)/9;

		// Formula para converter celsius em kelvin;
		kelvin = celsius + 273.15;
		
		// Printando na tela resultados de celsius e kelvin;
		System.out.println("A temperatura convertida de F para C é: "+celsius);
		System.out.println("A temperatura convertida de C para K é: "+kelvin);
	}
}