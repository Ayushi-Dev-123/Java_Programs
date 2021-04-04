import java.lang.Exception;
import java.util.Scanner;
/*class WeekException extends Exception{
	
}*/
class WeekDayException{
   public static void main(String arg[]){
	   String week[] = {"Sunday", "Monday", "Tuesday", "Wedmesday", "Thursday", "Friday", "Saturday"};
	   Scanner sc = new Scanner(System.in);
	   
	   try{
 		   System.out.print("Enter any day position : ");
	       int pos = sc.nextInt();
	       System.out.println(""+week[pos]); 			
	   }
	   catch(ArrayIndexOutOfBoundsException e){
		   System.out.print("You have entered an invalid position"+"\nEnter position between 0-6");
	   }
   }
}