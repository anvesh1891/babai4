/* merging sorted linkedlists */
#include<stdio.h>
#include<stdlib.h>
struct l {
	int x;
	struct l *next;
};
typedef struct l L;

L* newnode(int x) {
	L* node = malloc(sizeof(L));
	node->x = x;
	node->next = NULL;
	return node;
}
L* push (L* head, int x){
	L *temp,*node = newnode(x);
	if(!head) return node;
	temp = head;
	while(temp->next) {
		temp = temp->next;
	}
	temp->next = node;
	return head;
}
L *merge(L *a, L *b) {
	L *r = NULL;
	if(!a) return b;
	else if(!b) return a;
	else if(a->x > b->x) {
		r = b;
		r->next = merge(a,b->next);
	}
	else if(a->x < b->x) {
		r = a;
		r->next = merge(a->next,b);
	}
	else if(a->x==b->x) {
		r = a;
		r->next = merge(a->next,b->next);
	}
	return r;
}
void main() {
	int i,a[] = {1,9,10,20}, b[] = {3,6,10,15,30,40};
	L *m = NULL,*n=NULL;
	for(i=0;i<4;i++)		m = push(m,a[i]);
	for(i=0;i<5;i++)		n = push(n,b[i]);
	L *r = merge(m,n);
	while(r) {
		printf("%d ",r->x);
		r = r->next;
	}
}
