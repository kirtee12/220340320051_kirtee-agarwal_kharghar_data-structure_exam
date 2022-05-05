import java.util.Scanner;
class LinkedList {
    
	static class Node {
	     int data;
		 Node next;
		 Node(int d)
		 {
		 data =d;
		 next = null;
		 }
	}
		  
		
         Node head  = null;
         Node tail = null;
         
		
		
		public void creation()
		{
		 System.out.println("Enter data");
		 int data;
		 int n;
		 Node head;
		 Scanner sc = new Scanner(System.in);
		 
		 do
		 {
			 data= sc.nextInt();
			 Node new_node= new Node(data);
			 if(head == null)
			 {
				 head= new_node;
				 tail=new_node;
				 
			 }
            else
			{ new_node.next=head;
              head.prev = new_node;
              head=new_node;
			}
			System.out.println("do you want to add");
			n=sc.nextInt();
		 }
		 while(n==1);
		}
		public void display()
		{
			Node temp = head;
			if(head == null)
			{
				System.out.println("Linkedlist not exisyeted");
			}
			else
			{
               while(temp!=null){
                System.out.print(temp.data);
                temp= temp.next;
			   }
			}
		}
        public void display1()
		{
			Node head = tail;
			Node prev;
			Node temp1= head;
			if(head == null)
			{
				System.out.println("Linkedlist not");
			}
else 
{
 while(temp1!=null)
 {
   System.out.print(temp1.data);
   temp1= temp1.prev;
 }
}
		}
}

class LL 
{
	 public static void main(String[] args)
	 {
		 LinkedList l1 = new LinkedList();
		 l1.creation();
		 System.out.println("normal order");
		 
		 l1.display();
		  System.out.println();
		   System.out.println("reverse order");
         l1.display();
	 }
}







		




		
			
			
			
		
		
		
		
		
			  
		 
		   
		   
		   
		   
			