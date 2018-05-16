public class Solution {
	public int searchInsert(ArrayList<Integer> a, int b) {
	   int i=0;
	   int j=a.size()-1;
	   int mid=0;
	   while(j>=i){
	       mid=(i+j)/2;
	       if(b>a.get(mid)){
	           i=mid+1;
	       }
	       else if(b<a.get(mid))
	       {
	           j=mid-1;
	       }
	       else{
	           return mid;
	       }
	   }
	   if(a.get(mid) <= b)
	   return mid+1;
	   
	   return mid;
	}
}
