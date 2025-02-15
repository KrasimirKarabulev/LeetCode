package leetCode;

public class CountTime {

	public static void main(String[] args) {
		String time = "2?:?0";
		System.out.println(countTime(time));

	}

	public static int countTime(String time) {
		int choices = 0;
		String[] temp = time.split(":");
		String hour = temp[0];
		String mins = temp[1];
		int hourChoices = 1; 
		int minChoices = 1;
		if (hour.charAt(0) == '?' && hour.charAt(1) == '?') {
			hourChoices = 24;
		} 
		else if (hour.charAt(0) == '?') {
			if (hour.charAt(1) <= '3') {
				hourChoices = 3;
			}
			else {
				hourChoices = 2;
			}
		}
		else if(hour.charAt(1) == '?') {
			if(hour.charAt(0) == '2') {
				hourChoices = 4;
			}
			else {
				hourChoices = 10;
			}
		}
		
		
		if(mins.charAt(0) == '?' && mins.charAt(1) == '?') {
			minChoices = 60;
			
		}
		else if (mins.charAt(0) == '?') {
			minChoices = 6;
		}
		else if(mins.charAt(1) == '?') {
			minChoices = 10;
		}
		
		return hourChoices * minChoices;
		
		
	}

}
