import java.util.Scanner;
class Sort{
    public static void main(String[] arg){
		int temp =0;
		Scanner sc = new Scanner(System.in);
     	        System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr1[] = new int[size];
		System.out.println("Enter elements in array : ");
		for(int i = 0; i<size; i++){
			arr1[i] = sc.nextInt();
		}
		System.out.print("Sorting of array is : ");
		for(int i = 0; i < arr1.length; i++){
			for(int j=i+1; j < arr1.length; j++ ){
			    if(arr1[i]>arr1[j]){
			       temp = arr1[i];
				   arr1[i] = arr1[j];
				   arr1[j] = temp;
		    	}
			}
		}
		for(int i =0;i<arr1.length;i++){
		    System.out.println(""+arr1[i]);	
		}
	}
}