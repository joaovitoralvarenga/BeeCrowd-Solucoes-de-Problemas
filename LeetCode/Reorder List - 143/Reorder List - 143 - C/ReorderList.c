#include <stdio.h>
#include<stdlib.h>

typedef struct Node {
	int element;
	struct Node *prox;

}Node;

void reorderList(struct ListNode* head) {
	if(!head || !(head.prox) || !(head.prox.prox)) {
		return
	}

	Node* slow = head;
	Node* fast = head->next;

	while(fast != NULL && fast->next != NULL) {
		slow = slow->next;
		fast = fast->next->next;
	}

	Node* second = slow->next;
	Node* prev = slow->next = NULL;





