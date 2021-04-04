import java.util.*;
class Student {
    protected int rollno;
    protected float percentage;
    protected Student(){
        rollno = 0;
        percentage = 0.0f;
        System.out.println("Student default constructor ");
    }
    protected Student(int rollno, float percentage ){
        this.rollno = rollno;
        this.percentage = percentage;
    }
    protected void show(){
        System.out.println(" Roll no. = " + rollno + "\n Percentage = " + percentage );
    }
}
class CollegeStudent extends Student {
    int semester=0;
    /*protected CollegeStudent(){
        semester = 0;
    }*/
    protected CollegeStudent(int semester, int rollno, float percentage) {
        super(rollno, percentage);
        this.semester = semester;
    }
    public void show(){
        System.out.println(" Semester = " + semester + "\n Roll no. = " + rollno + "\n Percentage = " + percentage);
    }
}
class SchoolStudent extends Student {
    int classname;
    /*protected SchoolStudent(){
        classname = 0;
    }*/
    protected SchoolStudent(int classname, int rollno, float percentage) {
        super(rollno, percentage);
        this.classname = classname;
    }
    public void show(){
        System.out.println(" Class Name = " + classname + "\n Roll no. = " + rollno + "\n Percentage = " + percentage);
    }
}
class StudentMain{
    public static void main(String[] args) {
        int i, classname, semester, rollno;
        float percentage;
        Scanner sc = new Scanner(System.in);

        Student[] s = new Student[5];
        for( i=0;i<2;i++){
           System.out.print("\n Enter college student record ");
           System.out.print("\n Enter roll no = ");
           rollno = sc.nextInt();
           System.out.print(" Enter percentage = ");
           percentage = sc.nextFloat();
           System.out.print(" Enter semester = ");
           semester = sc.nextInt();
           s[i] = new CollegeStudent(semester, rollno, percentage);
        }
        for( i=2;i<5;i++){
           System.out.print("\n Enter School Student record " );
           System.out.print("\n Enter roll no = ");
           rollno = sc.nextInt();
           System.out.print(" Enter percentage = ");
           percentage = sc.nextFloat();
           System.out.print(" Enter class name  = ");
           classname = sc.nextInt();
         s[i] = new SchoolStudent(classname, rollno, percentage);
        }
        for( i=0;i<2;i++){
          System.out.println("\n College student record ");
          s[i].show();
        }
        for( i=2;i<5;i++) {
          System.out.println("\n School Student record " );
          s[i].show();
        }
    }
}