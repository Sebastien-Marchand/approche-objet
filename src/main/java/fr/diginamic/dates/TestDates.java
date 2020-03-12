package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {

		Date laDate = new Date(System.currentTimeMillis());
		Date laDate23h59s = new Date(System.currentTimeMillis());
		laDate23h59s.setHours(23);
		laDate23h59s.setMinutes(30);
		laDate23h59s.setSeconds(59);
		
		SimpleDateFormat formaterDate = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		System.out.println(formaterDate.format(laDate));
		formaterDate= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		System.out.println(formaterDate.format(laDate23h59s));

		
		
	}

}
