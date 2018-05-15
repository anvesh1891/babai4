/* printing all permutations of a phrase */

#include<stdio.h>
#include<string.h>
void swap(char *x, char *y) {
	char z = *x;
	*x = *y;
	*y = z;
}
void fun(char *s, int a, int b) {
	int i;
	if(a == b) printf("%s\n",s);
	else {
		for(i=a;i<b;i++) {
			swap(&s[a],&s[i]);
			fun(s,a+1,b);
			swap(&s[a],&s[i]);
		}
	}
}
int main() {
	int i,n, j,k ,flag;
	char string[] = "abcd";
	char s[25],t[25];
	for(n=0;string[n]!='\0';n++); /* length of given string is n */
	printf("Given string length %d\n",n);
	j=0;
	for(i=0;i<n;i++) {
		/* check for repetation */
		flag=0;
		for(k=0;k<j && j>0;k++) {
			if(s[k] == string[i] || s[k] == string[i]-32)
				flag=1;
		}
		if(flag) continue;
		/* consider only alphabets and convert to uppercase */
		if(string[i] > 64 && string[i] < 91) {
			s[j++] = string[i];
		}
		else if (string[i] > 96 && string[i] < 123) {
			s[j++] = string[i] - 32;
		}
	}
	n = j; /* final string length */
	printf("%s length is %d\n",s,n);

	fun(s,0,n);
	return 0;
	
}

