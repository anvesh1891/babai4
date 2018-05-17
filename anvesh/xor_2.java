public class Solution {
    public int findMinXor(int[] A) {
        int min=9999;
        Arrays.sort(A);
        for(int i=0;i<A.length-1;i++){
                int xor=A[i]^A[i+1];
                if(xor<min){
                    min=xor;
                }
        }
            return min;
        
    }
}
