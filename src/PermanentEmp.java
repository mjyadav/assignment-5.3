/*  inherit*/
public class PermanentEmp extends Employee {
	
	/*  constructor declare*/
	 PermanentEmp(int id, String name, int total, double sal) {
		 super(id,name,total,sal);
		
	}/*  variable initialization */
	 int paid_leave=7, sick_leave=5, casual_leave=2;  
	 double basic=10000, hra=4000,pfa=1000;
	 /*  method declare */
	 void print_leave_details(){
		 /*  output*/
		 System.out.println( "paid_leave"+ paid_leave+  "sick_leave"+sick_leave+"casual_leave"+casual_leave);
	 }
	@Override
	void calculate_balance_leaves() {
		/*  calculation*/
		int total=total_leaves-(paid_leave+sick_leave+casual_leave);
		/*  output*/
		System.out.println("leave Balance ="+total);
		
		
	}
	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		/*  if  condition*/
		if(no_of_leaves<total_leaves)
		  return true;
		else
		  return false;
	}
	@Override
	void calculate_salary() {
		/*  calculation*/
		double hra=.5f*basic;
		double da=.2f*basic;
		double totalSalary=total_salary+(hra+da)-pfa;
		/*  outputF*/
		System.out.println("Salary ="+totalSalary);
		
		
	} 

}
