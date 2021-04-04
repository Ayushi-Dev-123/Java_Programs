class Math{
    private int n1, n2;
    public Math() { }
    int add(){
       return n1+n2;  
    }
    int subtract(){
       return n1-n2; 
    }
    int multiply(){
       return n1*n2;     
    }
    float divide(){
        return n1/n2;
    }
    public int getn1(){
        return this.n1;   
    }
    public int getn2(){
        return  this.n2;   
    }
    public void setn1(int n1){
        this.n1 = n1;   
    }
    public void setn2(int n2){
        this.n2 = n2;   
    }
    public int getAdd(){
         return this.add();
    }
    public int getSubtract(){
         return this.subtract();
    }
    public int getMultiply(){
         return this.multiply();
    }
    public float getDivide(){
         return this.divide();
    }
}
class MathOperation{
    public static void main(String[] args) {
        Math m = new Math();
        m.setn1(6);
        m.setn2(5);
        int r1 = m.getAdd();
        int r2 = m.getSubtract();
        int r3 = m.getMultiply();
        float r4 = m.getDivide(); 
        System.out.println("Add = "+r1+"\nSubtract = "+r2 +"\nMultiply = "+r3 + "\nDivide = "+r4);       
    }
}