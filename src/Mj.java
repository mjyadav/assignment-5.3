/*
 *main class
 */
public class Mj {
	/* main method */

	public static void main(String[] args) {
		/* creating object */
		Employee obj1 = new PermanentEmp(25, "mky", 24, 50000);
		/* output */
		System.out.println("parmanent employee detail");
		/* calling id,name,no of leaves */
		System.out.println("Id  =" + obj1.empId);
		System.out.println("name =" + obj1.empName);
		System.out.println("leave =" + obj1.total_leaves);
		/* calling method */
		obj1.calculate_balance_leaves();
		obj1.avail_leave(21, (char) 0);
		obj1.calculate_salary();
		System.out.println("..................................");

		Employee obj2 = new TemporaryEmp(29, "mj", 20, 50001);
		System.out.println("temporay employee detail");
		/* calling id,name,no of leaves */
		System.out.println("Id  =" + obj2.empId);
		System.out.println("name =" + obj2.empName);
		System.out.println("leave =" + obj2.total_leaves);
		/* calling method */
		obj1.calculate_balance_leaves();
		obj1.avail_leave(20, (char) 0);
		obj1.calculate_salary();

	}

}
