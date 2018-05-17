/* finding out target index/fit value in sorted array */
#include<stdio.h>
int search(int a[],int b, int e, int t) {
	int	m = b+(e-b)/2;
	if(e>=b) {
	if(t<a[m]) return search(a,b,m-1,t);
	else if(t>a[m]) return search(a,m+1,e,t);
	else return m;
	}else return m;
}
void main() {
	int a[] = {1,3,5,7,8,10,11};
	int e, t = 1000;
	e = sizeof(a)/sizeof(a[0]);
	printf("length of array %d\n",e);
	e=search(a,0,e-1,t);
	printf("found at %d\n",e);
}
