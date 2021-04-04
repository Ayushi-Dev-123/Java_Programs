class SinglyLinkedList{
	Node head;
	public static int count = 0;
    public static class Node{
		int data;
		Node address;
		public Node(int data){
			this.data = data;
		}
		public Node(){}
	}
	
	/*public void insert(int element){
		Node node = new Node(element);
		if(head == null){
			head = node;
			node.address = null;
		}
		else{
			Node temp = head;
			while(temp!=null){
				System.out.print(temp.data);
				temp = temp.address;
			}
			temp.address = node;
    		node.address = null;  
		}
		count++;
	}*/
	public void insert(int element){
        Node node = new Node(element);
        if(head == null){
            head = node;
            node.address = null;
        }
        else{
            Node temp = head;
            while(temp.address != null){
                temp = temp.address;
            }
            temp.address = node;
            node.address = null;
        }
        count++;
    }
	
	public void deleteFirst(){
		if(head != null){
			Node temp = head;
			head = head.address;
			temp.address = null;
			System.out.println(temp.data+" is removed form list.");
			temp = null;
		}
		else
		    System.out.println("List is empty");
	}
	
	public void deleteLast(){
		Node temp = head;
		Node previous = null;
		while(temp.address != null){
			previous = temp;
			temp = temp.address;
		}
		previous.address = null;
		System.out.println(temp.data + " is removed from the list");
		temp = null;
	}
	
	public void deleteFromPosition(int position){
		if(head != null){
			if(position > count)
			    System.out.print("Posotion index out of bound..");
			else if(position == 1)
                deleteFirst();
            else if(position == count)
                deleteLast();
            else{
				Node previous,next,temp;
			    previous = next = temp = head;
			    int i=1;
				while(i<position){
					previous = temp;
					temp = temp.address;
					next = temp.address;
					i++;
				}
				previous.address = next;
			    System.out.print(temp.data + " removed from list..");
				temp.address = null;
				temp = null;
			}					
		}
		else
		    System.out.print("List is empty..");			
	}
	
	public void traverse(){
        Node temp = head;
        while(temp!=null){
           System.out.print(" "+ temp.data);
           temp = temp.address;
        } 
        System.out.println();
    }
	
	public static void main(String arg[]){
		SinglyLinkedList ll = new SinglyLinkedList();
		ll.insert(10);
	    ll.insert(20);
		ll.insert(30);
		ll.insert(40);
		ll.insert(50);
		ll.insert(60);
	  
	    ll.traverse();
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		do{
			System.out.print("\nPress 1 for insert \nPress 2 for deleteFirst \nPress 3 for deleteLast \nPress 4 for deleteFromPosition \nPress 5 for traverse \nPress 6 for exit");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			switch(choice){
				case 1 : System.out.print("Enter number : ");
				         int no = sc.nextInt();
				         ll.insert(no);
						 break;
                case 2 : ll.deleteFirst();
						 break;				
				case 3 : ll.deleteLast();
                         break;
				case 4 : System.out.print("Enter position : ");
				         int pos = sc.nextInt();
				         ll.deleteFromPosition(pos);
				         break; 
				case 5 : ll.traverse();
                         break;
                case 6 : System.exit(0);
                         break;
                default : System.out.print("Wrong Entry !!!");						 
			}
		}while(true);
	}
}