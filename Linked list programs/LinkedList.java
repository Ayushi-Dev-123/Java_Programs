class LinkedList{
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
  public void traverse(){
     Node temp = head;
     while(temp!=null){
       System.out.print(" "+ temp.data);
       temp = temp.address;
     }
     System.out.println();
  }
  public void deleteFirst(){
    if(head !=null){
     Node temp = head;
     head = head.address;
     temp.address = null;
     System.out.println(temp.data + " is removed form list");
     temp = null;
     }
     else
       System.out.println("List is empty");
  }
  public void deleteLast(){
    if(head != null){
    Node temp = head;
    Node previous=null;
    while(temp.address != null){
      previous = temp;
      temp = temp.address;
    }
    previous.address = null;
    System.out.println(temp.data+ " is removed from list");
    temp = null;
    }
    else 
      System.out.println("List is empty");
  }
  public void deleteAtPosition(int position){
    if(head != null){
      if(position > count)
        System.out.println("Position index out of bound..");
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
       System.out.println(temp.data+" removed from list");
       temp.address = null;
       temp = null;
      }
    }
    else
      System.out.println("List is empty");
  }
  public static void main(String args[]){
     LinkedList ll = new LinkedList();
     ll.insert(10);
     ll.insert(20);
     ll.insert(30);
     ll.insert(40);
     ll.insert(50);
     ll.insert(60);
     
     ll.traverse();
     java.util.Scanner sc = new java.util.Scanner(System.in);
     do{
        System.out.println("Press 1 For delete first");
        System.out.println("Press 2 for delete last");
        System.out.println("Press 3 for delete at position");
        System.out.println("Press 4 for traverse");
        System.out.println("Press 5 for exit");
        System.out.println("Enter choice");
        int choice = sc.nextInt();
        switch(choice){
          case 1 : ll.deleteFirst();break;
          case 2 : ll.deleteLast();break;
          case 3: System.out.println("Enter position");
                  int pos = sc.nextInt();
                  ll.deleteAtPosition(pos);
                  break;
          case 4 : ll.traverse();break;
          case 5: System.exit(0);                        
        }
     }while(true);    
  }
}

