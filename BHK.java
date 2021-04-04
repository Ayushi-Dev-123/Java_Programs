class OneBHK {
    protected float roomArea, hallArea;
    protected double price;
    protected OneBHK() {
        System.out.println(" One_BHK Default Constructor");
    }
    protected OneBHK(float roomArea, float hallArea, double  price){
        this.roomArea = roomArea;
        this.hallArea = hallArea;
        this.price = price;
    }
    protected void show1(){
        System.out.println(" Area of Room = "+ roomArea +"\n Area of Hall = "+ hallArea + "\n Price = " + price);
    }
    protected double getPrice1(){
        return price;
    }
}
class TwoBHK extends OneBHK {
    protected float room2Area;
    protected double price;
    protected TwoBHK() {
        System.out.println(" Two_BHK Default Constructor");
    }
    protected TwoBHK(float roomArea, float room2Area, float hallArea, double price){
        super(roomArea,hallArea,price);
        this.room2Area = room2Area;
        this.price = price;
    }
    protected void show2(){
        System.out.println(" Area of Room 1 = "+ roomArea +"\n Area of Room 2 = "+ room2Area +"\n Area of Hall = "+ hallArea + "\n Price = " + price);
    } 
    protected double getPrice2(){
        return price;
    }
}
class BHK{
    public static void main(String[] args) {
        TwoBHK ob[] = new TwoBHK[3];
        ob[0] = new TwoBHK(12f,15f,20f,15000);
        ob[1] = new TwoBHK(10f,10f,20f,17000);
        ob[2] = new TwoBHK(20f,22f,30f,20000);
       
        ob[0].show2();
        ob[1].show2();
        ob[2].show2();
        double amt =0;
        for(int i=0;i<3;i++){
            amt += ob[i].getPrice2();
        }
        System.out.println("\n Total Ammount = " + amt);
    }
}