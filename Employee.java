public class Employee {
    int id;
    String name;
    int age;
    double salary;
    boolean gender;
    int fixedBugs;
    double defaultBugRate;



    Employee (int id, String name, int age, double salary, boolean gender, int fixedBugs,double defaultBugRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.gender = gender;
        this.fixedBugs = fixedBugs;
        this.defaultBugRate = defaultBugRate;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId (int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary (double salary) {
        this.salary = salary;
    }

    public boolean getGender () {
        return gender;
    }

    public void setGender (boolean gender) {
        this.gender = gender;
    }

    public int getFixedBugs () {
        return fixedBugs;
    }

    public void setFixedBugs (int fixedBugs) {
        this.fixedBugs = fixedBugs;
    }

    public double getDefaultBugRate () {
        return defaultBugRate;
    }

    public void setDefaultBugRate (double defaultBugRate) {
        this.defaultBugRate = defaultBugRate;
    }

    public int getBonus() {
        int bonus;
        bonus = (int) (salary/10 * fixedBugs * defaultBugRate);
        return bonus;
    }

    public String toString() {
        String info = "This is the employee! " +
        " id " + id +
        ", name " + name +
        ", age " + age +
        ", salary " + salary +
        ", gender " + gender +
        ", fixedBugs " + fixedBugs +
        ", defaultBugRate " + defaultBugRate;
        return info;
    }

}
