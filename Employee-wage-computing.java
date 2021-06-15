/**
 * Refactor the Code to write a Class Method to Compute Employee Wage
 * - Use Class Method and Class Variables
 *
 * @author uthor: Pavan Saketh
 * @version : 7.0
 * @since : 15-06-2021
 *
 */

import java.lang.*;
public class Employee_wageUC7
{
    public static final int ABSENT = 0;
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;


    public static void main(String[] args) {
        String greetings = "Welcome to Employee Wage Computation Program on Master Branch";
        System.out.println(greetings);
        System.out.println("Wage per Hour is 20");
        System.out.println("Full Day Hour is 8");
        System.out.println("Part time Hour is 4");

        employee_attendance();

        }

        public static void employee_attendance() {
        int working_Days = 0;
        int total_Working_Hours = 0;
        int salary =0;
        int count_fullTime = 0;
        int count_partTime = 0;
        int count_absent = 0;

        while (working_Days != 20) {
            int work_hours = 0;
            int Is_present = (int) Math.floor(Math.random() * 10) % 3;

            switch (Is_present) {
                case FULL_TIME -> {
                    count_fullTime++;
                    work_hours = 8;
                }
                case PART_TIME -> {
                    count_partTime++;
                    work_hours = 4;
                }
                case ABSENT -> {
                    count_absent++;
                    work_hours = 0;
                }
            }
            total_Working_Hours += work_hours;

            if (total_Working_Hours >= 100) {
                total_Working_Hours = 100;
                break;
            }

            int wage = wage_calculation(work_hours);
            salary += wage;
            working_Days++;
        }
        System.out.println("Employee Absent : "+count_absent+" Days");
        System.out.println("Employee Full Time Present : "+ count_fullTime +" Days");
        System.out.println("Employee Part Time Present : "+ count_partTime +" Days");
        System.out.println("Employee total working hours : "+ total_Working_Hours);
        System.out.println("Employee Salary for the month is : " + salary + " Rs /-");

    }

    public static int wage_calculation(int work_hours)
    {
        int Wage_per_hour = 20;
        return Wage_per_hour * work_hours;
    }
}
