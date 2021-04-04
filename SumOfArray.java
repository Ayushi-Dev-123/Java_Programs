import java.util.Scanner;
class SumOfArray{
    public static void main(String arg[]){
		Scanner sc = new Scanner(System.in); 
		int size, sum=0;
		System.out.print("Enter size of array : ");
	    size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter elements in Array : ");
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			sum = sum + arr[i]; 
		}
		System.out.print("Sum of array : "+sum);
	}  
}