/**
 * @author Rajani
 *
 */

package Comparable;                      

import java.util.*;

public class ComparableInterface {                          //comparableInterface class

	public static void main(String[] args) {                         //Main method
		// TODO Auto-generated method stub
		 List<Employee> list=new ArrayList<>();                   //List created
		 
		 //Add values to Employee class
         list.add(new Employee("Ansh",25,101,50000.00f));               
         list.add(new Employee("Akash",30,111,60000.00f));
         list.add(new Employee("Rakesh",35,125,80000.00f));
         list.add(new Employee("Amit",33,121,100000.00f));
         Collections.sort(list);
         
         //for loop used to print all the details 
         for(Employee i:list)
         {
      	   System.out.println("Employee id: "+i.emp_id+" Name: "+i.emp_name+" Age: "+i.emp_age+" Salary: "+i.emp_salary);
         }

	}//end of main
	

}//end of program
