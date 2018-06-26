/* Merge overlap intervals - sorted in ascending order */
#include<bits/stdc++.h>
using namespace std;
#include<stdio.h>
typedef struct interval
{
	int s,e;
}I;
bool comp(I a, I b)
{
	return a.s < b.s;
}

void merge(I a[], int n, int *len)
{
	int i=0,j=0;
	for(;i<n;i++)
	{
		if(j>0 && a[j-1].e >= a[i].s)
			a[j-1].e = (a[j-1].e > a[i].e)?a[j-1].e:a[i].e;
		else
		{
			a[j] = a[i];
			j++;
		}
	}
	*len =j;
}
int main()
{
	int i,n=4;
	I a[] = {{6,8},{5,9},{4,7},{2,3},{3,5}};
	n = sizeof(a)/sizeof(I);
	sort(a,a+n,comp);
	printf("Sorted intervals: ");
   for(i=0;i<n;i++)
   {
      printf("(%d, %d) ",a[i].s,a[i].e);
   }
	merge(a,n,&n);
	printf("\nMerged intervals: ");
   for(i=0;i<n;i++)
   {  
      printf("(%d, %d) ",a[i].s,a[i].e);
   }
	return 0;
}
