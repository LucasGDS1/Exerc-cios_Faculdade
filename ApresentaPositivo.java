/**

* Unicesumar Curitiba - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Repositório: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descrição: Exercício 2) B - Ler um valor inteiro qualquer, positivo

* Ou negativo e apresenta-lo com um valor (POSITIVO) 

*/
public class ApresentaPositivo
{
	// Método de acesso;
	public static void main(String[] args)
	{
		// Variável sendo convertida para o parâmetro ( args );
		int valor_1 = Integer.parseInt( args[0] );
		
		// Condição para saber se o número é negativo ou não;
		if(valor_1 < 0){
			// Formula para transforma valor, negativo em positivo;
			valor_1 = valor_1 * (-1);
			System.out.println("A valor digitado positivo é: "+valor_1);
		// Caso valor já seja positivo, printa na tela o valor;
		}else {
			System.out.println("O valor digitado foi: "+valor_1);
		}
	}
}
		