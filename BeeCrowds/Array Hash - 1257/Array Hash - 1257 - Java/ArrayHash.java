import java.util.*;


public class ArrayHash {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int caseTest, numStrings, hash;

		caseTest = scanner.nextInt();

		for(int i =0;i<caseTest;i++) {
			
			numStrings = scanner.nextInt();                //Utiliza-se a princípio, a abordagem de força bruta, utilizando de 3 laços aninhados, a fim de garantir a leitura dos parâmetros
                                                
			 hash = 0;

			for(int j = 0;j<numStrings;j++) {           //Aproveita-se das variáveis declaradas dentro do laço, para contabilizar a ordem de entrada de cada string

				String expression =  scanner.next();

				for(int k =0;k<expression.length();k++) {                //Assim como para contabilizar a posição do carectere na string.

					hash += (expression.charAt(k) - 'A') + j + k;        //Ao executar (k) - 'A' se retorna a posição do caractere no alfabeto, devido à subtração de valores ASCII.

				}

			}

			System.out.println(hash);

		}

		scanner.close();

	}
}


