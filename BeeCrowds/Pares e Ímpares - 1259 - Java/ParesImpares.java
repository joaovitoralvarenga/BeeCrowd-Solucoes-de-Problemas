import java.util.*;


public class ParesImpares {

	

	public static int particiona(int[] arr, int esq, int dir) {
		int pivo = arr[dir];
		int i = esq - 1;

		for(int j = esq;j < dir;j++) {
	
			if(arr[j] <= pivo) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

			}
		}

		int temp = arr[i+1];
		arr[i+1] = arr[dir];
		arr[dir] = temp;

		return i + 1;

	}

	public static void quickSort(int[] array, int inicio, int fim) {
		if(inicio < fim) {
			int indicePivo = particiona(array,inicio,fim);
			quickSort(array,inicio, indicePivo - 1);
			quickSort(array,indicePivo + 1,fim);
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] entrada = new int[n];
		int quantidadePares = 0;
		int quantidadeImpares = 0;

		for(int i =0;i<n;i++) {
			entrada[i] = scanner.nextInt();
			if(entrada[i] % 2 == 0) {
				quantidadePares++;
			
			} else {
				quantidadeImpares++;

			}
		}

		int[] pares = new int[quantidadePares];
		int[] impares = new int[quantidadeImpares];
		int p = 0, im = 0;

		for(int i=0;i<n;i++) {
			if(entrada[i] % 2 == 0) {
				pares[p++] = entrada[i];

			} else {
				impares[im++] = entrada[i];

			}

		}

		quickSort(pares,0,pares.length - 1);
		quickSort(impares,0,impares.length - 1);

		for(int i=0;i<pares.length;i++) {
			System.out.println(pares[i]);
		}

		for(int i = impares.length - 1; i >= 0; i--) {
			System.out.println(impares[i]);

		}

		scanner.close();

	}

}
	      

