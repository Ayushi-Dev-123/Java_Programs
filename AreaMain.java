import java.util.Scanner;
class CalculateArea {
    Scanner sc = new Scanner(System.in);
    private double radius;
    protected final float pi = 3.14f;
    protected double area;
    protected void getRadius(){
        System.out.print("Enter radius = ");
        radius = sc.nextDouble();        
    }
    protected double calArea(){
        area = (pi*radius*radius);
        return area;
    }
    protected void display() {
        System.out.println("Area = " + calArea());
    } 
}
class AreaMain{
    public static void main(String[] args)  {
       CalculateArea ca = new CalculateArea();
       ca.getRadius();
       ca.display();         
        
    }
}