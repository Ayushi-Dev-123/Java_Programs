import java.util.Scanner;
class ContainInteger{
    public static void main(String[] args)
    {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");//enter no.
        String str = sc.nextLine();
        System.out.println(str);
        int length = str.length();

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(!Character.isDigit(ch))
            {
                flag = true;
                break;
            }
        }
        if(flag==true)
           System.out.println("String contains other character also ");
         else
            System.out.println("String contains integer only ");   
    }
} 