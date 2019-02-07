package com.urbanladder;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import net.bytebuddy.description.annotation.AnnotationDescription.Loadable;

public class Calanderoperations {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.now();
	System.out.println(dtf.format(localDate));
	System.out.println(localDate);
	int day=localDate.getDayOfMonth();
	Month month=localDate.getMonth();
	int year=localDate.getYear();
	System.out.println("day is->"+day+" month id->"+month+" year is ->"+year);
	DayOfWeek dayoweek = localDate.getDayOfWeek();
	System.out.println(dayoweek);
	int mth=localDate.getMonthValue();
	System.out.println(mth);
	//add a date,months,years
	LocalDate nextmonth=localDate.plusMonths(1);
	LocalDate nexttendays = localDate.plusDays(10);
	LocalDate nextyear = localDate.plusYears(1);
	
		System.out.println(nextmonth);
		System.out.println(nexttendays);
		System.out.println(nextyear);
	
	//subtract a date,months,years
	LocalDate lasttwodays = localDate.minusDays(2);
	LocalDate lastmonth = localDate.minusMonths(1);
	LocalDate lastyear = localDate.minusYears(1);
	System.out.println(lasttwodays);
	System.out.println(lastmonth);
	System.out.println(lastyear);
	//number of days in an year
	int noodays = localDate.lengthOfYear();
	System.out.println(noodays);
	
				
	}

}
