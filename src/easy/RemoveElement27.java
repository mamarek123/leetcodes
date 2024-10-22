package easy;

public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        int valsAtEnd = 0;
        for (int i = (nums.length - 1); i >= 0; i--){
            if(nums[i] == val){
                swapArrayElementsPositions(nums, i, nums.length - valsAtEnd - 1);
                valsAtEnd++;
            }
        }
        return nums.length-valsAtEnd;
    }

    private void swapArrayElementsPositions(int[] nums, int i1, int i2) {
        if (i1 == i2) return;
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = nums[temp];
    }

}
