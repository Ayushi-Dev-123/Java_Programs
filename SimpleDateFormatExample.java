import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.text.SimpleDateFormat;  
import java.util.Date;  
class SimpleDateFormatExample {  
    public static void main(String[] args) {  
        Date date = new Date();  
        SimpleDateFormat formate = new SimpleDateFormat("dd/MM/yyyy");  
        String strDate = formate.format(date);  
        System.out.println("Simple date formate : "+strDate);  
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        System.out.println("Date time formate : "+dtf.format(now));  
    }  
}  