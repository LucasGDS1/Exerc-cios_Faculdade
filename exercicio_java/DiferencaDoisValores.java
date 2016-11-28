/**

* Unicesumar Curitiba - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Repositório: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descrição: Exercício 2) A - Ler dois valores númeridos inteiros

* E apresentar o resultado da diferença do maior valor em relação

* Ao menor valor

*/
public class DiferencaDoisValores
{
	// Método de acesso;
	public static void main(String[] args)
	{
		// Conversão da variável para o parâmetro (args);
		int valor_1 = Integer.parseInt( args[0] );

		// Conversão da variável para o parâmetro (args);
		int valor_2 = Integer.parseInt( args[1] );

		float diferenca = 0;
		
		// Condição para saber se o 1º valor é maior que o 2º valor;
		if(valor_1 > valor_2){

			// Formula para a diferença;
			diferenca = valor_1 - valor_2;

		System.out.println("A diferença entre os números digitados é: "+diferenca);

		// Caso a primeira condição não seja atendida, executa-se essa;
		} else {
			diferenca = valor_2 - valor_1;

		System.out.println("A diferença entre os números digitados é: "+diferenca);
		}
	}
}