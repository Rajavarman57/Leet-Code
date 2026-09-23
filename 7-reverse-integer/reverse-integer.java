class Solution {
    public int reverse(int x) {
        boolean f = true;
        int n;
        if(x<0){
            f=false;
            n = x*-1;
        }
        else{
            n=x;
        }
        int r,rev=0;
        System.out.println(n);
        while(n>0){
            r=n%10;
            n=n/10;
            if(rev>(Integer.MAX_VALUE - r)/10)
            {
                return 0;
            }
            rev=rev*10+r;
            
        }
        if(f){
            return rev;
        }
        return rev*-1;

    }   
}