import java.util.Scanner;
class Palindrome{
    public static void main(String args[]){
	    int palin, rev = 0, rem;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number : ");
		int num = sc.nextInt();
		palin = num;
		while(num > 0){
		    rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10; 			
		}
		if(palin == rev)
		    System.out.print("Number is palindrome");
		else
            System.out.print("Number is not a palindrome");		
	}
}
