import java.lang.Exception;  
import java.util.Scanner;
class inValidVoterException extends Exception
{
    inValidVoterException(String s){
        super(s);
    }  
}
class Voter
{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter voter name = ");
       String name = sc.next();
       System.out.print("Enter voter age = ");
       int age = sc.nextInt();
       try{
          if(age<18)
             throw new inValidVoterException("Voter is Not Elegible for Voting");
          else
             System.out.println("Voter is Elegible for Voting"); 
       }
       catch(inValidVoterException e){
          System.out.println(e);
       } 
    }
}  
