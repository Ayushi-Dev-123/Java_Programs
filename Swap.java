import java.util.Scanner;
class Swap{
    public static void main(String args[]){
        int a = 10, b = 20;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int n1 = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int n2 = sc.nextInt();

		n1 = n1 + n2;  // 3+5
		n2 = n1 - n2; // 8-5
        n1 = n1 - n2; // 8-3
        System.out.println("n1 : " + n1 + "\nn2 : " + n2);
 
        System.out.println("a = " + a + " & b = " + b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("a = " + a  + " & b = " + b); 		
    }
}