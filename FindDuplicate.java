import java.util.Scanner;
public class FindDuplicate {
    public static void main(String[] args) {
        int size, i,j, remove, count=0, duplicat,flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array = ");
        size = sc.nextInt();
        int arr1[] = new int [size];
        for( i=0;i<arr1.length;i++){
            System.out.print("Enter elements in array = ");
            arr1[i] = sc.nextInt();
        }
        System.out.print("Array elements are = ");        
        for( i=0;i<arr1.length;i++) {
           System.out.println(arr1[i]);   
        }
        for(i=0;i<arr1.length;i++) {
            for(j=i+1;j<arr1.length;j++){
                if(arr1[i]==arr1[j]){
					System.out.println("Duplicate element = " + arr1[j]);
					flag = 1;
				}
			}
        } 
		if(flag ==1)
		    System.out.print("Duplictes are here" );
		else
            System.out.println("No Duplicates are here");		
    }
}