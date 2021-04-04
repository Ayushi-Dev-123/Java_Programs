class AddPolynomial{
    Node head;
	static int count;
	public static class Node{
		int coefficient, power;
        Node next;
        public Node(){}
        public Node(int coefficient, int power){
			this.coefficient = coefficient;
			this.power = power;
			this.next = null;
		}    		
	}
	
	public void create(int coefficient, int power){
	    Node node = new Node(coefficient, power);
        if(head == null)
			head = node;
	    else{
			Node temp = head;
			while(temp.next != null){
		    	temp = temp.next;	
			}
			temp.next = node;
			
		}
	}
	
	public void addPolynomial(AddPolynomial eq1, AddPolynomial eq2){
		int l1 = getLengthOfEquation(eq1);
		int l2  =getLengthOfEquation(eq2);
		if(l2 > l1)
		    add(eq1,eq2,l2);
        else    
            add(eq1,eq2,l1);		
	}
	
	public void add(AddPolynomial eq1, AddPolynomial eq2, int length){
		int i = 1;
		while(i<length){
			Node node = new Node();
			if(eq1.head.power == eq2.head.power){
				node.coefficient = eq1.head.coefficient + eq2.head.coefficient;
				node.power = eq1.head.power;
				eq1.head = eq1.head.next;
				eq2.head = eq2.head.next;
			}
			else if(eq1.head.power > eq2.head.power){
				node.coefficient = eq1.head.coefficient;
				node.power = eq1.head.power;
				eq1.head = eq1.head.next;
			}
			else{
				node.coefficient = eq2.head.coefficient;
				node.power = eq2.head.power;
				eq2.head = eq2.head.next;
			}
			if(head == null){
				head = node;
				node.next = null;
			}
			else{
				Node temp = head;
				while(temp.next != null){
					temp = temp.next;
				}
				temp.next =  node;
				node.next = null;
			}
			i++;
		}
	}
	
	public int getLengthOfEquation(AddPolynomial eq){
		Node temp = eq.head;
		int count = 0;
        while(temp != null){
			count++;
			temp = temp.next;
		}		
		return count;
	}
	
	public void traverse(){
		Node temp = head;
        while(temp != null){
			System.out.print(temp.coefficient + "x^" + temp.power + " ");
			temp = temp.next;
		} 		
		System.out.println();
	}
	
	public static void main(String arg[]){
		AddPolynomial eq1 = new AddPolynomial();
		eq1.create(5,3);
		eq1.create(2,2);
		eq1.create(3,1);
		eq1.create(2,0);
		eq1.traverse();
		
		AddPolynomial eq2 = new AddPolynomial();
		eq2.create(3,2);
		eq2.create(2,1);
		eq2.create(1,0);
		eq2.traverse();
		
		AddPolynomial result = new AddPolynomial();
        result.addPolynomial(eq1,eq2);
        result.traverse();		
	} 
}