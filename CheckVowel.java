class CheckVowel{
    public static void main(String[] args){
	    int flag = 0;
		String str = "Welcome to Java world";
    	if(str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o") || str.contains("u")){
	        flag = 1;       	    
		}
		if(flag == 1)
		    System.out.println("String contain vowels");
		else
            System.out.println("String does not contain vowels"); 		
	}     
}