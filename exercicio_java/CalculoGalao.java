/**

* Unicesumar Curitiba - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Repositório: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descrição: Exercício 1) F - Calcular e apresentar o valor do

* Volume de um galão

*/
public class CalculoGalao
{
	// Método de acesso;
	public static void main(String[] args)
	{
		// Conversão da variável raio para o parâmetro (args);
		float raio = Float.parseFloat( args[0] );

		// Conversão da variável area para o parâmetro (args);
		float area = Float.parseFloat( args[1] );
		
		// Inicialização de PI;
		double pi = 3.141592653589793;
		double volume = 0;

		// Formula para calcular o volume do galão;
		volume = pi * (raio * raio) * area;

		// Printando o volume;
		System.out.println("O valor do volume do galão é: "+volume +" litros");
	}
}