package leetCode;

public class CountOperationToObtainZero {
	public static void main(String[] args) {
		int num1 = 2;
		int num2 = 3;
		System.out.println(count(num1, num2));

	}

	static int count(int num1, int num2) {
		int count = 0;
		while (num1 > 0 && num2 > 0) {
			if (num2 > num1) {
				num2 = num2 - num1;
				count++;
			} else {
				num1 = num1 - num2;
				count++;
			}
		}
		return count;

	}
}
