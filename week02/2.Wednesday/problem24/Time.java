package problem24;

import java.util.Calendar;

public class Time {
	private int sec;
	private int min;
	private int hour;
	private int day;
	private int month;
	private int year;

	public Time(int hour, int min, int sec, int day, int month, int year) {
		this.sec = sec;
		this.min = min;
		this.hour = hour;
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return new String(hour + ":" + min + ":" + sec + " " + day + ":" + month + ":" + year);
	}

	public static Time now() {
		return new Time(Calendar.HOUR, Calendar.MINUTE, Calendar.SECOND, Calendar.DAY_OF_MONTH, Calendar.MONTH,
				Calendar.YEAR);

	}
}
