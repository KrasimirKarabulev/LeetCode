package leetCode;

public class MinBitFlips {

	public static void main(String[] args) {
		int start = 10;
		int goal = 7;
		System.out.println(minBitFlips(start, goal));

	}
	
	
	public static int minBitFlips(int start, int goal) {
		
		int bitflips = start ^ goal;
		// XOR e ^
		// Побитово "и" e &
		// Побитово "или" е |
		int count = 0;
		while(bitflips > 0) {
			if (bitflips % 2 == 1) {
				count++;
			}
			bitflips = bitflips / 2;
			
		}
		return count;
    }
}
