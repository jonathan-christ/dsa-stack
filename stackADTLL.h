/*
-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-

PROGRAM: 
	Header file for Linked List implementation of stack ADT

DESCRIPTION:
	Contains: data struct def'ns, function prototypes and def'ns.
	All for the linked list implementation.

AUTHORS:
	CALAYCAY, Matthew Cedric
	DURAN, Sean Stefan Louis
	MANALILI, Marlex Lance
	PUMAR, Angelo
	SCHULZ, Jared

-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-
*/

#include <stdio.h>
#include <stdlib.h>
#ifndef STACK_H
#define STACK_H

typedef struct node{
	char data;
	struct node *link;
}*Stack;

// PROTOTYPES

void initStack(Stack *s);
int isEmpty(Stack s);
char getTop(Stack s);
void push(Stack *s, char elem);
void pop(Stack *s);
void makeNull(Stack *s);
void displayStack(Stack s);

// DEFINITIONS

void initStack(Stack *s){
    *s = NULL;
}

void push(Stack *s, char elem){
	Stack node;
	node = (Stack)malloc(sizeof(struct node));
	if(node != NULL){
		node->data = elem;
		node->link = *s;
		*s = node;
	}
}

void pop(Stack *s){
	Stack node;
	if(*s != NULL){
		node = *s;
		*s = node->link;
		free(node);
	}
}

void makeNull(Stack *s){
	for(;!isEmpty(*s);pop(s)){}
}

int isEmpty(Stack s){
	return s == NULL;
}

char getTop(Stack s){
	char retVal; 
	if(!isEmpty(s)){
		retVal = s->data;
	}else{
		retVal = -1;
	}
	
	return retVal;
}


void displayStack(Stack s){
	Stack b;
	
	if(isEmpty(s)){
		printf("Empty stack\n");
	}else{
		initStack(&b);
		printf("[TOP] ");
		while(!isEmpty(s)){
			printf("%c ", getTop(s));
			push(&b, getTop(s));
			pop(&s);
		}
		while(!isEmpty(b)){
			push(&s, getTop(b));
			pop(&b);
		}
		printf("[BOTTOM]\n");
	}
}

#endif