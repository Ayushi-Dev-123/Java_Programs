import java.util.Scanner;
class Emp{
    public float salary;
	public float totSalary;
	public int empNo;
	
	public Emp(float salary, int empNo){
		this.salary = salary;
		this.empNo = empNo;
	}
	
	public String toString(){
		return empNo+"\t"+salary;
	}
	
	//public float total()
}
class Employee{
	public static void main(String arg[]){
	    Scanner sc = new Scanner(System.in); 
  	    System.out.print("Enter number of employees : ");
	    int size = sc.nextInt();	
	    Emp emp[] = new Emp[size];
		
		sc.nextLine();
   	    for(int i=0; i<size; i++){
		    System.out.print("Enter salary : ");
            float salary = sc.nextFloat();
           	int id = i+1;
            emp[i] = new Emp(salary,id);  			
	    }
		System.out.println("Details : ");
		for(int i=0; i<emp.length; i++ ){
			System.out.println(""+emp[i]);
		}
		
 
	}
	
}