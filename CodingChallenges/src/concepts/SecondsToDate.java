package concepts;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class SecondsToDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long yourSeconds = 1614240686;
		Date d = new Date(yourSeconds * 1000);
		DateFormat df = new SimpleDateFormat("dd MMM yyyy hh:mm:ss zzz");
		System.out.println(df.format(d));
	}

}
