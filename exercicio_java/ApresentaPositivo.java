/**

* Unicesumar Curitiba - Centro Universit�rio Cesumar

* Curso: An�lise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Reposit�rio: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descri��o: Exerc�cio 2) B - Ler um valor inteiro qualquer, positivo

* Ou negativo e apresenta-lo com um valor (POSITIVO) 

*/
public class ApresentaPositivo
{
	// M�todo de acesso;
	public static void main(String[] args)
	{
		// Vari�vel sendo convertida para o par�metro ( args );
		int valor_1 = Integer.parseInt( args[0] );
		
		// Condi��o para saber se o n�mero � negativo ou n�o;
		if(valor_1 < 0){
			// Formula para transforma valor, negativo em positivo;
			valor_1 = valor_1 * (-1);
			System.out.println("A valor digitado positivo �: "+valor_1);
		// Caso valor j� seja positivo, printa na tela o valor;
		}else {
			System.out.println("O valor digitado foi: "+valor_1);
		}
	}
}
		