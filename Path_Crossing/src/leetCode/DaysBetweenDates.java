package leetCode;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DaysBetweenDates {

	public static void main(String[] args) {
		String date1 = "2023-10-01";
		String date2 = "2023-10-10";
		System.out.println("Days between " + date1 + " and " + date2 + ": " + daysBetweenDates(date1, date2));

	}

	public static int daysBetweenDates(String date1, String date2) {

		long daysBetween = 0;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate localdate1 = LocalDate.parse(date1, formatter);
		LocalDate localdate2 = LocalDate.parse(date2, formatter);

		daysBetween = ChronoUnit.DAYS.between(localdate1, localdate2);
		if(daysBetween < 0) {
			daysBetween = daysBetween*-1;
		}

		return (int) daysBetween;

	}

}
