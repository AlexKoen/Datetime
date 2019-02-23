import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Datetime {
    public static void eventdate() {
        try {
            Date date = new Date();
            Calendar calendar1 = Calendar.getInstance();
            calendar1.setTime(date);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String str = String.format("%tc", date);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Today's date and time " + str);
            System.out.println("Enter your event year");
            String year = scanner.next();
            System.out.println("Enter your event Month eg 02 ");
            String month = scanner.next();
            System.out.println("Enter your event Day");
            String day = scanner.next();
            System.out.println("Your details are " + year + " " + month + " " + day);
            String[] splitedDate;
            splitedDate = str.split(" ");
            String myDate = year + "-" + month + "-" + day + " " + splitedDate[3];
            Date eventDate = sdf.parse(myDate);
            System.out.println("current date  " + str + "\n" + " event date " + eventDate);
            long diff = eventDate.getTime() - date.getTime();
            int diffDays = (int) (diff / (24 * 60 * 69 * 1000));
            int diffhours = (int) (diff / (60 * 60 * 1000));
            if (diffDays < 0) {
                System.out.println("Your event has passed");
            } else if (diffDays == 0) {
                if (diffhours > 0) {
                    System.out.println("Your event date is in " + diffhours + " Hours");
                } else {
                    System.out.println("Your event date is now");
                }
            } else {
                System.out.println("Your event date is in " + diffDays + " days");
            }
            eventdate();
        } catch (ParseException e) {
        }
    }
    public static void main(String args[]) {
        eventdate();
    }
}
