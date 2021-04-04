import java.util.Scanner;
class Product{
    public int pId;
    public float price;
    public int qty; 
    public float total = 0; 	

    public Product (int pId, int qty, float price){
		this.pId = pId;
		this.qty = qty;
		this.price = price;
	} 
	
    public String toString(){
		return pId + "\t"+ qty + "\t" + price; 	
	} 
    
}
class ProductMain{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		/*Product arr[] = new Product[5];
    	arr[0] = new Product(1, 10, 100);
        arr[1] = new Product(2, 20, 200);
        arr[2] = new Product(3, 30, 300);
    	arr[3] = new Product(4, 40, 400);
        arr[4] = new Product(5, 50, 500);	
		//Product p = new Product();
		for(int i=0;i<5; i++){
		    System.out.println("Product details : "+arr[i]);	
		}
		*/    
        System.out.print("Enter size = ");
        int size = sc.nextInt();
     
        sc.nextLine();
        Product p[] = new Product[size];
    
		for(int i=0;i<emp.length;i++){
            System.out.print("Enter id  = ");
            int pId = sc.nextInt();
           
            System.out.print("Enter qty  = ");
            int qty = sc.nextInt();
           
            System.out.print("Enter price = ");
            float price = sc.nextFloat();
          
            sc.nextLine();
            p[i] = new Product(pId, qty, price);
        }
		
		for(int i=0;i<emp.length; i++){
		    System.out.println("Product details : "+p[i].toString());	
		}
	}
}