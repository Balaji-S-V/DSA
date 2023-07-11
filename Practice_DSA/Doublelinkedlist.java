public class Doublelinkedlist 
{
    class Node
    {
        Node prev;
        int data;
        Node next;

        public Node(int data)
        {
            this.prev=null;
            this.data=data;
            this.next=null;
        }
    }
        public Node head = null;
        public Node tail = null;
    
        public void addNode(int data)
        {
            Node newnNode = new Node(data);
            if(head==null)
            {
                head = newnNode;
                tail = newnNode;
                head.prev = null;
                tail.next=null;
            }
            else
            {
                tail.next=newnNode;
                newnNode.prev = tail;
                tail = newnNode;
                tail.next=null;
            }
        }
        public void display()
        {
            Node current = head;
            if(head==null)
            {
                System.out.println("Empty");
            }
            System.out.println("Nodes of linked list");
            while(current!=null)
            {
                System.out.println(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
        public void insertbegin(int data)
        {
            Node newNode = new Node(data);
            if(head==null)
            {
                head = newNode;
                tail = newNode;
            }    
            else
            {
                Node temp = head;
                head = newNode;
                head.next = temp;
            }

        }
        public void deletefrombeg()
        {
            if(head==null)
            {
                System.out.println("empty");
            }
            else
            {
                if(head!=tail)
                {
                    head = head.next;
                }
                else
                head = tail = null;
            }
        }
        public void deletefromend()
        {
            if(head==null)
            {
                System.out.println("Empty List");
            }
            else
            {
                if(head!=tail)
                {
                    Node current =  head;
                    while(current.next != tail)
                    {
                        current = current.next;
                    }
                    tail = current;
                    tail.next = null;
                }
                else
                head = tail = null;
            }
        }
        public void deletefrompos(int n)
        {
            if(head==null)
            {
                System.out.println("Empty List");
            }
            else
            {
                Node current = head;
                int pos = n;
                for(int i=1;i<pos;i++)
                    current = current.next;
                if(current == head)
                {
                    head = current.next;
                }
                else if(current==tail)
                {
                    tail = tail.prev;
                }
                else
                {
                    current.prev.next = current.next; 
                    current.next.prev = current.prev;
                }
                current = null;
            }
        }
        public static void main(String[] args) 
        {
    
            linkedlist obj = new linkedlist();
            obj.addNode(1);
            obj.addNode(3);
            obj.addNode(6);
            obj.addNode(8);
            obj.insertbegin(10);
            obj.insertbegin(19);
            obj.display();
            // while (obj.head != null)
            // {
            //     System.out.println("Updated lIst");
            //     obj.deletefrombeg();
            //     obj.display();
            // }
            while(obj.head!=null)
            {
                 obj.deletefromend();
                System.out.println("Updated List");
                obj.display();
            }
        }
}
