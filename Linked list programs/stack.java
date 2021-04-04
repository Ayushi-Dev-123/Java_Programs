class Stack{

  public static  final int MAX = 5;
  int stack[] = new int[MAX];
  int top = -1;
  
  public void push(int element){
    if(isOverFlow()){
      System.out.println("Stack is in overflow condition..");
    } 
    else{
      top = top + 1;
      stack[top] = element;
      System.out.println("Element pushed into the stack..");
    }
  }
  public int pop(){
     if(isUnderFlow()){
       System.out.println("Stack is in underflow condition..");
     }
     else{
        int element = stack[top];
        top = top -1;
        System.out.println(element+" is popped from the stack..");
     }
     return 0;
  }
  public boolean isUnderFlow(){
      if(top == -1)
        return true;
      return false;  
  }
  public void traverse(){
    if(!isUnderFlow()){
     for(int i = top; i>=0; i--)
      System.out.print(stack[i]+" ");
      System.out.println();
    }
    else
    System.out.println("Stack is in underflow condition..");  
  }
  public boolean isOverFlow(){
     if(top == MAX-1)
       return true;
     return false;  
  }
  public static void main(String ar[]){
    Stack s = new Stack();
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    do{
       System.out.println("Press 1 for push");
       System.out.println("Press 2 for pop");
       System.out.println("Press 3 for traverse");
       System.out.println("Press 5 for exit");
       System.out.println("Enter your choice");
       int choice = sc.nextInt();
       switch(choice){
         case 1 : System.out.println("Enter element to push");
                  int element = sc.nextInt();
                  s.push(element);
                  break;
         case 2: s.pop();break;
         case 3: s.traverse();break;
         case 5: System.exit(0);         
       }
    }while(true);
  }
}
