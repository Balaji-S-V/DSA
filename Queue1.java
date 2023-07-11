import java.util.LinkedList;
import java.util.Linkedlist;
import java.util.Queue;

public class Queue1
{
    public static void main(String[] args) 
    {
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i=1;i<10;i+=2)
        {
            q.add(i);
        }
    }
}