import java.util.Scanner; 
class Vowel 
{
   public static void main(String args[])
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter String : ");
       String str = sc.nextLine();
       int length = str.length();
       
       int vow = 0;
       for(int i=0;i<length;i++)
       {
           if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||
              str.charAt(i)=='o' || str.charAt(i)=='u')
              {
                 if(i==0)
                     vow++;
                  else if(str.charAt(i-1)==' ')
                     vow++;  
              }
       }
       System.out.println("Word start with vowel = " + vow);
   }
}
