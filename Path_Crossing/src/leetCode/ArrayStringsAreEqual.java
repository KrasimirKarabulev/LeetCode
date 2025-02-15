package leetCode;

public class ArrayStringsAreEqual {

	public static void main(String[] args) {
		String [] word1 = {"abc", "d", "defg"};
		String [] word2 = {"abcddefg"};
		
		System.out.println(arrayStringsAreEqual(word1, word2));

	}

	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		String temp1 = "";
		String temp2 = "";
		for (int i = 0; i < word1.length; i++) {
			temp1 += word1[i];
		}
		for (int i = 0; i < word2.length; i++) {
			temp2 += word2[i];
		}
		if (temp1.equals(temp2)) {
			return true;
		} else {
			return false;
		}
	}

}
