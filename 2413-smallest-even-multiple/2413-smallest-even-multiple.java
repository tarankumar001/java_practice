class Solution {
    public int smallestEvenMultiple(int n) {
        int num=2*n;
        if(n%2==0){
            return n;
        }else{
            return num;
        }
        
    }
}