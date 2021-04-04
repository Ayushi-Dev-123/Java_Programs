import java.util.Scanner;
class RemoveSpace{
    public static void main(String arg[]){
		String str = "  A y u  shi   ";
		System.out.print(str.replaceAll("\\s",""));
	}
}