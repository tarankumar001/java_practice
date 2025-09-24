class Solution {
    public int differenceOfSums(int n, int m) {
        int sum=0,nsum=0;

        for(int i=0;i<=n;i++){
            if(i%m==0){
                sum+=i;
            }else{
                nsum+=i;
            }

        }
        return -(sum-nsum);
        
    }
}