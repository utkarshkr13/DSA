class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int a = nums1.length;
       if (m==0 && a<2){
        nums1[m]=nums2[m];
       }

       else{
        for(int i=m;i<a;i++){
            nums1[i]=nums2[i-m];
        }
        Arrays.sort(nums1);
       }

        
    }
    
}
