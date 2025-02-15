package leetCode;

public class MissingInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int missingInteger(int[] nums) {
		if (nums.length == 0) {
			return 1;
		}
		int temp = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1] + 1) {
				break;
			}
			temp += nums[i];
		}
		
		boolean found = true;
		while(found) {
			found = false;
			for(int num: nums) {
				if(num == temp) {
					temp++;
					found = true;
					break;
				}
			}
			
		}
		
		
		return temp;

	}

}
