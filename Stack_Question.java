//Q-3: 
            import java.util.Scanner;
			class Stack_Question{
			  final int max;
			  int top = -1;
			  int[]s;
			  int size{
			  this.max = size;
			  this.s = new int[max];
							 }
			  boolean isEmpty(){
				  if(top == -1)
				   return true;
				  else
				   return false;
							   }
			  boolean isFull(){
				   if(top >= max-1)
					 return true;
				   else
					  return false;
								}
			 void push(int val){
				   if(top < max-1){
					 s[++top] = val;
				   }
				 else 
                     System.out.println("Stack is Full");
			 }
             int pop(){
                if(top==-1)
				{ 
                   System.out.println("Stack is empty");
				   return-1;
                }
				return s[top--];
			 }
			  int peek(){
				  if(top==-1){
					  System.out.println("Stack is empty");
					  return - 1;
				  }
                return s[top];
              }
             void display(){
                for(int i=top;i>=0;i--){
               System.out.println(s[i]);
				}
			 }
			 }
			
			
       

         class StackDemo{
          public static void main(String[] args){
          Stack s1 = new Stack();
          System.out.println(s1.isEmpty());
          s1.push(5);
          s1.push(10);
          s1.push(15);
          s1.push(11);
		  s1.push(7);
		  s1.push(40);
		  s1.display();
		  System.out.println(s1.Full());
		  System.out.println(s1.pop()+" is popped from the stack");
		  System.out.println(s1.pop()+" is popped from the stack");
		  s1.display();
		  }
		 }
		  
		  
					 
				 
											
			   