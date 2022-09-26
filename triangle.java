import java.util.Scanner;
public class triangle 
{
    public static void main(String[] args) 
    {
            int n;
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
            n=in.nextInt();
            for(int i=0;i<n;i++)
            {
                System.out.println();
                for(int j=0;j<i;j++)
                {
                    System.out.print(" *");
                }
                
            }   
            in.close(); 
    }
}
//jfsefkj    

