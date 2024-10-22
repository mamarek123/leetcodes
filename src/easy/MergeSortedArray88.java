package easy;

class MergeSortedArray88 {

    public static void main(String[] args) {
        merge(new int[]{2, 0}, 1, new int[]{1}, 1);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        easy and short solution
//        System.arraycopy(nums2, 0, nums1, m , n);
//        Arrays.sort(nums1);

//        proper and fast solution
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
        } else {
            for (int i = n - 1; i >= 0; ) {
                if (m == 0 || nums2[i] >= nums1[m - 1]) {
                    nums1[m + n - 1] = nums2[i];
                    i--;
                    n--;
                } else {
                    nums1[m + n - 1] = nums1[m - 1];
                    m--;
                }
            }
        }
    }
}