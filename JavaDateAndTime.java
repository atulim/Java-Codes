import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class JavaDateAndTime {
    static List<String> days = Arrays.asList("SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY");
    
    /**
     * Gives the Day of the week(SUNDAY,MONDAY...) based on the passed params
     * @param day
     * @param month
     * @param year
     * @return
     */
    public static String getDay(String day, String month, String year) {
          
        int y = Integer.parseInt(year);
        /**
          * Converts the String type year into integer type y using parseInt() method)
       */   
       
        int m = Integer.parseInt(month);
        /**
           * Converts the String type month into integer type y using parseInt() method)
       */   
        int d = Integer.parseInt(day);
          /**
           * Converts the String type day into integer type y using parseInt() method)
       */   
        Calendar c = Calendar.getInstance(); // The java.util.Calendar.getInstance() method gets a calendar using the specified time zone and specified locale.
        c.set(y, m-1, d); 
            
        int p = c.get(Calendar.DAY_OF_WEEK);
        String s = days.get(p-1);
        return s;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        
        System.out.println(getDay(day, month, year));
        
    }
}
