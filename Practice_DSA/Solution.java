package Practice_DSA;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        if(q<=500 && q>=0)
        {
            for (int i=0;i<=q;i++)
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int n = sc.nextInt();
                if(a>=0 && a<=50 && b>=0 && b<=50 n>=1 && n<=15)
                {
                    for(int j=0;j<n;j++)
                    System.out.print(a+(2^j*b) + " ");
                }
            }
            
        }
    }
    
}
