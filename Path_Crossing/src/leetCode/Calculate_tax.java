package leetCode;

public class Calculate_tax {

	public static void main(String[] args) {
		int[][] brackets = { { 3, 50 }, { 7, 10 }, { 12, 25 } };
		int income = 10;
		System.out.println(calculateTax(brackets, income));

	}

	static double calculateTax(int[][] brackets, int income) {
		int prevBracket = 0;
		double totalTax = 0;
		double[] brackets2 = new double[brackets.length];
		for (int i = 0; i < brackets.length; i++) {
			brackets2[i] = brackets[i][1];

		}
		for (int i = 0; i < brackets.length; i++) {
			if (income >= brackets[i][0] - prevBracket) {
				income = income - (brackets[i][0] - prevBracket);
				totalTax += (brackets[i][0] - prevBracket) * (brackets2[i] / 100);
				prevBracket = brackets[i][0];
			} else {
				totalTax += income * (brackets2[i] / 100);
				break;
			}

		}
		return totalTax;

	}

}
