package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {

		Calendar monCalendrier = Calendar.getInstance();
		
		Date maDate = monCalendrier.getTime();
		SimpleDateFormat monFormatDate = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		
		System.out.println(monFormatDate.format(maDate));
	}

}
