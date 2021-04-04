class Dqueue{
  int front=-1, rear = -1;
  public static final int MAX = 5;
  int queue[] = new int[MAX];
  
  public void insertFromFront(int element){
     if(front == 0){
       System.out.println("insertion not possible from front..(front="+front+",rear="+rear+")");
     }
     else{
       if(front == -1){
         front = rear = 0;
         queue[front] = element;
       }
       else{
          front = front - 1;
          queue[front] = element; 
       }
       System.out.println(element+" inserted (front="+front+",rear="+rear+")");
     }
  }
  public void insertFromRear(int element){
     if(rear == MAX-1)
      System.out.println("insertion not possible from rear (front="+front+",rear="+rear+")");
     
     else{
        if(front == -1)
        {
          front = rear = 0;
          queue[rear] = element;
        }
        else{
          rear = rear + 1;
          queue[rear] = element;
        }
        System.out.println(element+" inserted (front="+front+",rear="+rear+")");       
     }
  }
  public void deleteFromFront(){
     if(front == -1 || front > rear)
       System.out.println("Queue is empty");
     else{
       if(front == rear){
         int element = queue[front];
         front = rear = -1;
       
         System.out.println(element+" deleted (front="+front+",rear="+rear+")");  
       }
       else{
           int element = queue[front];
           front = front + 1;
         System.out.println(element+" deleted (front="+front+",rear="+rear+")"); 
       }
     }   
  }
  public void deleteFromRear(){
    if(front == -1)
      System.out.println("Queue is empty..");
    else{
       if(front == rear){
         int element = queue[rear];
         front = rear = -1;
         System.out.println(element+" deleted (front="+front+",rear="+rear+")"); 
       }
       else{
         int element = queue[rear];
         rear = rear - 1;
         System.out.println(element+" deleted (front="+front+",rear="+rear+")"); 
       }
    }  
  }
  public void display(){
     if(front == -1)
       System.out.println("Queue is empty");
     else{
        for(int i= front; i<=rear; i++)
          System.out.print(" "+queue[i]);
        System.out.println();  
     
     }
       
  } 
   public static void main(String args[]){
     Dqueue q = new Dqueue();
     java.util.Scanner sc = new java.util.Scanner(System.in);
     do{
      System.out.println("1 for insert front...");
      System.out.println("2 for insert rear...");
      System.out.println("3 for delete front..");
      System.out.println("4 for delete rear");
      System.out.println("5 for traverse");
      System.out.println("6 for exit");
      System.out.println("Enter choice");
      int choice = sc.nextInt();
      int element = 0;
      switch(choice){
        case 1 : System.out.println("Enter element..");
                 element = sc.nextInt();
                 q.insertFromFront(element);
                 break;
        case 2 : System.out.println("Enter element..");
                 element = sc.nextInt();
                 q.insertFromRear(element);
                 break;
        case 3: q.deleteFromFront();break;  
        case 4: q.deleteFromRear();break;
        case 5: q.display();break;
        case 6: System.exit(0);       
      }
     }while(true);
   }
}
