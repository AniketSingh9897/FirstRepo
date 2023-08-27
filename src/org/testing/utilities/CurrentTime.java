package org.testing.utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
	public static String getTime() {
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 String date1= dateFormat.format(date);
String date2=date1.replaceAll("/","").replaceAll(" ","").replaceAll(":","");

		 // Print the Date
		 //System.out.println("Current date and time is " +date1);
		 return date2;
	}
}
