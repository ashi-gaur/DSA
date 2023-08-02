class Solution {
    public int bulbSwitch(int n) {
        int count =0;
        for(int i=1;i<=n;i++){
            if(isPerfect(i))count++;
        }
        return count;
    }
    public boolean isPerfect(double n){
        double s=Math.sqrt(n);
        return(s-Math.floor(s)==0);
    }
}
