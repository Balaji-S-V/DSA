class Queue 
{
    int SIZE = 5;
    int rear;
    int front;
    int arr[] = new int[SIZE];   
    Queue()
    {
        front = -1;
        rear = -1;
    } 
    boolean isFull()
    {
        if(front == 0 && rear == SIZE-1)
            return true;  
        else
            return false;
    }
    boolean isEmpty()
    {
        if(front == -1)
            return true;
        else
            return false;
    }
    public void enqueue(int element)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
        }
        else
        {
            if(front == -1)
            {
                front = 0;
            }
            rear++;
            arr[rear] = element;
            System.out.println("Inserted Element "+element);
            
        }
    }
    public int dequeue()
    {
        int element;
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return(-1);
        }
        else
        {
            element = arr[front];
            if(front>rear)
            {
                front = -1;
                rear = -1;
            }
        }
        
    }
}
