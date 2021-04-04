import java.util.Scanner;
class RemoveDuplicate{
    public static void main(String[] args) {
         int size, i,j, remove, count=0;
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Size of array = ");
         size = sc.nextInt();
         
         int arr1[] = new int [size];
         int arr2[] = new int [size];
         for( i=0;i<arr1.length;i++) {
             System.out.print("Enter elements in array = ");
             arr1[i] = sc.nextInt();
         }
         System.out.println("Array elements are = ");        
         for( i=0;i<arr1.length;i++){
           System.out.println(arr1[i]);   
         }
         for(i=0;i<arr1.length;i++){
             for(j=0;j<count;j++){
                 if(arr1[i]==arr1[j])
                    break;  
             }
             if(j==count){
                 arr2[count] = arr1[i];
                 count++;
             }
         }
         System.out.println("After removing duplicate element = ");
         for(i=0;i<count;i++){
             System.out.println(arr2[i]);
         }  
    }
}