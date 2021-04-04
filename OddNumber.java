import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
class OddNumber{
    public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i, flag = 0, size;
		System.out.print("Enter size of array : ");
		size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter elements in array : ");	
		for(i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
		
		/*List<Integer> list = new ArrayList<Integer>();
        list.add(15);
       	list.add(20);
        list.add(5);
        list.add(3);
        list.add(17);
		*/
		for(i=0; i<arr.length;i++){
			if(arr[i]%2 == 0)
			    flag = 1; 
		}
		if(flag == 1)
		    System.out.print("All numbers are not odd");
		else
            System.out.print("Numbers are odd");		
	}
}