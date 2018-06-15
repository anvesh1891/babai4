/* Merge overlap intervals - sorted in descending order */

#include<bits/stdc++.h>
using namespace std;
#include<stdio.h>
typedef struct interval
{
	int s,e;
}I;
bool comp(I a, I b)
{
	return a.s > b.s;
}

void merge(I a[], int n, int *len)
{
	int i,j=0;
	for(i=0;i<n;i++)
	{
		if(j>0 && a[j-1].s <= a[i].e)
		{
			while(j>0 && a[j-1].s <= a[i].e)
			{
				
				a[j-1].s = (a[j-1].s > a[i].s)?a[i].s:a[j-1].s;
				a[j-1].e = (a[j-1].e > a[i].e)?a[j-1].e:a[i].e;
				j--;
			}
		}
		else a[j] = a[i];
		j++;
	}
	*len =j;
}
int main()
{
	int i,n;
	I a[] = {{6,8},{5,9},{4,7},{2,3},{10,11},{4,21}};
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
