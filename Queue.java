class Queue{
	int front = -1, rear = -1;
	static final int MAXSIZE = 5; 
	int queue[] = new int[MAXSIZE];
	
    public boolean isFull(){
    	if(rear == MAXSIZE-1)
		    return true;
		return false;	
	}
	public boolean isEmpty(){
	    if(front==-1|| front > rear) //front == 0 && rear == SIZE - 1
            return true;
        return false;			
	}
	
	public void enqueue(int element){
		if(isFull())
		    System.out.print("Queue is full");
		else{
			if(front == -1){
				front = rear = 0;
				queue[rear] = element;
			}
			else{
			    rear = rear + 1;
			    queue[rear] = element;
			}
			System.out.print("Element is inserted (Front : "+front+" Rear : "+ rear+ ")");
		}	
	}
	
    public void dequeue(){
		if(isEmpty())
		    System.out.print("Queue is empty");
        else{
			int element = queue[rear];
			if(front == rear)
                front = rear = -1;
            else 				
			    front = front - 1;
			System.out.print("Element is removed (Front : "+front+" Rear : "+ rear+ ")");
		} 			
	}
	public void traverse(){
		if(isEmpty()){
			System.out.print("Queue is Empty.");
		}
		else{
			for(int i = front; i<=rear; i++ ){
				System.out.print(" "+queue[i]);
			}
			System.out.println();
		}
	}
	
	public static void main(String arg[]){
		Queue que = new Queue();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		do{
			System.out.println("\nPress 1 for enqueue \nPress 2 for dequeue \nPress 3 for traverse \nPress 4 for exit");
			System.out.print("Enter your choice : ");
			int choice = sc.nextInt();
			switch(choice){
				case 1 : System.out.print("Enter element to enqueue : ");
				         int element = sc.nextInt();
						 que.enqueue(element);
                         break;	
                case 2 : que.dequeue();
                         break;				
			    case 3 : que.traverse();
				         break;
				case 4 : System.exit(0);	
				         break;
                default : System.out.print("Wrong Entry!!!");				
			}
		}while(true);
	}
}