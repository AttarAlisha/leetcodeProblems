class MaximumCount {
    public int maximumCount(int[] nums) {
        
        int positivenum =0;
        int negativenum=0;

        for(int i=0; i<nums.length;i++){
            if(nums[i]>0){
                positivenum ++;
            }
            else if(nums[i]<0){
                negativenum ++;
            }

            else{
                
            }
        
        }

        return Math.max(positivenum,negativenum);

    }
}
