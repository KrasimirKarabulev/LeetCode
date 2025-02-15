package leetCode;

public class FindSubarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean findSubarrays(int[] nums) {
		
		int [] temp = new int [nums.length-1];
		for (int i = 0; i < nums.length-1; i++) {
				temp[i] = nums[i] + nums[i+1];
			
		}
		for (int i = 0; i < temp.length; i++) {
            for (int j = i + 1; j < temp.length; j++) {
                if (temp[i] == temp[j]) {
                    return true; 
                }
            }
        }
	
		return false;
	}

}
