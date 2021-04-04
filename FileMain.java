import java.io.File;
import java.util.Scanner;
import java.io.FileOutputStream;
class FileMain{
    public static void main(String arg[]){
	   FileOutputStream  fout = null;

	   try{	
		File f = new File("D:\\test_file\\abc.txt");
		if(f.exists() == false){
			f.createNewFile();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the data...");
			String data = sc.nextLine();
			
			fout = new FileOutputStream(f);
			
			byte b[] = data.getBytes();
		
		    fout.write(b);
            System.out.println("Operation success....");			
		}
		
	   }
	   catch(Exception e){
		   e.printStackTrace();
	   }
	   finally{
		   try{
			   fout.close();
		   }
		   catch(Exception e){
			   e.printStackTrace();
		   }
	   }
	}
}