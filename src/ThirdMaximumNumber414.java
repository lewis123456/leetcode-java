/**
 * @Author lpf
 * @Date 2/3/18 5:29 PM
 */
public class ThirdMaximumNumber414 {
    public int thirdMax(int[] nums) {
        if (1 == nums.length) {
            return nums[0];
        }

        if (2 == nums.length) {
            return nums[0] > nums[1] ? nums[0] : nums[1];
        }

        Integer one, two, three;
        two = three = null;

        if (nums[0] == nums[1]) {
            one = nums[0];
        } else {
            if (nums[0] > nums[1]) {
                one = nums[0];
                two = nums[1];
            } else {
                one = nums[1];
                two = nums[0];
            }
        }

        for (int i = 2; i < nums.length; ++i) {
            if (null == two) {
                if (nums[i] > one) {
                    two = one;
                    one = nums[i];
                } else if (nums[i] < one) {
                    two = nums[i];
                }
            } else {
                if (null == three) {
                    if (nums[i] < two) {
                        three = nums[i];
                    } else if (nums[i] > one) {
                        three = two;
                        two = one;
                        one = nums[i];
                    } else if (nums[i] > two && nums[i] < one) {
                        three = two;
                        two = nums[i];
                    }
                } else {
                    if (nums[i] > one) {
                        three = two;
                        two = one;
                        one = nums[i];
                    } else if (nums[i] < one && nums[i] > two) {
                        three = two;
                        two = nums[i];
                    } else if (nums[i] < two && nums[i] > three) {
                        three = nums[i];
                    }
                }
            }
        }
        if (null == three) {
            return one;
        } else {
            return three;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[4];
        nums[0] = 2;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 1;
        System.out.println(new ThirdMaximumNumber414().thirdMax(nums));
    }
}
