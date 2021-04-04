class NullPointer{
    public static void main(String args[]){
	    //Object obj = null ;
		//System.out.println("Object : "+obj.toString());
		String ptr = null;
		try
        {  
            if (ptr.equals("abc")) 
                System.out.print("Same"); 
            else
                System.out.print("Not Same"); 
        } 
        catch(NullPointerException e) 
        { 
            System.out.print("NullPointerException Caught"); 
        } 
	}
}