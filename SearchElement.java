import java.util.Scanner;
public class SearchElement {
    public static void main(String[] args) {
        int size, i,j, found=0, position=0, search;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of array = ");
        size = sc.nextInt();
 
        int arr1[] = new int [size];
        for( i=0;i<arr1.length;i++){
            System.out.print("Enter elements in array = ");
            arr1[i] = sc.nextInt();
		}
		System.out.println("Array elements are = ");        
        for( i=0;i<arr1.length;i++){
          System.out.println(arr1[i]);   
        }
        System.out.print("Enter element that you want to search = ");
        search = sc.nextInt();
   
        for(i=0;i<arr1.length;i++) {
           if(search==arr1[i]){   
               position=i;
               found++;
               break;
           }  
        }       
        if(found == 1)
           System.out.println("Element found at position " + position);
        else
           System.out.println("Element is not found = " + position);         
   }
}