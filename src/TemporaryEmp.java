
/*  inherit*/
public class TemporaryEmp extends Employee {
	/* constructor declare */

	TemporaryEmp(int id, String name, int total, double sal) {
		/* super */
		super(id, name, total, sal);

	}/* variable initialization */

	int paid_leave = 3, sick_leave = 5, casual_leave = 2;
	/* method declare */

	void print_leave_details() {
		/* output */
		System.out.println("paid_leave" + paid_leave + "sick_leave" + sick_leave + "casual_leave" + casual_leave);
	}

	@Override
	void calculate_balance_leaves() {
		/* calculation */
		int total = total_leaves - (paid_leave + sick_leave + casual_leave);
		System.out.println("leave Balance =" + total);

	}

	@Override
	boolean avail_leave(int no_of_leaves, char type_of_leave) {
		if (no_of_leaves < total_leaves)
			return true;
		else
			return false;
	}

	@Override
	void calculate_salary() {
		float hra = (float) 30.50;
		int rate = 1000;
		/* calculation */
		double totalSalary = hra * rate;
		/* outputF */
		System.out.println("Salary =" + totalSalary);

	}

}
