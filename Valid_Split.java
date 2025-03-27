class Valid_Split {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();

        int candidate = nums.get(0), count =0;

        for(int i =0; i<n; i++){
            if(count == 0){
                candidate = nums.get(i);
            }

            if(nums.get(i) == candidate){
                count +=1;
            }
            else{
                count -=1;
            }
        }

        int totaloccurrence = 0;
        for(int i=0; i<n; i++){
            if(nums.get(i) == candidate){
                totaloccurrence++;
            }
        }

        if(totaloccurrence * 2 <= n){
            return -1;
        }

        int leftoccurrences =0;
        for(int i=0; i<n-1; i++){
            if(nums.get(i) == candidate){
                leftoccurrences++;
            }

            int leftsize = i+1;
            int rightsize = n-leftsize;
            int rightoccurrence = totaloccurrence - leftoccurrences;

            if(leftoccurrences * 2> leftsize && rightoccurrence * 2> rightsize){
                return i;
            }
        }

        return -1;
    }
}
