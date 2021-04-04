import java.util.*;

public class StringPalindrome {
    public static void main(String[] args) {
		String a = "Protijayi Meye MADAM GiniiniG Soudipta Gina";
		List<String> list = Arrays.stream(a.split(" ")).collect(Collectors.toList());
		System.out.println(list);
		List<String> plist = new ArrayList<>();
		for(int i = 0 ; i <list.size();i++) {
			String curr =list.get(i);
            if(ispalin(curr)){
			    plist.add(curr);
			}
		}
        System.out.println("palindrome list => " +plist);

    }

    private static boolean ispalin(String curr) {
        if(curr == null || curr.length() == 0) {return false;}
        return new StringBuffer(curr).reverse().toString().equals(curr);
    }

}