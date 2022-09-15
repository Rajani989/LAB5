/**
 * @author Rajani
 *
 */
package Thread;



public class ThreadExample extends Thread                 //class ThreadExample
{
	ThreadExample()                                 //constructor of ThreadExample

	{
		start();                                //call run method using Thread
	}
	public void run()                      //run method
	   {
		
		 double sum=0;          //initialization of sum   
	     double avg=0;          //initialization of average
	      for(int i=1;i<=50;i++)         //loop from 1 to 50
		   {
	    	  sum+=i;                   //sum from 1 to 50
		   }
		avg=sum/50;                  //find average
		System.out.println("Average of 50 numbers: "+avg);    //print average value
	   }  
		   
		  
	public static void main(String[] args) {                     //main method
		// TODO Auto-generated method stub
		  ThreadExample obj=new ThreadExample();          //create object of ThreadExample(class)
		 
		  
		   int arr[]= {10,15,20,25,30};             //initialization of array
		   for(int j=0;j<arr.length;j++)            //loop to take value
		   {
			  System.out.println("Square of "+arr[j]+" : "+arr[j]*arr[j]);            //square of arr element and print
	       }
		   
	}//end of main
	
}//end of program
