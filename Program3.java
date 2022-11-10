import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

class Program3 
{
      public static void main(String[] args) 
      {
            LocalDate now = LocalDate.now() ;
            DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("EEEE, d. MMMM yyyy" ); 
            // using the localdate code to get the current date, setting our desired order with datetimeformatter and assigning it to myformat
            System.out.println("Today is "  + myFormat.format(now) + "!");
            System.out.println("Welcome to DLBCSOOPJ01!");
        } 
}