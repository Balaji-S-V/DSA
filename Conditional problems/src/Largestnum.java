import java.util.Scanner;

public class Largestnum 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        // if (a>b && a>c)
        // System.out.println(a);
        // if (b>a && b>c)
        // System.out.println(b);
        // else
        // System.out.println(c);
        int max = Math.max(a, b);
        if (c>max)
        System.out.println(c);
        else
        System.out.println(max);
    }
}
