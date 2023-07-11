public class Stackpb //LIFO
{
    private int arr[];
    private int top;
    private int capacity;
    Stackpb(int x)
    {
        arr = new int[x];
        capacity = x;
        top = -1; //When the Stack is empty we should assign top value as -1
    }
        public void push(int value)
        {
            if(isFull())
            {
                System.out.println("Stack overflow");
                System.exit(1);
            }
            System.out.println("Inserting the Element " + value);
            arr[++top] = value;
        }
        public int pop()
        {
            if(isempty())
            {
                System.out.println("Stack is empty");
                System.exit(1);
            }    
            return arr[top--];
        }
        public void peek()
        {
            System.out.println("Top element : "+arr[top]); 
        }
        public Boolean isempty()
        {
            return top==-1;
        }
        public Boolean isFull()
        {
            return top == capacity - 1;
        }
        public void display()
        {
            for(int i =0;i<=top;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        public void getSize()
        {
            //return top + 1;
            System.out.println(top+1);
        }
    
        public static void main(String[] args) 
        {
            Stackpb obj = new Stackpb(5);
            obj.push(5);
            obj.push(10);
            obj.push(45);
            obj.push(56);
            //obj.peek();
            obj.pop();
            obj.getSize();
            obj.display();
        }
    }