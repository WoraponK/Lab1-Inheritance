public class theEmployee {
    public static void main(String[] args) {
        Manager m1 = new Manager("John Doe", 40, 123, 50000, "IT");
        m1.ShowDetails();
        m1.work();
        m1.CallMeeting();

        Programmer p1 = new Programmer("Jane Smith", 30, 456, 40000, "Java");
        p1.ShowDetails();
        p1.work();
        p1.coding();

        Security s1 = new Security("Adam Jones", 45, 789, 18000, "Night");
        s1.ShowDetails();
        s1.work();
        s1.Patrol();
    }
}

class Employee {

    String emName;
    Integer emAge, emID, emSalary;
    
    Employee(String name, int age, int id, int salary) {
        emName = name;
        emAge = age;
        emID = id;
        emSalary = salary;
    }

    public void ShowDetails() {
        float salaryF = emSalary;
        System.out.println("******************************************");
        System.out.println("Name: " + emName);
        System.out.println("Age: " + emAge);
        System.out.println("Employee ID: " + emID); 
        System.out.printf("Salary: %.1f%n", salaryF);
    }

    public void work() {
        System.out.println(emName + " is working");
    }

}



//------------- PROGRAMMER START -------------
class Programmer extends Employee {
    String emLanguage;

    Programmer(String name, int age, int id, int salary, String language) {
        super(name, age, id, salary);
        emLanguage = language;
    }

    public void ShowDetails() {
        super.ShowDetails();
        System.out.println("Language: " + emLanguage);
    }

    public void coding() {
        System.out.println(emName + " is coding");
    }
}
//------------- PROGRAMMER END -------------



//------------- MANAGER START
class Manager extends Employee {
    String emDepartment;

    Manager(String name, int age, int id, int salary, String department) {
        super(name, age, id, salary);
        emDepartment = department;
    }

    public void ShowDetails() {
        super.ShowDetails();
        System.out.println("Department: " + emDepartment);
    }

    public void CallMeeting() {
        System.out.println(emName + " is scheduling a meeting");
    }
}
//------------- MANAGER END -------------



//------------- SECURITY START -------------
class Security extends Employee {
    String emShift;

    Security(String name, int age, int id, int salary, String shift) {
        super(name, age, id, salary);
        emShift = shift;
    }

    public void ShowDetails() {
        super.ShowDetails();
        System.out.println("Avaliable at " + emShift + " Shift");
    }

    public void Patrol() {
        System.out.println(emName + " is patrolling");
    }
}
//------------- SECURITY END -------------
