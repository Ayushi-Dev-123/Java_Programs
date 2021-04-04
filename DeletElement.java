import java.util.Scanner;
class DeletElement{
    public static void main(String[] args){
        int size, del, position, i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array = ");
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter elements in array = ");
		for(i=0;i<arr.length;i++){
           arr[i] = sc.nextInt();   
        }
        System.out.println("Array elements are = ");
        for(i=0;i<arr.length;i++){
           System.out.println(arr[i]);   
        }
        System.out.print("Enter position that you want to delete = ");
        position = sc.nextInt();
        if(position>=size+1)
           System.out.println("Invalid Position ");
         else{
             for(i=position-1;i<arr.length-1;i++){
                 arr[i] = arr[i+1];
             }
         }    
         System.out.println("After deletion of position = ");
         for(i=0;i<arr.length-1;i++){
             System.out.println(arr[i]);
         }  
    }
}