import java.text.SimpleDateFormat;  
import java.util.Date;  
class SimpleDateFormatExample {  
    public static void main(String[] args) {  
        Date date = new Date();  
        SimpleDateFormat formate = new SimpleDateFormat("dd/MM/yyyy");  
        String strDate = formate.format(date);  
        System.out.println(strDate);  
    }  
}  