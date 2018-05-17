public class Solution {
    public int findMinXor(int[] A) {
        int min=9999;
        for(int i=0;i<A.length;i++)
            for(int j=i+1;j<A.length;j++){
                int xor=A[i]^A[j];
                if(xor<min){
                    min=xor;
                }
            }
            return min;
        
    }
}
