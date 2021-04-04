class AThread extends Thread{
    public void run(){
	    try{
	        for(int i = 0; i < 5; i++){
				System.out.println("A-Thread");
			}		
		}	
		catch(Exception e){
			e.printStackTrace();
		}
	}
    	
}
class BThread extends Thread{
    public void run(){
		try{
			for(int i =0; i < 5; i++ ){
				System.out.println("B-Thread");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}	
}
class A{
	 
}
class B{
	
}
class DeadLoack{
    public static void main(String srgs[]){
	}
}