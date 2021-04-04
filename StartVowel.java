import java.util.Scanner;
class StartVowels {
   public static void main(String args[]){
      int count =0;
      Scanner sc = new Scanner(System.in);
	  System.out.print("Enter name : ");
      String sentence = sc.nextLine();

      char ch = sentence.charAt(0);
      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u' || ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch == 'U'){
           count= 1;
      }
	  if(count == 1)
        System.out.print("String start with vowel ");
	  else
	    System.out.println("String can not start with vowel"); 
   }
}