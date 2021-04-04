import java.util.Scanner;
class CountVowels {
   public static void main(String args[]){
      int count = 0;
      Scanner sc = new Scanner(System.in);
	  System.out.print("Enter name : ");
      String sentence = sc.nextLine();

      for (int i=0 ; i<sentence.length(); i++){
        char ch = sentence.charAt(i);
        if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
            count ++;
        }
      }
      System.out.print("Number of vowels in the given sentence is "+count);
   }
}