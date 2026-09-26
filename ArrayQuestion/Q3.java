// 1. Kadane’s Algorithm (O(n) time, O(1) space) — Most efficient

public class MaxSubArrayKadane {
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Choose either current element or add to previous subarray
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSoFar = Math.max(maxSoFar, currSum);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums)); // Output: 6
    }
}


// 2. Divide and Conquer (O(n log n)) 

public class MaxSubArrayDivideConquer {

    public static int maxSubArray(int[] nums) {
        return maxSubArrayHelper(nums, 0, nums.length - 1);
    }

    private static int maxSubArrayHelper(int[] nums, int left, int right) {
        if (left == right) return nums[left];

        int mid = (left + right) / 2;

        int leftMax = maxSubArrayHelper(nums, left, mid);
        int rightMax = maxSubArrayHelper(nums, mid + 1, right);
        int crossMax = maxCrossingSum(nums, left, mid, right);

        return Math.max(Math.max(leftMax, rightMax), crossMax);
    }

    private static int maxCrossingSum(int[] nums, int left, int mid, int right) {
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = mid; i >= left; i--) {
            sum += nums[i];
            leftSum = Math.max(leftSum, sum);
        }

        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for (int i = mid + 1; i <= right; i++) {
            sum += nums[i];
            rightSum = Math.max(rightSum, sum);
        }

        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums)); // Output: 6
    }
}




// | Approach           | Time Complexity | Space Complexity     | Suitable For                |
// | ------------------ | --------------- | -------------------- | --------------------------- |
// | Kadane’s Algorithm | **O(n)**        | **O(1)**             | Large inputs (up to 10⁵)    |
// | Divide & Conquer   | **O(n log n)**  | **O(log n)** (stack) | Academic/Interview interest |
