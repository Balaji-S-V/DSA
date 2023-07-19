import java.util.Scanner;

class Stack
{
    int top;
    int arr[];
    int capacity;
    Stack(int x)
    {
        arr = new int[x];
        capacity = x;
        top = -1;
    }
    public void push()
    {
        if(isFull())
            {
                System.out.println("Stack overflow");
            }
            System.out.println("Inserting the Element " + value);
            arr[++top] = value;
    } 
    public void pop()
    {
        if(isempty())
        {
            System.out.println("No elements in stack");
        }
        return arr[top--];
    }
    boolean isempty()
    {
        return top == -1
    }
    boolean isFull()
    {
        return top ==  capacity-1;
    }
    
}
class Freqstack
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack obj = new Stack(n);

    }
}