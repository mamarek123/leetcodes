package easy;

public class RemoveDuplicatesFromSortedArray26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 1) return 1;
        int uniqueElements = 1;

        for(int i = 0; i < nums.length -1; i++){
            if(nums[i] < nums[i+1]){
                nums[uniqueElements] = nums[i+1];
                uniqueElements++;
            }
        }
        return uniqueElements;
    }
}
