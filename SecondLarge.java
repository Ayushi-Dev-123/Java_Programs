import java.util.Scanner;
class SecondLarge{
    public static void main(String arg[]){
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter elements in array : ");
		for(int i=0; i<size; i++){
		    arr[i] = sc.nextInt();
		} 		
		int large1=0, large2=0;
		//int large = arr[0];
		for(int i=0; i<arr.length; i++ ){
		    if(arr[i] > large1){
			    large2 = large1;
   			    large1 = arr[i];
			}
			else if(arr[i]>large2){
				large2 = arr[i];
			}
		}
		System.out.println("Largest elements in array : "+large1);
		System.out.print("Second largest elements in array : "+large2);
	}
}