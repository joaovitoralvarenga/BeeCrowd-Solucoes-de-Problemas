#include <stdio.h>
#include <stdlib.h>


typedef struct {
    
} MinStack;

typedef struct Node {
  int element;
  struct Node next;
}

  Node* newNode(int element) {
  Node* new = (Node)malloc(sizeof(Node));             
  new.element = element;
  new.next = NULL;
  return new;
}

Node* top;


MinStack* minStackCreate() {
  top = NULL;

    
}

void minStackPush(MinStack* obj, int val) {
  Node* tmp = NewNode(val);
  tmp.next = top;
  topo = tmp;
  tmp = NULL;
    
}

void minStackPop(MinStack* obj) {
    
}

int minStackTop(MinStack* obj) {
    
}

int minStackGetMin(MinStack* obj) {
    
}

void minStackFree(MinStack* obj) {
    
}
