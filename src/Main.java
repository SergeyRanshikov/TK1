public class Main {


    public static void main(String[] args) {

            Employee[] employee = new Employee[10];
            employee[0] = new Employee("1", "Сидоров", "Сидр", "Сидорович", 35700);
            employee[1] = new Employee("3", "Андреев", "Андрей", "Андреевич", 28900);
            employee[2] = new Employee("1", "Борисов", "Борис", "Борисович", 47300);
            employee[3] = new Employee("2", "Степанов", "Степан", "Степанович", 51000) ;
            employee[4] = new Employee("3", "Александров", "Александр", "Александрович", 28700);
            employee[5] = new Employee("4", "Иванов", "Иван", "Иванович", 41000);
            employee[6] = new Employee("5", "Сергеев", "Сергей", "Сергеевич", 38900);
            employee[7] = new Employee("5", "Алексеев", "Алексей", "Алексеевич", 31400);
            employee[8] = new Employee("3", "Константинов","Константин","Константинович", 24980);
            employee[9] = new Employee("4", "Владимиров","Владимир", "Владимирович", 39600);

            for (Employee t : employee) {
                System.out.println(t);
            }
            System.out.println(employee[0]);


//            System.out.println(employee.getEmployee());



            System.out.println(employee[0].getSalary());

            System.out.println(employee[0].getLastName() + " " + employee[0].getFirstName() + " " + employee[0].getSecondName());
    }



}