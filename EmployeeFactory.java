import java.util.Random;

public class EmployeeFactory {

    Employee[]  getRandomEmployees(int size) {
        Random random = new Random();
        Employee[] randomEmployees = new Employee[size];
        String[] maleNames = {"Stas", "Vlad", "Eugene", "Viktor", "Michael"};
        String[] femaleNames = {"Anna", "Dasha", "Polina", "Miroslava", "Victoria"};

        for (int i = 0; i < size; i++) {
            boolean gender = random.nextBoolean();
            String name = (gender) ? maleNames[random.nextInt(maleNames.length)] : femaleNames[random.nextInt(femaleNames.length)];
            int id = i + 1;
            int age = random.nextInt(40) + 20;
            double salary = random.nextDouble() * 1000 + 1000;
            int fixedBugs = random.nextInt(10);
            double defaultBugRate = random.nextDouble();
            Employee employee = new Employee(id, name, age, salary, gender, fixedBugs, defaultBugRate);
            randomEmployees[i] = employee;
        }
        return randomEmployees;
    }


}
