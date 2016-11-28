/**

* Unicesumar Curitiba - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Repositório: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descrição: Exercício 2) G - Ler um valor inteiro e verificar se

* Está entre 1 e 9

*/
public class DentroDaFaixa
{
	// Método de acesso;
	public static void main(String[] args)
	{
		// Conversão da variável para o parâmetro (args);
		int number = Integer.parseInt( args[0] );
		
		// Condição para verificar se o valor está entre 1 e 9;
		if((number > 0) && (number < 9)){
			System.out.println("O valor está na faixa permitida");

		// Caso a primeira condição não seja atendida, executa-se essa;
		} else{
			System.out.println("O valor esta fora da faixa permitida");
		}
	}
}