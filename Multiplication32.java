import java.util.Scanner;
class MathOperation{
    private int n1, n2, mul=1;
    protected int multiply(int n1, int n2){
        return(n1*n2);
    }
    protected float multiply(float a, float b,float c) {
        return(a*b*c);
    }
    protected double multiply(double a, int b){
        return(a*b);
    }
    int arr[] = new int[3];
    int multiply(int arr[]){ 
        for(int i=0;i<arr.length;i++){
           mul = mul*arr[i];
        }
        return mul;
    }
}
class Multiplication32{
    public static void main(String[] args){
        MathOperation m = new MathOperation();
          
        int arr[] = {1,2,3 };
        System.out.println("Array length = " + arr.length);
        
        double res = m.multiply(3,5);
        System.out.println("Multiplication of 2 interger = " + res);
        
        res = m.multiply(1.3f, 5.9f,6.7f);
        System.out.println("Multiplication of 3 floats = " + res);
        
        res = m.multiply(4,5);
        System.out.println("Multiplication of 1 double and 1 integer = " + res);
        
        res = m.multiply(arr);
        System.out.println("Multiplication of array elements are = " + res);
    }
}