class Occurance{
    public static void main(String args[]){
		char search, ch;
		int count=0;
		String str = "aabbccddd";
		for(int i=0; i<str.length(); i++){ 
			ch = str.charAt(i);
			for(search='a'; search<='z'; search++){
				if(search == ch)
				   count++;
			}
			//System.out.print("ch : "+ ch + " count : "+ count);
		}
		for(int i=0; i<str.length(); i++){
			ch = str.charAt(i);
			System.out.print(" ch : "+ ch + " count : "+ count);	
		    
		}
		
	} 
}