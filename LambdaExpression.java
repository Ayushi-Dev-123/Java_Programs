/*@FunctionalInterface
interface I
{
    double maximum(double x, double y);
}
class Main
{
    public static void main(String[] args) {
         I obj = Math::max;
         double max = obj.maximum(20,10);
         System.out.println(max);       
    }
}*/

@FunctionalInterface
interface I {
      public void wish();
} 
class LambdaExpression{
      public static void main( String args[ ] ) { 
            I obj1 = () -> System.out.println("GM");
           //I.obj2 = () -> System.out.println("");
           //I.obj3 = () -> System.out.println("");
            obj1.wish( );
            //obj1.wish( );
           // obj1.wish( );
      } 
}
