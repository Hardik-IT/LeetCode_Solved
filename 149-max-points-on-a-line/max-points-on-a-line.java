class Solution {
    public int maxPoints(int[][] points) {
        if(points.length <= 2) return points.length;
        int res=0;
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j<points.length;j++){
                int ans=2;
                int num = points[j][1] - points[i][1];
                int denom = points[j][0] - points[i][0];                    
                for(int k=0;k<points.length;k++){
                    if(k != i && k != j){
                        int num_ = points[k][1] - points[i][1];
                        int denom_ = points[k][0] - points[i][0];     
                        if(num_ * denom == num * denom_){
                            ans++;
                        }
                    }
                }
                res = Math.max(res,ans);
            }
        }
        return res;
    }
}