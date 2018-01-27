import java.util.Scanner;

/**
 * @Author lpf
 * @Date 1/27/18 11:32 PM
 */
public class SearchInsertPosition035 {
    public int searchInsert(int[] nums, int target) {
        if (target <= nums[0]) {
            return 0;
        }
        if (target > nums[nums.length-1]) {
            return nums.length;
        }
        int left = 0;
        int right = nums.length -1;
        int mid = 0;
        while (left < right) {
            if (mid == (left + right)/2) {
                break;
            }
            mid = (left + right)/2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target < nums[mid]) {
                right = mid;
            }
            if (target > nums[mid]) {
                left = mid;
            }
        }
        if (target > nums[left]) {
            return left + 1;
        }
        return left;
    }

    public static void main(String[] args) {
        SearchInsertPosition035 searchInsertPosition035 = new SearchInsertPosition035();
        int[] nums = new int[4];
        int target;
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<4; ++i) {
            nums[i] = scanner.nextInt();
        }
        target = scanner.nextInt();
        System.out.println(searchInsertPosition035.searchInsert(nums, target));
    }
}
