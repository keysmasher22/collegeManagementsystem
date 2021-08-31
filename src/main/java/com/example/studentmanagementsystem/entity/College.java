package com.example.studentmanagementsystem.entity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

public class College {
	
	
	
public String Time() {	
	
	
	LocalDateTime date = LocalDateTime.now();
	DateTimeFormatter format1 =
	DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String formattedCurrentDate = date.format(format1);

	ZonedDateTime currentZone = ZonedDateTime.now();
	
	ZoneId tokyo = ZoneId.of("Asia/Tokyo");
	ZonedDateTime tokyoZone =
	currentZone.withZoneSameInstant(tokyo);
	
	DateTimeFormatter format =
	DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String formatedDateTime = tokyoZone.format(format);
	ZoneId chicago = ZoneId.of("America/Chicago");
	ZonedDateTime chicagoZone =
	currentZone.withZoneSameInstant(chicago);
	DateTimeFormatter format2 =
	DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String formatedDateTimeChicago = chicagoZone.format(format);
	
	String dname="India:"+formattedCurrentDate+", Tokyo:"+formatedDateTime+", America:"+formatedDateTimeChicago;
	return dname;
}
}


