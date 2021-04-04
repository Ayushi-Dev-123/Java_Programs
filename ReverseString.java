class ReverseString{
	public static void main(String args[]){
		String s1 = "Hello";
        String s2 = "";
		System.out.println("length : "+s1.length());
		System.out.println("charAt : "+s1.charAt(3));
        int length = s1.length();
 		
		for(int i=length-1;i>=0;i--){
            s2 = s2  + s1.charAt(i); 				          
		}
		System.out.println(""+s2);
	}
}