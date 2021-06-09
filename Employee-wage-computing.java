import java.util.*;
class EmployeewageUC2
{
	public static void main(String[] args) 
	{
		String greetings="Welcome to Employee Wage Computation Program on Master Branch";
		System.out.println(greetings);
		System.out.println("Wage per Hour is 20");
		System.out.println("Full Day Hour is 8");

		int wage=20;
                int fullday=8;

		int ispresent = (int)(Math.random() * 3);
		if (ispresent == 1)
		{
			System.out.println("Employee is Present");
			int dailywage = wage * fullday;
			System.out.println("Employee Daily Wage is: " + dailywage);
		}
		else
	    {
			System.out.println("Employee is Absent");
		}
    }
}
