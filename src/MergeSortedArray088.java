/**
 * @Author lpf
 * @Date 1/29/18 9:24 PM
 */
public class MergeSortedArray088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m-1;
        int q = n-1;
        int index = m + n -1;
        while (p >= 0 && q >= 0) {
            if (nums1[p] > nums2[q]) {
                nums1[index] = nums1[p];
                --p;
                --index;
            } else if(nums1[p] < nums2[q]) {
                nums1[index] = nums2[q];
                --q;
                --index;
            } else {
                nums1[index] = nums1[p];
                --index;
                --p;
                nums1[index] = nums2[q];
                --index;
                --q;
            }
        }
        if (0 > p) {
            while (q >= 0) {
                nums1[index] = nums2[q];
                --q;
                --index;
            }
        }
    }
}
