class Repeatednum {
    public int repeatedNTimes(int[] nums) {
        
        HashSet <Integer> visited= new HashSet<>();

        for(int i=0; i<nums.length; i++){
            if(!visited.add(nums[i])){
                return nums[i];
            }
        }

        throw new IllegalArgumentException("no repeated elemnts are found...");
    }
}
