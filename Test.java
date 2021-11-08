public class Test {
    public static void main(String[] args) {

        EmployeeFactory employeeFactory = new EmployeeFactory();
        Employee[] randomEmployees = employeeFactory.getRandomEmployees(5);
        EmployeeService employeeService = new EmployeeService(randomEmployees);

        System.out.println ("================= Print all Employees ====================");
        employeeService.printEmployees();

        System.out.println ("================= Print Bonus Employee by Id ====================");
        employeeService.getBonusByID(5);

        System.out.println ("================= Print calculated salary ====================");
        System.out.println(employeeService.calculateSalaryAndBonus());

        System.out.println ("================= Print Employee by Id ====================");
        Employee employeeById = employeeService.getById(1);
        System.out.println(employeeById);

        System.out.println ("================= Print Employee by Name ====================");
        Employee[] employeeByName = employeeService.getByName("Stas");

        System.out.println ("================= Sort Employee by Name ====================");
        employeeService.sortByName();
        employeeService.printEmployees();

//        System.out.println ("================= Sort Employee by Name and Salary ====================");
//        employeeService.sortByNameAndSalary();
//        employeeService.printEmployees();

        System.out.println ("================= Edit Employee ====================");
        Employee employeeForEdit = employeeService.edit(employeeFactory.getRandomEmployees(1)[0]);
        System.out.println(employeeForEdit);
        System.out.println ("================= Edited Data Table ====================");
        employeeService.printEmployees();

        System.out.println ("================= Delete Employee ====================");
        Employee removeEmployeeById = employeeService.remove(2);
        System.out.println(removeEmployeeById);




    }


}
