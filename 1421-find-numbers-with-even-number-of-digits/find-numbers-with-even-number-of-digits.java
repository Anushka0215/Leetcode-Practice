class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int val:nums){
            int temp=0;
            while(val!=0){
                temp++;
                val=val/10;
            }
            if(temp% 2==0){
                count++;
            }
        }
        return count;

    }
}

    