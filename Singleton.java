class A{
	private static A obj;
	private A(){}
	public static A getInstance(){
	    if(obj == null)	
            obj = new A();
        return obj;			
	}
}
class Singleton{
	public static void main(String arg[]){
	    A obj1 = A.getInstance();
        A obj2 = A.getInstance();
        System.out.println("obj1 : "+ obj1);
        System.out.println("obj2 : "+ obj2);
        System.out.print(obj1 == obj2); 
		 
		
	}
}