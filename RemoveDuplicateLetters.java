import java.util.Scanner;
class RemoveDuplicateLetters {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String str1 = sc.nextLine();
        System.out.println(removeDuplicateChars(str1));
    }
 
    static  String removeDuplicateChars(String sourceStr) {
        char[] chrArray = sourceStr.toCharArray();
        String target = "";
        for (char value : chrArray) {
            if (target.indexOf(value) == -1) {
                target += value; 
            }
        }
        return target;
    }
}
 