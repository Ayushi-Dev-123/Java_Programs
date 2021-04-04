import java.util.Scanner;
class MathOperation{
    protected int x, y, r=1 ;
    public void add(){
        r = x+y;
    }
    public void multiply(){
        r = x*y;
    }
    public void power(){
       int m=1;
       for(int i=1;i<y;i++){
          r = m*x;
       }
    }
    public void input(){
       Scanner sc = new Scanner(System.in);
       
       System.out.print("\nEnter x = ");
       x = sc.nextInt();
        
       System.out.print("Enter y = ");
       y = sc.nextInt();
    }
    
    public void display(){
       System.out.println("Result = " + r);
    }
}

class Multiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathOperation m = new MathOperation();
       
        m.input();
        m.power();
        m.display();
        
        m.input();
        m.multiply();
        m.display();
        
        m.input();
        m.add();
        m.display();

    }
}