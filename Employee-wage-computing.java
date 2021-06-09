import java.util.*;
public class EmployeewageUC6
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
		int totalhours=100;

		int ispresent = (int)(Math.random() * 3);
		switch (ispresent)
		{
		case 1:
		    System.out.println("Employee is Present");
			int dailywage1 = wage * fullday;
			System.out.println("Daily Wage is: " + dailywage1);
		    int daymonthlywage1 = dailywage1 * totaldays;
			int hoursmonthlywage1 = wage * totalhours;
			if (daymonthlywage1 < hoursmonthlywage1)
			{
				System.out.println("Monthly Wage is: " + daymonthlywage1);
			}
			else
			{
			    System.out.println("Monthly Wage is: " + hoursmonthlywage1);
			}
			break;
		case 2:
			System.out.println("Employee is Present Part Time");
			int dailywage2 = wage * parttime;
			System.out.println("Employee Daily Wage is: " + dailywage2);
		    int daymonthlywage2 = dailywage2 * totaldays;
			int hoursmonthlywage2 = wage * totalhours;
			if (daymonthlywage2 < hoursmonthlywage2)
			{
				System.out.println("Monthly Wage is: " + daymonthlywage2);
			}
			else
			{
			    System.out.println("Monthly Wage is: " + hoursmonthlywage2);
			}
			break;
        default:
			System.out.println("Employee is Absent");
		}
    }
}
