import java.util.Scanner;
class Prime{
	
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in); 
     	int num, prime = 0;
		System.out.print("Enter any number : ");
	    num = sc.nextInt();
		for(int i = 2; i<num; i++){
			if(num%i == 0){
				prime ++;
				break;
			}
		}
		if(prime > 0)
		    System.out.print(""+num + " Number is not Prime");
        else
            System.out.println(""+num + " Numbe is prime");		
	}
}