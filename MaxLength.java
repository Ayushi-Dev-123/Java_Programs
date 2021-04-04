import java.util.Scanner;
class MaxLength{
    public static void main(String[] args)
    {
        String str, maxword=null, word="";
        int maxlenght=0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String that you want to reverse : ");
        str = sc.nextLine();
        System.out.println(str);
        int length = str.length();
        System.out.println("Length of String = " + length);   
        str = str + ' ';
        
        for(int i=0;i<str.length();i++)
        {
             word = word+str.charAt(i);
             if(str.charAt(i+1)==' ')
              {
                 if(word.length()>maxlenght)
                 {
                     maxword = new String(word);
                     maxlenght =word.length();
                 }           
                word="";
                i++;    
              }      
        }  
        System.out.println("Largest word in the sentence : " + maxword );
    }
}