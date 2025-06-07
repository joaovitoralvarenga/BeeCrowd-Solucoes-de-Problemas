#include <stdio.h>
#include <stdlib.h>


typedef struct Celula{
  char* elemento;
  struct Celula* prox;
}Celula;

Celula* celulaNova(char* elemento) {
  Celula* nova = (Celula*)malloc(sizeof(Celula));
  nova->elemento = strdup(elemento);
  nova->prox = NULL;
  return nova;
}

Celula* topo;

void start() {
  topo = NULL;
}

void push(char* elemento) {
  Celula* tmp = celulaNova(elemento);
  tmp->prox = topo;
  topo = tmp;
  tmp = NULL;

}

int isEmpty() {
	return topo == NULL;
}
char* pop() {

  char* removido = topo->elemento;
  Celula* tmp = topo;
  topo = topo->prox;
  tmp->prox = NULL;
  free(tmp);
  tmp = NULL;
  return removido;
}

char* simplifyPath(char* path) {
	start();

	char* resp = (char*)malloc(3000 * sizeof(char));

	char* pathCopy = strdup(path);
	char* token = strtok(pathCopy, "/");

	while(token != NULL) {

		if(strcmp(token, "..") == 0) {

			if(!isEmpty()) {

				char* removido = pop();
				free(removido);
			}
		} else if(strcmp(token, ".") != 0 && strlen(token) > 0) {
	                 push(token);
		}	

    token = strtok(NULL, "/");
}

if(isEmpty()) {
	strcpy(resp, "/");
}else {
	int cont = 0;
	Celula* current = topo;
	while(current != NULL) {
		cont++;
		current = current->prox;

	}

	char** components = (char**)malloc(cont * sizeof(char*));
int i = 0;

while(!isEmpty()) {
	components[i++] = pop();
}

strcpy(resp, "");
for(int j = i - 1;j >= 0;j--) {
	strcat(resp,"/");
	strcat(resp,components[j]);
	free(components[j]);
	}
	free(components);

}

free(pathCopy);
return resp;

}



