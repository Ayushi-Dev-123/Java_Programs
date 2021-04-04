class DoublyLinkedList{
    Node head, tail;
    public static class Node{
		Node previous, next;
		int data;
		public Node(int data){
			this.data = data;
			this.next = null;
			this.previous = null;
		}
		public Node(){}
	}	
	public void insert(int element){
		Node node = new Node(element);
		if(head == null){
			head = node;
			tail = node;
		}
		else{
			tail.next = node;
			node.previous = tail;
			tail = node;
		}
	}
	public void traverse(){
		if(head != null){
			Node temp = head;
			while(temp != null){
				System.out.println(temp.data);
				temp = temp.next;
			}
		}
		else
		    System.out.print("List is empty");
	}
	public void traverseBackward(){
		if(head != null){
			Node temp = tail;
			while(temp != null){
				System.out.println(temp.data);
				temp = temp.previous;
			}
		}
		else
		    System.out.printl("List is empty");
	}
	public static void main(String arg[]){
		DoublyLinkedList ll = new DoublyLinkedList();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		do{
			System.out.print("\nPress 1 for insert \nPress 2 for traverse forward \nPress 3 for traverse backward \nPress 4 for exit");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			switch(choice){
			    case 1 : System.out.print("Enter element to insert : ");
                         int no = sc.nextInt();
                         ll.insert(no);  
						 break;
                case 2 : ll.traverse();
				         break;
                case 3 : ll.traverseBackward();
				         break;	
                case 4 : System.exit(0);						 
			}
		}
		while(true);
	}
}