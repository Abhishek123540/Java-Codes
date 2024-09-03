class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int l[]=new int[1024],r[]=new int[1024];
        int i=0,sum=0;
        while(left!=0){
            long d = left%2;
            sum += (int) (d*Math.pow(10,i++));
            left/=2;
        }
        int k=0;
        while(sum!=0)
        {
            int d = sum%10;
            l[k++] = d;
            sum/=10;
        }
        i=0;
        sum = 0;
        while(right!=0){
            long d = right%2;
            sum += (int) (d*Math.pow(10,i++));
            right/=2;
        }int j =0;
        while(sum!=0)
        {
            int d = sum%10;
            r[j++] = d;
            sum/=10;
        }
        int res[]=new int[1024];
        int n;
        if(j<k)
        n = j;
        else
        n=k;
        for( i=0;i<n;i++){
            if(l[i]==1&&r[i]==1)
            {
                res[i]=1;
            }
            else
            res[i]=0;
        }
        int a=0;
        i = 0;
        while(n!=0){
            a=a*10+res[n--];
            
        }
        return a;
    }
}