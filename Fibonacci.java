import java.util.Scanner;
class Fibonacci{
    static int num, n1 = 0, n2 = 1, n3;
	static int getFibonacci(int num){
	    if(num>0){
			n3 = n1 + n2;
			System.out.print(" "+ n3);
			n1 = n2; 
			n2 = n3;
		    getFibonacci(num-1);
		} 	
		return 0;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
        num = sc.nextInt();
        System.out.print(" "+n1+" "+n2);
        getFibonacci(num-2);
     	 /*for(int i = 0; i<num;i++){
			n3 = n1 + n2;
			System.out.print(" "+n3 );
			n1 = n2;
			n2 = n3;
		}*/		
	}     
}