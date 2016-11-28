/**

* Unicesumar Curitiba - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Repositório: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descrição: Exercício 1) A - Calcular a quantidade de litros de

* Combustivel gasta em uma viagem. Utilizando: tempo gasto e 

* Velocidade Média  

*/
public class CalculoDeCombustivel
{
	// Método de acesso;
	public static void main(String[] args)
	{		
		// Conversão da variável de tempo para o parâmetro (args);
		float tempo = Float.parseFloat( args[0] );

		// Conversão da variável de veloMedia para o parâmetro (args);
		float veloMedia = Float.parseFloat( args[1] );

		double distancia = 0;
		double litros_Usados = 0;

		//Formula para calculo de distância;
		distancia = tempo * veloMedia;

		//Formula para calcular listros usados;
		litros_Usados = distancia/12;
		
		// Printando na tela resultados dos calculos e valores recebidos;
		System.out.println("O tempo de viagem é: "+tempo +"Hrs");
		System.out.println("A velociadade media é: "+veloMedia +"Km");
		System.out.println("A distancia a ser percorrida é: "+distancia +"Km");
		System.out.println("A quantidade de litros usados é: "+litros_Usados +"l");
	}
}				