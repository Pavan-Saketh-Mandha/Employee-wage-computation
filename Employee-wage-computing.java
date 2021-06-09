import java.util.*;
public class EmployeewageUC4
{
	public static void main(String[] args) 
	{
		String greetings="Welcome to Employee Wage Computation Program on Master Branch";
		System.out.println(greetings);
		System.out.println("Wage per Hour is 20");
		System.out.println("Full Day Hour is 8");
		System.out.println("Part time Hour is 4");

		int wage=20;
                int fullday=8;
		int parttime=4;
		int totaldays=20;

		int ispresent = (int)(Math.random() * 3);
		switch (ispresent)
		{
		case 1:
		    System.out.println("Employee is Present");
			int dailywage1 = wage * fullday;
			System.out.println("Daily Wage is: " + dailywage1);
		    int monthlywage1 = dailywage1 * totaldays;
			System.out.println("Monthly Wage is: " + monthlywage1);
			break;
		case 2:
			System.out.println("Employee is Present Part Time");
			int dailywage2 = wage * parttime;
			System.out.println("Employee Daily Wage is: " + dailywage2);
		    int monthlywage2 = dailywage2 * totaldays;
			System.out.println("Monthly Wage is: " + monthlywage2);
			break;
        default:
			System.out.println("Employee is Absent");
		}
    }
}

