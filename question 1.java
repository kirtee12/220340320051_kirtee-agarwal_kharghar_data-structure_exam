import java.util.Scanner;
class InsertionSort{
 public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number of elements");
  int n=sc.nextInt();
  int []a1 = new int[n];
  System.out.println("Enter the  elemnts");
  for(int i=0;i<n;i++)
    {
	  a1[i]= sc.nextInt();
	 }
	 System.out.println("==================");
	 
	 //insertion sort
	 for(int i=1;i<=n-1;i++)
	 {
	   int temp = a1[i];
	   int j= i-1;
	   while(temp<=a1[j] && j>0)
	   {
	     a1[j+1] = a1[j];
		 j=j-1;
		}
       for( i=0; i<n;i++)
{
  System.out.print(a1[i] +" ");
}
}
 }  
}