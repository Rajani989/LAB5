/**
 * @author Rajani
 *
 */
package Comparable;

class Employee implements Comparable <Employee>            //class implements comparable
{
	String emp_name;
	int emp_age;
	int emp_id;
	float emp_salary;
	
	Employee(String emp_name,int emp_age,int emp_id,float emp_salary       //constructor used to initialize value
			)
	{
		this.emp_name=emp_name;
		this.emp_age=emp_age;
		this.emp_id=emp_id;
		this.emp_salary=emp_salary;
	}

	@Override
	public int compareTo(Employee o) {                                //compareTo which use to compare salary and arrange it 
		// TODO Auto-generated method stub
	
		if(emp_salary==o.emp_salary)
			      return 0;
		if(emp_salary>o.emp_salary)
		        return 1;
		else
			return -1;
	}
	
}