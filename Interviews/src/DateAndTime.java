import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateAndTime {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String str = "Sep 32, 2013";
		Date date = new SimpleDateFormat("MMMM d, yy", Locale.US).parse(str);
		System.out.println(date);
	}

}
