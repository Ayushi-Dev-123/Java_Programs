class Prime implements Runnable
{
    public void run()
    {     
    	for(int no=2;no<=1000;no++)
        {
            int count=0;
            for(int i=2;i<=no/2;i++)
                if(no%i==0)
                {
                    count++;
                    break;
                }
            if(count==0)
                System.out.println(no+" Number is prime");
        }
    }
}


class PrimeMain
{
    public static void main(String args[])
    {
        try
        {
            Prime p1=new Prime();
            Thread t2=new Thread(p1);
            //t1.start();
            t2.start();
        }
        catch(Exception e1){}
    }
}