#include<stdio.h>
int mxor(int a, int b) {
	return a^b;
}
void main() {
	int a[] = {0,2,3};
	int i,j,n,m0=0,m;
	n = sizeof(a)/sizeof(a[0]);
	/* find max value in array */
	for(i=0;i<n;i++) {
		m0 = (m0<a[i])?a[i]:m0;
	}
	/* find min xor pair value */
	for(i=0;i<n;i++) {
		for(j=i+1;j<n;j++) {
			m=mxor(a[i],a[j]);
			m = (m<m0)?m:m0;
			m0=m;
		}
	}
	printf("min xor %d\n",m);
}
