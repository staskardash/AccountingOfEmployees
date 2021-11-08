public class EmployeeService {
    Employee[] employees;

    public EmployeeService (Employee[] employees) {
        this.employees = employees;
    }


    void printEmployees () {
        for (int i = 0; i < employees.length; i++) {
            System.out.print ("This is the employee! ");
            System.out.print (" id " + employees[i].getId());
            System.out.print (", name " + employees[i].getName());
            System.out.print (", age " + employees[i].getAge());
            System.out.print (", salary " + employees[i].getSalary());
            System.out.print (", gender " + employees[i].getGender());
            System.out.print (", fixedBugs " + employees[i].getFixedBugs());
            System.out.println (", defaultBugRate " + employees[i].getDefaultBugRate());

        }
    }

    void getBonusByID (int id) {
        for (int i = 0; i < employees.length; i++) {
            Employee currentEmployee = employees[i];
            if(currentEmployee.getId() == id) {
                System.out.println(currentEmployee.getBonus());
            }
        }
        System.out.println("You chose non-existent id. Plz try another.");
    }

    double calculateSalaryAndBonus () {
        double value = 0;
        for (Employee employee : employees) {
            value += employee.getSalary() + employee.getBonus() ;
        }
        return value;
    }

    Employee getById (int id) {
        for (int i = 0; i < employees.length; i++) {
            Employee currentEmployee = employees[i];
            if (currentEmployee.getId() == id) {
                return currentEmployee;
            }
        }
        return null;
    }

    Employee[] getByName (String name) {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            Employee currentEmployee = employees[i];
            if (currentEmployee.getName().equals(name)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Employee with name Stas absent in our data table");
            return null;
        }

        Employee[] arrayEmployee = new Employee[count];
        int arrayCount = 0;
        for (int i = 0; i <employees.length; i++) {
            Employee currentEmployee = employees[i];
            if (currentEmployee.getName().equals(name)) {
                arrayEmployee[arrayCount] = currentEmployee;
                System.out.println(arrayEmployee[arrayCount]);
                arrayCount++;
            }
        }
        return arrayEmployee;
    }

    Employee[] sortByName () {
        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                Employee currentEmployee;
                if (employees[i].getName().compareTo(employees[j].getName()) > 0) {
                    currentEmployee = employees[i];
                    employees[i] = employees[j];
                    employees[j] = currentEmployee;
                }
            }
        }
        return employees;
    }

    Employee[] sortByNameAndSalary () {
        for (int i = 0; i < employees.length; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                Employee currentEmployee;
                if (employees[i].getName().compareTo(employees[j].getName()) > 0) {
                    currentEmployee = employees[i];
                    employees[i] = employees[j];
                    employees[j] = currentEmployee;
                } else if (employees[i].getName().compareTo(employees[j].getName()) == 0) {
                    if (employees[i].getSalary() > employees[j].getSalary()) {
                        currentEmployee = employees[i];
                        employees[i] = employees[j];
                        employees[j] = currentEmployee;
                    }
                }
            }
        }
        return employees;
    }

    Employee edit (Employee employee) {
        int id = employee.getId();
        Employee editedEmployee = getById(id);
        if (editedEmployee != null) {
            for (int i = 0; i < employees.length; i++) {
                Employee currentEmployee = employees[i];
                if (currentEmployee.getId() == id) {
                    employees[i] = employee;
                    break;
                }
            }
        }
        return editedEmployee;
    }

    Employee remove (int id) {
        int indexToRemove = -1;
        for (int i = 0; i < employees.length; i++) {
            Employee currentEmployee = employees[i];
            if (currentEmployee.getId() == id) {
                indexToRemove = i;
                break;
            }
        }

        if (indexToRemove == -1) {
            return null;
        }

        Employee[] newEmployeesArray = new Employee[employees.length - 1];
        int newArrayCounter = 0;
        for (int i = 0; i < employees.length; i++) {
            if (i != indexToRemove) {
                newEmployeesArray[newArrayCounter] = employees[i];
                newArrayCounter++;
            }
        }
        Employee removedEmployee = employees[indexToRemove];
        employees = newEmployeesArray;
        return removedEmployee;
    }
}
