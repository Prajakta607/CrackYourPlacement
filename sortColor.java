class Solution {
    public void sortColors(int[] nums) {
        int noO=0;
        int noz=0;
        int not=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0)noz++;
            else if(nums[i]==1)noO++;
            else if(nums[i]==2)not++;
        }
        for(int i=0;i<n;i++){
            if(i<noz)nums[i]=0;
            else if(i<noz+noO)nums[i]=1;
            else nums[i]=2;
        }
    }
}