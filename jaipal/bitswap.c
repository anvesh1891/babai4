/* reversing bits of integer */
#include<stdio.h>
void main() {
	unsigned int x = 0, a = 3;
	int i,n = 8*sizeof(a);
	printf("number of bits: %d of a: %u\n",n,a);
	for(i=0;i<n/2;i++) {
		if((a&(1<<(n-i-1))) != (a&(1<<i))) {
			printf("swapping %d and %d\n",i,n-i-1);
			if(a&(1<<i))
				x = x | (1<<(n-i-1));
    		else
				x = x | (1<<i);
		}
	}
	printf("given int %u, reverse int %u \n",a,x);
}
