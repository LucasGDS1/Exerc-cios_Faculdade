/**

* Unicesumar Curitiba - Centro Universit�rio Cesumar

* Curso: An�lise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Reposit�rio: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descri��o: Exerc�cio 2) F - Ler quatro valores  inteiros e

* Apresentar, somente os que forem divis�veis por 2 ou 3

*/
public class DivisivelOuDivisivel
{
	// M�todo de acesso;
	public static void main(String[] args)
	{
		// Convers�o das vari�veis para o par�metro (args);
		int vl1 = Integer.parseInt( args[0] );
		int vl2 = Integer.parseInt( args[1] );
		int vl3 = Integer.parseInt( args[2] );
		int vl4 = Integer.parseInt( args[3] );
		
		// Condi��o para o primeiro valor;
		if((vl1 %2 == 0) || (vl1 %3 == 0)){
			System.out.println("O nmr divisivel por 2 ou 3 �: "+vl1);
		}
		
		// Condi��o para o segundo valor;
		if((vl2 %2 == 0) || (vl2 %3 == 0)){
			System.out.println("O nmr divisivel por 2 ou 3 �: "+vl2);
		}

		// Condi��o para o terceiro valor;
		if((vl3 %2 == 0) || (vl3 %3 == 0)){
			System.out.println("O nmr divisivel por 2 ou 3 �: "+vl3);
		}
		
		// Condi��o para o quarto valor;	
		if((vl4 %2 == 0) || (vl4 %3 == 0)){
			System.out.println("O nmr divisivel por 2 ou 3 �: "+vl4);
		} 
	}
}