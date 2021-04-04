import java.util.Scanner;
class Stack{
    
	public static final int MAX = 5;
	int stack[] = new int[MAX];
	int top = -1;
	
	public void push(int element){
		if(isOverFlow())
		    System.out.println("Stack is in overflow condition...");
		else{
			top = top + 1;
			stack[top] = element;
            System.out.println("Element is pushed into the Stack.");			
		}	
	}
	public int pop(){
		if(isUnderFlow())
		    System.out.println("Stack is in UnderFlow condition.");
        else{
			int element = stack[top];
			top = top - 1;
			System.out.println("Element is poped from the stack.");
		} 			
		return 0;
	}
	public boolean isUnderFlow(){
		if(top == -1)
		   return true;
		return false;   
	}
	public boolean isOverFlow(){
		if(top == MAX-1)
		    return true;
		return false;	
	}
	public void traverse(){
		if(!isUnderFlow()){
			for(int i=top; i>=0;i--){
				System.out.println(stack[i]+"");
			}		
		}
		else
		    System.out.println("Stack is in underflow condition.");
	}
	public static void main(String arg[]){
		Stack stack = new Stack();
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Press 1 for push \nPress 2 for pop \nPress 3 for traverse \nPress 4 for exit ");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        switch(choice){
			case 1 :  System.out.print("Enter element : ");
			          int element = sc.nextInt();
			          stack.push(element);
					  break;
			case 2 :  stack.pop();break;
            case 3 :  stack.traverse();break;
            case 4 :  System.exit(0);
            default : System.out.println("Wrong input!!!");			
		}
		}while(true); 		
	}
}