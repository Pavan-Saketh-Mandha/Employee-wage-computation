/**
 * Compute Employee Wage for multiple companies - Note: Each Company has its own wage, number of working days
 * and working hours per month
 * - Use Class Method with function parameters instead of Class Variables
 *
 * @author uthor: Pavan Saketh
 * @version : 8.0
 * @since : 15-06-2021
 *
 */
public class Employee_wageUC8 {
    public static final int ABSENT = 0;
    public static final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    private final String Company_Name;
    private final int Wage_Per_Hour;
    private final int NumberOfWorkingDays;
    private final int MaxWorkingHours;

    private Employee_wageUC8(String Company_Name, int Wage_Per_Hour, int NumberOfWorkingDays, int MaxWorkingHours) {

        this.Company_Name = Company_Name;
        this.Wage_Per_Hour = Wage_Per_Hour;
        this.NumberOfWorkingDays = NumberOfWorkingDays;
        this.MaxWorkingHours = MaxWorkingHours;

    }


    public static void main(String[] args) {
        String greetings = "Welcome to Employee Wage Computation Program on Master Branch";
        System.out.println(greetings);
        Employee_wageUC8 dmart = new Employee_wageUC8("D-MART", 20, 20, 100);


        Employee_wageUC8 reliance = new Employee_wageUC8("Reliance Retail", 10, 30, 200);

        employee_attendance(dmart.Company_Name, dmart.Wage_Per_Hour, dmart.NumberOfWorkingDays, dmart.MaxWorkingHours);
        System.out.println();
        employee_attendance(reliance.Company_Name, reliance.Wage_Per_Hour, reliance.NumberOfWorkingDays, reliance.MaxWorkingHours);

    }

    public static void employee_attendance(String Company_Name, int Wage_Per_Hour, int NumberOfWorkingDays, int MaxWorkingHours) {
        int working_Days = 0;
        int total_Working_Hours = 0;
        int salary = 0;
        int count_fullTime = 0;
        int count_partTime = 0;
        int count_absent = 0;

        while (working_Days <= NumberOfWorkingDays) {
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

            if (total_Working_Hours >= MaxWorkingHours)
            {
                total_Working_Hours = MaxWorkingHours;
                break;
            }

            int daily_wage = wage_calculation(Wage_Per_Hour, work_hours);
            salary += daily_wage;
            working_Days++;

            display(Company_Name, count_absent, count_fullTime, count_partTime, total_Working_Hours, salary);
        }

    }

    private static void display(String Company_Name, int count_absent, int count_fullTime, int count_partTime, int total_Working_Hours, int salary) {

        System.out.println("Employee Wage Details for the company : " + Company_Name);
        System.out.println("Employee Absent : "+count_absent+" Days");
        System.out.println("Employee Full Time Present : "+ count_fullTime +" Days");
        System.out.println("Employee Part Time Present : "+ count_partTime +" Days");
        System.out.println("Employee total working hours : "+ total_Working_Hours);
        System.out.println("Employee Salary for the month is : " + salary + " Rs /-");
    }


    public static int wage_calculation ( int Wage_Per_Hour, int work_hours)
        {
            return Wage_Per_Hour * work_hours;
        }
    }
