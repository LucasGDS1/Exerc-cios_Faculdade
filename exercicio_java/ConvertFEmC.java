/**

* Unicesumar Curitiba - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Repositório: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descrição: Exercício 1) C - Ler uma temperatura em Fahrenheit e

* Exibi-la convertida em graus Celsius

*/
public class ConvertFEmC
{
	// Método de acesso;
	public static void main(String[] args)
	{
		// Conversão da variável fahrenheit para o parâmetro (args);
		float fahrenheit = Float.parseFloat( args[0] );
		double celsius = 0;

		// Formula para converter fahrenheit em celsius;
		celsius = ((fahrenheit - 32)*5)/9;

		// Printando o resultado na tela;
		System.out.println("A temperatura convertida de F para C é: "+celsius);
	}
}