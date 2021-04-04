import java.util.*;
class MergeList{
    public static void main(String arg[]){
		ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(10);
  		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		al2.add(60);
		al2.add(70);
		al2.add(80);
		al2.add(90);
		al2.add(100);
		
		al1.addAll(al2);
		for(Integer i : al1)
	        System.out.println(""+i);
	}
}