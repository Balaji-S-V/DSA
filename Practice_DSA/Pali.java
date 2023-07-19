import java.util.Scanner;

class Pali 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0,r;
        int temp = n;
        if(n > -1)
        {
            while (n>0)
            {
                r = n % 10;
                sum = (sum * 10) + r;
                n = n/10;
            }
            if(temp == sum)
            {
                System.out.println("This is a palindrome");
            }
            else
                System.out.println("Not a palindrome");
        }
        else
            System.out.println("Invalid Input");

    }
    
}
