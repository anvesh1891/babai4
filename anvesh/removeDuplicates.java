public class Solution {
	public int removeDuplicates(ArrayList<Integer> a) {
	    int j=0;
	    if(a.size()==0 || a.size()==1)
	    return a.size();
	    for(int i=0;i<a.size()-1;i++){
	        if((int)a.get(i) != (int)a.get(i+1)){
	            a.set(j++,a.get(i));
	        }
	    }
	    a.set(j++,a.get(a.size()-1));
	    return j;
	}
}
