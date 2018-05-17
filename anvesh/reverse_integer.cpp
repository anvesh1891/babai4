unsigned int Solution::reverse(unsigned int A) {
    int nob=sizeof(A)*8;
    int op=0;
    for(int i=0;i<nob;i++){
        int temp=A&(1<<i);
        if(temp){
            op=op|(1<<(nob-1)-i);
        }
        
    }
    return op;
}
