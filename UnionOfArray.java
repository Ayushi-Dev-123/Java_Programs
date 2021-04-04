/*import java.util.Scanner;
class UnionOfArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	    /*System.out.print("Enter size : ");
		int size1 = sc.nextInt();
		System.out.println("Enter elements : ");
	    int arr1[] = new int[size1];
    	for(int i=0; i<size1; i++){
			arr2[i] = sc.nextint();
		}
		
        //System.out.print("Enter size : ");
		//int size2 = sc.nextInt();     		
		System.out.println("Enter elements : ");
	    int arr2[] = new int[size2];
    	for(int i=0; i<size1; i++){
			arr2[i] = sc.nextint();
		}
		int arr3[] = new int[size];
		for(int i=0; i<size; i++){
		    arr3[] = arr1[i] + arr2[i];   	
		}//
		int arr1[] = {1,3,5};
        int arr2[] = {2,4,6};		
		int arr3[] ;
		for(int i=0; i<arr1.length;i++){
			arr3 = arr1[i]+arr2[i];				
		}
		for(int i=0; i<arr3.length; i++)
		    System.out.println("Union of array : "+ arr3[i]);
		
	}
}*/

import java.util.Scanner;
public class UnionOfArray {
    public static void main(String[] args) {
        int i=0,j=0,size;
        //int arr1[] = {2,3,4,5};
        //int arr2[] = {2,8,5,6};
        int arr3[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array = ");
        size = sc.nextInt();
        int arr1[] = new int[size];
        int arr2[] = new int[size];
        for(i=0;i<arr1.length;i++) {
            System.out.print("Enter elements in array1 = ");
            arr1[i] = sc.nextInt();
        }      
        for(i=0;i<arr1.length;i++) {
            System.out.print("Enter elements in array2 = ");
            arr2[i] = sc.nextInt();
        }      
        System.out.println("Array1 elements are = ");
        for(i=0;i<arr1.length;i++) {
            System.out.println(arr1[i]);
        }      
        System.out.println("Array2 elements are = ");
        for(i=0;i<arr1.length;i++) {
            System.out.println(arr2[i]);
        } 
        for(i=0;i<arr1.length;i++){ 
            arr3[i] = arr1[i];   
		}
		
        int length = arr1.length + arr2.length;
        System.out.println("arr3 : "+length);
		
		int arr1length = arr1.length;
		for(i=arr1.length; i<length; i++){
            arr3[i] = arr2[i];
        }
		System.out.println("Union of array : ");
		for(i=0;i<length;i++){
            System.out.println(""+arr3[i]);
        }
    }
}