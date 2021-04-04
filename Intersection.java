import java.util.Scanner;
class Intersection {
    public static void main(String[] args) {
        int i=0,j=0,size, flag =0;
  
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
       for(i=0;i<arr1.length; i++){
            for(j=0;j<arr2.length;j++) {
                if(arr1[i]==arr2[j]){
                    System.out.println("Intersection = "+ arr1[i]);
                    flag =1;
				}
            }
        }
		if(flag ==0)
            System.out.println("There is no Intersection");
    }
}