/*
-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-

PROGRAM: 
	Driver program for stack ADT implementations

DESCRIPTION:
	Should be compatible if we switch from the different
	implementations (Arr*, LL*, Cursor-based) 

	'*' means required

AUTHORS:
	CALAYCAY, Matthew Cedric
	DURAN, Sean Stefan Louis
	MANALILI, Marlex Lance
	PUMAR, Angelo
	SCHULZ, Jared

-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-=x=-
*/

//#include "stackADTLL.h"
#include "stackADTArr.h"

void insertBottom(Stack *s, char elem);

int main(){
	Stack s;
	initStack(&s);
	
	push(&s, 'S');
	push(&s, 'K');
	push(&s, 'C');
	push(&s, 'O');
	push(&s, 'C');
	push(&s, 'C');
	displayStack(s);
	displayStack(s);
	pop(&s);
	pop(&s);
	pop(&s);
	pop(&s);
	pop(&s);
	pop(&s);
	pop(&s);
	displayStack(s);
	
	push(&s, 'X');
	push(&s, 'V');
	displayStack(s);
	
	makeNull(&s);
	displayStack(s);
	
	push(&s, 'C');
	push(&s, 'O');
	displayStack(s);
	
	insertBottom(&s, 'L');
	displayStack(s);
}

void insertBottom(Stack *s, char elem){
	Stack b;
	initStack(&b);
	
	while(!isEmpty(*s)){
		push(&b, getTop(*s));
		pop(s);
	}
	push(&b, elem);
	
	while(!isEmpty(b)){
		push(s, getTop(b));
		pop(&b);
	}
}