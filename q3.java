class CQueue{
  int front =-1 , rear =-1;
  public static final int MAX = 5;
  int queue[] = new int[MAX];
  
  public void enqueue(int element){
    if(front == (rear+1)%MAX)
      System.out.println("Queue is full..");
    else{
      if(front == -1){
        front = rear = 0;
        queue[front] = element;
      }
      else{
        rear = (rear + 1)%MAX;
        queue[rear] = element; 
      }
      System.out.println(element +" inserted (front="+front+",rear="+rear+")");
      
    }  
  }
  public void dequeue(){
    if(front == -1)
      System.out.println("Queue is empty...");
    else{
      if(front == rear){
        int element = queue[front];
        front = rear = -1;
      }
      else{
        int element = queue[front];
        front = (front + 1)%MAX;
      }
    }  
  }
}
