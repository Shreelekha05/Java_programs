package assess1;
import java.util.Scanner;
public class project {
    public static void main(String[] args) {
        int[] empNos = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empNames = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] joinDates = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "01/01/2000", "12/06/2006"};
        String[] designations = {"e", "c", "k", "r", "m", "e", "c"};
        String[] departments = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] basics = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] HRAs = {8000, 12000, 8000, 6000, 15000, 9000, 12000};
        int[] ITs = {3000, 9000, 1000, 2000, 4400, 1000, 2000};
        String[] designationCodes = {"e", "c", "k", "r", "m"};
        String[] designationNames = {"Engineer", "Consultant", "Clerk", "Receptionist", "Manager"};
        int[] DAs = {20000, 32000, 12000, 15000, 40000};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int empId = sc.nextInt();
        sc.close();
        int empIndex = -1;
        for (int i = 0; i < empNos.length; i++) {
            if (empNos[i] == empId) {
                empIndex = i;
                break;
            }
        }
        if (empIndex == -1) {
            System.out.println("There is no employee with emp ID: " + empId);
            return;
        }
        String empName = empNames[empIndex];
        String department = departments[empIndex];
        String desigCode = designations[empIndex];
        int basic = basics[empIndex];
        int HRA = HRAs[empIndex];
        int IT = ITs[empIndex];
        String designation = "";
        int DA = 0;
        for (int i = 0; i < designationCodes.length; i++) {
            if (designationCodes[i].equals(desigCode)) {
                designation = designationNames[i];
                DA = DAs[i];
                break;
            }
        }
        int salary = basic + HRA + DA - IT;
        System.out.println("\nEmp No.\tEmp Name\tDepartment\tDesignation\tSalary");
        System.out.println(empId + "\t" + empName + "\t         " + department + "     \t" + designation + "       \t" + salary);
    }
}
