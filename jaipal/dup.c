/* removing duplicates in sorted linkedlists */
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
L* dup (L *head) {
	L *temp, *node = head;
	if(!head) return NULL;
	while(node->next) { /* check whether target exists to compare */
		temp = node->next;
		if(node->x == temp->x)
			node->next = temp->next; /* skip duplicate node */
		else
			node = node->next; /* move one node forward */
	}
	return head;
}
void main() {
	int i,a[] = {1,2,3,3,3,4,8,9,9,10,20,20,20};
	L *m = NULL;
	for(i=0;i<13;i++)		m = push(m,a[i]);
	m = dup(m);
	i=0;
	while(m) {
		printf("%d ",m->x);
		m = m->next;
		i++;
	}
	printf("length of list %d\n",i);
}
