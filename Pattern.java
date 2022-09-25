import java.util.*;
public class Pattern 
{
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        n = in.nextInt();
        in.close();
        for(int i=0;i<n;i++)
        {
            System.out.println("\n");
            for(int j=0;j<n;j++)
            {
                System.out.print("\t*");
            }
            
        }
    }
}
