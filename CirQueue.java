import java.util.*;
class CirQueue
{
    int[] cq;
    int cap;
    int front;
    int rear;
    CirQueue(int max)
    {
        cap=max;
        cq=new int[cap+1];
        front=rear=0;
    }
    void push(int n)
    {
        if((rear+1)%(cap+1) == front)
            System.out.println("Queue Overflow");
        else
            cq[rear++]=n;
        rear%=(cap+1);
    }
    void pop()
    {
        if(front==rear)
            System.out.println("Queue Underflow");
        else 
        {
            System.out.println(cq[front++]);
        }
        front%=(cap+1);
    }
    void show()
    {
        for(int i=front;i!=rear;i++,i%=(cap+1))
            System.out.println(cq[i]);
    }
    public static void main(String[] args)
    {
        System.out.println("Enter size of queue");
        CirQueue ob=new CirQueue(new Scanner(System.in).nextInt());
        int choice=0;
        do
        {
            do
            {
                System.out.println("Press 1 for push \n2 for pop\n3 for showing\n4 for exiting");
                choice=new Scanner(System.in).nextInt();
            }while(choice<1 || choice>4);
            
            switch(choice)
            {
                case 1: System.out.println("Enter element");
                ob.push(new Scanner(System.in).nextInt());
                break;
                case 2: ob.pop();
                break;
                case 3: ob.show();
                break;
                default: System.exit(0);
            }
        }while(choice!=4);
    }
}