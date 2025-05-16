import java.util.*;


class Solution {
	public int[] twosum(int[] nums, int target) {

		int[][] pares = new int[n][2];
		for(int i = 0;i<n;i++) {
			pares[i][0] = nums[i];
			pares[i][1] = i;

		Arrays.sort(pares, (a,b) -> Integer.compare(a[0],b[0]));


		int esq = 0;
		int dir = nums.length - 1;

		while(esq <= dir) {
			int soma = pares[esq][0] + pares[dir][0];

			if(soma == target) {
				return new int[] {pares[esq][1],pares[dir][1]};

			} else if(soma < target) {
				esq++;
			} else {
				dir--;
			}
		}

		return new int[] {};

	}
}


				
				

