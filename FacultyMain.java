import java.util.Scanner;
class Faculty {
    protected int id;
    protected float sal;
    Scanner sc = new Scanner(System.in);
    protected Faculty()
    {
        System.out.print("Enter id = ");
        id = sc.nextInt();
    }
}
class FullTime extends Faculty {
    float  bs, all;
    protected FullTime()
    {
        System.out.print("Enter basic salary = ");
        bs = sc.nextFloat();
        System.out.print("Enter allowance = ");
        all = sc.nextFloat();
    }
    void calSal1()
    {
        sal = bs + all;
    }
    void display1()
    {
      System.out.println("\n Id = " + id);
      System.out.println("Basic salary = " + bs);
      System.out.println("Allowance = " + all);
      System.out.println("Total Salary = " + sal);
      System.out.println();
    }
}
class PartTime extends Faculty {
    float hrs, rate;
    protected PartTime()
    {
        System.out.print("Enter Working Hour = ");
        hrs = sc.nextFloat();
        System.out.print("Enter Rate = ");
        rate = sc.nextFloat();
    }
    void calSal2()
   {
        sal = hrs * rate;
    }
    void display2()
    {
      System.out.println("\n Id = " + id);
      System.out.println("Working hour = " + hrs);
      System.out.println("Rate = " + rate);
      System.out.println("Total Salary = " + sal);
      System.out.println();
    }
}
class FacultyMain {
    public static void main(String[] args) {
        FullTime f1 = new FullTime();
        f1.calSal1();
        FullTime f2 = new FullTime();
        f2.calSal1();
        PartTime p1 = new PartTime();
        p1.calSal2();
        PartTime p2 = new PartTime();
        p2.calSal2();
        f1.display1();
        f2.display1();
        p1.display2();
        p2.display2();
    }
}