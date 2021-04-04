class Queue{
   int front = -1, rear = -1;
   public static final int MAX = 5;
   int queue[] = new int[MAX];
   
   public boolean isFull(){
     if(rear == MAX - 1)
       return true;
     return false;  
   }
   
   public boolean isEmpty(){
      if(front == -1 || front > rear)
        return true;
      return false;  
   }
   
   public void enqueue(int element){
     if(isFull())
       System.out.println("Queue is full");
     else{
       if(front == -1){
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
   public void dequeue(){
     if(isEmpty())
      System.out.println("Queue is empty");
     else{
        int element = queue[front];
        if(front == rear)
          front = rear = -1;
        else
          front = front + 1;  
        System.out.println(element+" deleted (front="+front+",rear="+rear+")");
     

     } 
   }
   public void display(){
     if(isEmpty())
       System.out.println("Queue is empty...");
     else{
       for(int i=front; i<=rear; i++)
         System.out.print(" "+queue[i]);
       System.out.println();  
     }  
   }
   public static void main(String args[]){
     Queue q = new Queue();
     java.util.Scanner sc = new java.util.Scanner(System.in);
     do{
      System.out.println("1 for inserting...");
      System.out.println("2 for deleting...");
      System.out.println("3 for traversing..");
      System.out.println("4 for exit");
      System.out.println("Enter choice");
      int choice = sc.nextInt();
      switch(choice){
        case 1 : System.out.println("Enter element..");
                 int element = sc.nextInt();
                 q.enqueue(element);
                 break;
        case 2 : q.dequeue(); break;
        case 3: q.display();break;  
        case 4: System.exit(0);       
      }
     }while(true);
   }
}
