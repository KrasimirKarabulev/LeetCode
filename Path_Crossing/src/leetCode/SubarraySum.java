package leetCode;

public class SubarraySum {

	public static void main(String[] args) {
		int[] nums = { 2, 3, 1 };
		System.out.println(subarraySum(nums));

	}

	public static int subarraySum(int[] nums) {
		int start = 0;
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			for (start = Math.max(0, i - nums[i]); start <= i; start++) {
				sum += nums[start];
			}
		}

		return sum;
	}
}
