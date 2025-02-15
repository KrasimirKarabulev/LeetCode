package leetCode;

public class Maximum_value_of_a_string_in_an_array {

	public static void main(String[] args) {
		String[] strs = {"alic3","bob","30","4","00000"};
		System.out.println(maximumValue(strs));
	}
	static int maximumValue(String [] strs) {
		
		int max = 0;
		int strToInt = 0;
		for(int i=0; i<strs.length; i++) {
			try {
				strToInt = Integer.valueOf(strs[i]);
				if(max < strToInt) {
					max = strToInt;
				}
			}
			catch(Exception e){
				if(max < strs[i].length()) {
					max = strs[i].length();
				}
			}
			
		}
		return max;
    }

}
