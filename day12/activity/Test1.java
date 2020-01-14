package com.cts.activity;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class Test1<T> {
	public static void main(String[] args) {
		Date date=new Date(0);
		//System.out.println(date);
		
		/*
		 * int day = date.getDay(); switch (day) { case 0: System.out.println("sunday");
		 * break; case 1: System.out.println("monday"); break; case 2:
		 * System.out.println("tuesday"); break; case 3:
		 * System.out.println("wednessday"); break;
		 * 
		 * case 4: System.out.println("thursday"); break;
		 * 
		 * case 5: System.out.println("friday"); break;
		 * 
		 * case 6: System.out.println("satuday"); break;
		 */



	
	String date2="20160819";

	LocalDate formatted=LocalDate.parse(date2, DateTimeFormatter.BASIC_ISO_DATE);
	System.out.printf("The format of %s is %s \t%n",date2,formatted);
	
	

	String birthday="Jan 10 1985";
	try
	{
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMM dd yyyy");
		LocalDate birth=LocalDate.parse(birthday, formatter);
		System.out.printf("The Date %s is formatted in %s %n",birthday,birth);
	}
	catch (Exception e) {
		e.printStackTrace();
	}


//		LocalTime t=LocalTime.now();
//		LocalTime T1 = t.plusHours(3);
//		//System.out.println(T1);
//		Clock clock=Clock.systemUTC();
//LocalDate date1=LocalDate.now();
//LocalDate previous=date1.plusYears(2);
//LocalDate next=date1.minusYears(2);
//
////LocalDate date2=date.plusWeeks(15);
////System.out.println(clock);
//Clock clock1=Clock.systemDefaultZone();
////System.out.println(clock1);
////System.out.println(next);
//LocalDate today=LocalDate.now();
//
//LocalDate t1=LocalDate.of(2022, 8, 20);
//Period months=Period.between(t1, today);
//int m1=months.getMonths();{
////System.out.println(months);
////System.out.println(m1);
//if(today.isLeapYear()) {
//		Instant instant=Instant.now();
//		//System.out.println(instant);
//		
//	
//LocalDateTime localDateTime=LocalDateTime.of(2016, Month.JANUARY, 10, 11, 30);
//		
//		ZoneOffset zoneOffset=ZoneOffset.of("+05:30");
//		OffsetDateTime offsetDateTime=OffsetDateTime.of(localDateTime, zoneOffset);
//		//System.out.println("Local DateTime Zone :"+offsetDateTime);
//
//	//System.out.println("yes");
//}
//else {
//	//System.out.println("no");
//}
//
//ZoneId zoneId=ZoneId.of("Asia/Calcutta");
//		
//		LocalDateTime localDateTime=LocalDateTime.now();
//		ZonedDateTime zonedDateTime=ZonedDateTime.of(localDateTime, zoneId);
//		//System.out.println("Date and Time in kerala :"+zonedDateTime);
//YearMonth today1=YearMonth.now();
////System.out.printf("The current %s : %d \t %n",today1,today1.getMonthValue());
//YearMonth dateexp=YearMonth.of(2020, 5);
////System.out.println("card exp is"+dateexp);
//
//
//
//
//
//		/*		LocalDate tommorow=LocalDate.of(2015, 8, 20);
//						if(today.isBefore(tommorow))
//		{
//			//System.out.println("TRUE");
//		}
//		if(today.isAfter(tommorow))
//		{
//			//System.out.println("false");
//		}
//}
//
//Date date=new Date(0);
//
//			int day1=date.getMonth();
//			int month=date.getMonth();
//			int year=date.getYear();
//			//System.out.println("year:"+year+"  month"+month+"  day"+day1);
//			LocalDate bday=LocalDate.of(1998, 3, 4);
////System.out.println("your bday"+bday);
//LocalDate today11=LocalDate.now();
//	LocalDate bday1=LocalDate.of(1998, 1, 14);
//	MonthDay birth=MonthDay.of(bday.getMonthValue(),bday.getDayOfMonth());
//	MonthDay today2=MonthDay.from(today11);{
//	if(birth.equals(today11)) {
//			//System.out.println(1);
//		}
//		else {
//			//System.out.println(2);		}
//}
//*/	
	
}
}

	



