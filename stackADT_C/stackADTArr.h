/*
-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-

PROGRAM: 
	Header file for Array implementation of stack ADT

DESCRIPTION:
	Contains: data struct def'ns, function prototypes and def'ns.
	All for the array implementation.

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
#define MAX 5

typedef struct {
	char elem[MAX];
	int top;
}Stack;

//PROTOTYPES

void initStack(Stack *s);
int isFull(Stack s);
int isEmpty(Stack s);
char getTop(Stack s);
void push(Stack *s, char elem);
void pop(Stack *S);
void makeNull(Stack *s);
void displayStack(Stack s);

//DEFINITIONS

void initStack(Stack *s){
    s->top = -1;
}

void push(Stack *s, char elem){
	if(!isFull(*s)){
		s->top++;
		s->elem[s->top] = elem;
	}
}

void pop(Stack *s){
	if(!isEmpty(*s)){
		s->top--;
	}	
}

void makeNull(Stack *s){
	s->top = -1;
}

int isFull(Stack s){
	return s.top == MAX-1;
}

int isEmpty(Stack s){
	return s.top == -1;
}

char getTop(Stack s){
	char retVal;
	if(isEmpty(s)){
		retVal = '\0';
	}else{
		retVal = s.elem[s.top];
	}
	
	return retVal;
}

void displayStack(Stack s){
	Stack b;
	
	if(isEmpty(s)){
		printf("Empty stack\n");
	}else{
		b = s;
		printf("[TOP] ");
		while(!isEmpty(b)){
			printf("%c ", getTop(b));
			pop(&b);
		}
		printf("[BOTTOM]\n");
	}
}

#endif