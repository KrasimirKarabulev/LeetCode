package leetCode;

public class DigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String digitSum(String s, int k) {
		
		while (s.length() > k) {
            String result = ""; 
            int len = s.length();
            for (int i = 0; i < len; i += k) {

                String group = s.substring(i, Math.min(i + k, len));
                int sum = 0;

                for (char c : group.toCharArray()) {
                    sum += Character.getNumericValue(c);
                }
                
                result += sum; 
            }
           
            s = result;
        }
        
        return s;
    }

}
