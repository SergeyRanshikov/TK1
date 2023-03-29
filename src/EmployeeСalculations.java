public class EmployeeСalculations {


    public static double totalSalaryMount (Employee[] employees) {
        double sum = 0;
        for (Employee element: employees) {
            sum = sum + element.getSalary();
        }
        return sum;
    }


}
