public class hotel implements veg,nonveg 
{
    public void vegPrice(float p)
    {
        if (p>2000)
        {
            p = p - (float)0.2*p;
            System.out.println(p);
        }
    }
    public void nonvegPrice(float p)
    {
        if (p>2000)
        {
            p = p - (float)0.4*p;
            System.out.println(p);
        }
    }
    public static void main(String[] args)
    {
        hotel obj = new hotel();
        obj.vegPrice(2500);
        obj.nonvegPrice(10000);
    }
}

interface veg
{
    void vegPrice(float price);
}
interface nonveg
{
    void nonvegPrice(float price);
}
