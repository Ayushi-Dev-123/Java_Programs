import java.util.Arrays;
import java.util.Scanner;
class Anagram{
    public static byte flag =0;
	public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first String = ");
        String s1 = sc.nextLine();
        System.out.print("Enter second String = ");
        String s2 = sc.nextLine();
        isAnargram(s1,s2);
		if(flag == 1)
		    System.out.print("String are anagram");
		else
            System.out.print("String are not anagram");		
    }
    static boolean isAnargram(String s1, String s2)
    {   
        if(s1.length()!=s2.length())
           return false;
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
		flag =1;
		return Arrays.equals(a1,a2);
    }
}