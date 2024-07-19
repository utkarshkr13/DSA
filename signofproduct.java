public class signofproduct {
    class Solution {
        public int arraySign(int[] nums) {
            double a=1;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    a=0;
                    break;
                }
                else{
                    a=a*nums[i];
                    a=a/10;
                }
            }
            
            if(a>0){
                a=1;
            }
            if(a<0){
                a=-1;
            }
            
            return (int)a;
                
            }
        }
    
    
}
