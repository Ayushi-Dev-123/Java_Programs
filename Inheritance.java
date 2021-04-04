class A{
	public void m1(){
		System.out.println("m1-called of A");
	}
}
class B extends A{
	public void m1(){
		System.out.println("m1-called of B");
	}
	public void m2(){
		System.out.println("m2-called of B");
	}
}
class C extends B{
	public void m1(){
		System.out.println("m1-called of C");
	}
}
class D extends A{
	public void m1(){
		System.out.println("m1-called of D");
	}
}
class Inheritance{
    public static void main(String arg[]){
		A obj = new A();    
		obj.m1();
		A aobj = new B();  //single
		aobj.m1();
		B bobj = new C();  
		bobj.m2();
		bobj.m1();
		A dobj = new D();
		dobj.m1();
	}
}