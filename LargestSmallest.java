import java.util.Scanner;
class Array{
    private int max, min, pos;
    int getMax(int []arr){
        max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
                pos = i;     
            }
        }
        System.out.println("Maximum value = "+ max+" at "+ pos +" position ");
        return max;
    }
    int getMin(int []arr){
        min = arr[0];
        for(int i =0;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
                pos = i;     
            }
        }
        System.out.println("Minimum value = "+ min +" at "+ pos +" position ");
        return min;
    }
}
class LargestSmallest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Array a = new Array();
        
        System.out.print("Enter length of aray = ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];
        System.out.println("Length of array = " + arr.length);
        for(int i =0;i<arr.length;i++){
            System.out.print("Enter elements in array at ["+ i +"] position = ");
            arr[i] = sc.nextInt();
        }
        a.getMax(arr);
        a.getMin(arr);
    }
}