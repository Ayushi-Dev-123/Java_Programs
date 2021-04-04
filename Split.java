class Split{  
    public static void main(String[] args) {  
        int sum = 0;
		String str = "67, 89, 23, 67, 12, 55, 66";  
        System.out.println("Returning words : ");  
        String[] arr = str.split(",");  
        for (String w : arr) {  
            System.out.println(w);		
            //int x = Integer.parseInt(w);
            //System.out.println(x);			
		}  
		
        //System.out.println("Sum : "+ sum );  
    }  
}  