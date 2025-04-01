import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetime_convert {
    public static void main(String[] args) {
        //creating date string
        String dateStr = "2022-03-17 10:45:30";
        //formatting the date tiem with the pattern yyyy-MM-dd HH:mm:ss
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        //Getting the local date time
        LocalDateTime dateObj = LocalDateTime.parse(dateStr, formatter);
        //formatting the localdate time
        String formattedDate = dateObj.format(DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss"));

        //outputting the formatted date
        System.out.println(formattedDate);
    }
}
