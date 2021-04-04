import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
class Students implements Serializable {
    transient private int roll;
    private String name;
    public Students(int roll, String name){
        this.roll = roll;
        this.name = name;
    }
    public Students(){ }
    public String toString(){
        return roll +"/t" + name;
    }
}
class SerlizableMain{
    public static void main(String[] args)
    {
        try{
           File f = new File("student.txt");
           if(!f.exists())
              f.createNewFile();
           FileOutputStream fout = new FileOutputStream(f);
           ObjectOutputStream oos = new ObjectOutputStream(fout);
           Students s = new Students(101,"Ayushi");
           oos.writeObject(s);
           System.out.println("Operation Success");     
        }
        catch(Exception e){
           e.printStackTrace();
        }
    }
}