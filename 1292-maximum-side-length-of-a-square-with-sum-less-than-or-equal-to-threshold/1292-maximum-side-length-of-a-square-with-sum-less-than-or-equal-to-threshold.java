class Solution{
    public int maxSideLength(int[][]a,int t){
        int m=a.length,n=a[0].length,x=0;
        for(int i=0;i<m;i++)for(int j=1;j<n;j++)a[i][j]+=a[i][j-1];
        for(int i=1;i<m;i++)for(int j=0;j<n;j++)a[i][j]+=a[i-1][j];

        for(int i=0;i<m;i++)for(int j=0;j<n;j++)
            for(int k=x+1;i-k+1>=0&&j-k+1>=0;k++){
                int z=a[i][j]-(i-k>=0?a[i-k][j]:0)-(j-k>=0?a[i][j-k]:0)+(i-k>=0&&j-k>=0?a[i-k][j-k]:0);
                if(z<=t)x=k;else break;
            }
        return x;
    }
}