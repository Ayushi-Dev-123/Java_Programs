import java.util.*;
class ReverseLinkList{
    public static void main(String arg[]){
	    LinkedList<Integer> ll=new LinkedList<Integer>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
	    ListIterator<Integer> itr = ll.listIterator();
		System.out.println("Actual list :");
        while(itr.hasNext())
		   System.out.println(""+itr.next());
	
	    System.out.println("Previous list :");
		while(itr.hasPrevious()){  
            System.out.println(""+itr.previous());  
		}
	}
}