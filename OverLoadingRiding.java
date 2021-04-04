class A{
	int n1, n2;
	public void m1(){
		System.out.println("A - m1");
	}
}
class B extends A {
	public void m1(){
		System.out.println("B - m1");
	}
	public void m2(){
		System.out.println("B - m2");
	}
}
class OverLoadingRiding{
    public int add(int n1, int n2){
		//System.out.println("c = " + c);
		return (n1+n2);
	}
	public float add(float n1, float n2){
		//System.out.println("add : "+n1+n2);
		return (n1+n2);
	}   
    public static void main(String arg[]){
		OverLoadingRiding obj = new OverLoadingRiding();//overloading
		System.out.println(""+obj.add(3,2));
		System.out.println(""+obj.add(5.2f,3.3f));
		A aObj = new B();
		aObj.m1(); //overriding		
		
	}
}