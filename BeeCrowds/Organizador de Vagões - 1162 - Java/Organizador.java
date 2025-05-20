import java.util.*;

public class Organizador {

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}


	

	public static int ordena(int[] array) {
		int n = array.length;
		int swaps = 0;

		for(int i = 0;i<n - 1;i++) {
			for(int j = 0;j<n - i - 1;j++){
					if(array[j] > array[j + 1]) {
						swap(array,j,j+1);
						swaps++;
					}
			}
		}

		return swaps;

	}

		




	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		for(int i =0;i<n;i++) {
			int tam = scanner.nextInt();
			int[] trem = new int[tam];

			for(int j = 0;j<tam;j++) {
				trem[j] = scanner.nextInt();
			}

			int trocas = ordena(trem);

			System.out.println("Optimal train swapping takes " + trocas + " swaps.");

		}	

		scanner.close();

	}

}
