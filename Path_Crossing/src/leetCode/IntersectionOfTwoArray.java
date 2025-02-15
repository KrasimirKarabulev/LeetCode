package leetCode;

public class IntersectionOfTwoArray {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2 };
		int[] intersection = intersect(nums1, nums2);
		for (int i : intersection) {
			System.out.print(i + " ");
		}
	}

	static int[] intersect(int[] nums1, int[] nums2) {
		int count = 0;
		boolean flag = false;
		boolean flag2 = false;
		int[] temp = new int[Math.min(nums1.length, nums2.length)];
		for (int i = 0; i < temp.length; i++) {
			temp[i] = -1;
		}
		for (int i = 0; i < nums1.length; i++) {
			flag = false;
			for (int j = 0; j < nums2.length; j++) {
				flag2 = false;
				for (int k = 0; k < temp.length; k++) {
					if (temp[k] == j) {
						flag2 = true;
						break;
					}
				}
				if (flag2) {
					continue;
				}
				if (nums1[i] == nums2[j]) {
					flag = true;
					temp[count] = j;
					count++;

					break;

				}
			}
			if (flag == true) {
				continue;
			}
		}
		int intersection[] = new int[count];
		count = 0;

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != -1) {
				intersection[count] = nums2[temp[i]];
				count++;
			}
		}
		return intersection;
	}
}
