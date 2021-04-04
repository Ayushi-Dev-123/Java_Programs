import java.io.*;
import java.util.Scanner;

class CountNumberOfLetters {
    public static void main(String[] args)throws IOException {
        int counter = 0;
		String fileName = "D:\\test_file\\abc.txt";
        String line = "";
        Scanner scanner = new Scanner(new FileReader(fileName));
        try {
            while( scanner.hasNextLine() ){
                line = scanner.nextLine();
				for( int i=0; i<line.length(); i++ ) {
					if( line.charAt(i) == 'a' ) {
						counter++; 
					} 
				}  
			}
			System.out.println(counter); 
        }
        finally {
          scanner.close();
        }
	}
}