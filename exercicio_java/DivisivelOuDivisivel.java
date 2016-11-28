/**

* Unicesumar Curitiba - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Repositório: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descrição: Exercício 2) F - Ler quatro valores  inteiros e

* Apresentar, somente os que forem divisíveis por 2 ou 3

*/
public class DivisivelOuDivisivel
{
	// Método de acesso;
	public static void main(String[] args)
	{
		// Conversão das variáveis para o parâmetro (args);
		int vl1 = Integer.parseInt( args[0] );
		int vl2 = Integer.parseInt( args[1] );
		int vl3 = Integer.parseInt( args[2] );
		int vl4 = Integer.parseInt( args[3] );
		
		// Condição para o primeiro valor;
		if((vl1 %2 == 0) || (vl1 %3 == 0)){
			System.out.println("O nmr divisivel por 2 ou 3 é: "+vl1);
		}
		
		// Condição para o segundo valor;
		if((vl2 %2 == 0) || (vl2 %3 == 0)){
			System.out.println("O nmr divisivel por 2 ou 3 é: "+vl2);
		}

		// Condição para o terceiro valor;
		if((vl3 %2 == 0) || (vl3 %3 == 0)){
			System.out.println("O nmr divisivel por 2 ou 3 é: "+vl3);
		}
		
		// Condição para o quarto valor;	
		if((vl4 %2 == 0) || (vl4 %3 == 0)){
			System.out.println("O nmr divisivel por 2 ou 3 é: "+vl4);
		} 
	}
}