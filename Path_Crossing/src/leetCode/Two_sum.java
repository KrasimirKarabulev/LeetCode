package leetCode;

public class Two_sum {
	public static void main(String[] args) {
		int[] nums = { 2, 15, 11, 7 };
		int target = 9;
		Solutin(nums, target);

	}

	static void Solutin(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (j != i) {
					if (target == nums[i] + nums[j]) {
						System.out.println("[" + i + "," + j + "]");
						return;
					}
				}
			}

		}
	}
}
