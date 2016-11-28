/**

* Unicesumar Curitiba - Centro Universitário Cesumar

* Curso: Análise e Desenvolvimento de Sistemas

* Autor(es): Lucas Gabriel de Souza

* Data: 26/11/16

* Repositório: https://github.com/LucasGDS1/Exerc-cios_Faculdade

* Descrição: Exercício 2) C - Ler quatro valores referentes a 

* Notas escolares de um aluno(a) e apresentar uma mensagem

* Informando se o aluno foi aprovado ou reprovado

*/
public class MediaAluno
{
	// Método de acesso;
	public static void main(String[] args)
	{
		double media = 0;
		
		// (FOR), para receber as quatro notas;
		for(int i = 0; i < 4; i++){
			
			// Conversão das variáveis para o parâmetro (args);
			float nota_1 = Float.parseFloat( args[0] );
			float nota_2 = Float.parseFloat( args[1] );
			float nota_3 = Float.parseFloat( args[2] );
			float nota_4 = Float.parseFloat( args[3] );
			
			// Formula para calcular a média do aluno;
			media = (nota_1+nota_2+nota_3+nota_4)/4;	
		}
			// Condição para saber se média é maior ou igual a 6.0;
			if(media >= 6.0){
				
				// Informativo sobre a situação do aluno;
				System.out.println("O aluno foi APROVADO!!!");
				System.out.println("A média do aluno é: "+media);

			// Caso não seja atendida a primeira condição, executa-se essa;
			}else{
				// Informativo sobre a situação do aluno;
				System.out.println("O aluno infelizmente não passou!!!");
				System.out.println("A média do aluno é: "+media);
			}
	}
}