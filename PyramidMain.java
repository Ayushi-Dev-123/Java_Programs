import java.util.Scanner;
class Pyramid {
    synchronized void draw(char ch){
       try{
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter number of lines = ");
          int n = sc.nextInt();
          for(int i=n;i>0;i--){
             for(int j=i;j>0;j--){
                Thread.sleep(1000);
                System.out.print(ch);
             }
             System.out.println();
          }
       }
       catch(Exception e){
           e.printStackTrace();
       }
    }
}
class Draw extends Thread{
    Pyramid p;
    Draw(Pyramid p){
        this.p = p;
    }
    public void run(){
        p.draw('*');
    }
}
class PyramidMain{
    public static void main(String[] args) {        
        Pyramid p = new Pyramid();
        Draw d = new Draw(p);
        d.start();
    }
}