import java.util.Scanner;
class RemoveSmallest{
    public static void main(String arg[]){
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter elements in array : ");
		for(int i=0; i<size; i++){
		    arr[i] = sc.nextInt();
		} 		
		int small = arr[0], pos=0;
		for(int i=0; i<arr.length; i++ ){
		    //for(int j=i+1;j<arr.length; j++ ){
			    if(arr[i] < small && arr[i]%2==0){
				    small = arr[i];
					pos = i;
                    break;  				    
				}
				if(i == pos){
					i++;
				}
				//System.out.print("Smallest elements in array : "+arr[i]);
			//}
		}
		
		System.out.print("Smallest elements in array : "+small);
		
	}
}