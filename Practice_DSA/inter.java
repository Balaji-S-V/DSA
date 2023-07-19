interface bank
{
    public void interest();
}
class SBI implements bank
{
    public void interest()
    {
        System.out.println("4%");
    } 
}
class IOB implements bank
{
 public void interest()
 {
    System.out.println("8%");
 }
}
public class inter 
{

 public static void main(String[] args) 
 {
  SBI sbi = new SBI();
  IOB iob = new IOB();
  sbi.interest();
  iob.interest();  
 }
}
