#include <stdio.h>
#include <stdlib.h>
#include <string.h>



int main() {
	int caseTest, numStrings, hash;
	char expression[51];
	
	scanf("%d",&caseTest);
	for(int i = 0;i<caseTest;i++) {
		hash = 0;
		scanf("%d\n", &numStrings);
		for(int j = 0;j< numStrings;j++) {
			scanf("%s\n",&expression);

			for(int k = 0;k< strlen(expression);k++) {
				hash += (expression[k] - 'A') + j + k;

	}
		}

	printf("%d\n", hash);
	}

	return 0;

}
