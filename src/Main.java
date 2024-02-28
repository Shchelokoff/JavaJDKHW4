import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();
        directory.addEmployee(1, "+1234567890", "Иванов", 5);
        directory.addEmployee(2, "88005553535", "Петров", 3);
        directory.addEmployee(3, "+7", "Сидоров", 1);

        List<EmployeeDirectory.Employee> employeesWithExperience5 = directory.findEmployeesByExperience(1);
        for (EmployeeDirectory.Employee employee : employeesWithExperience5) {
            System.out.println("Сотрудники со стажем 1 год: " + employee.getName());
        }

        String phoneNumber = directory.findPhoneNumberByName("Петров");
        System.out.println("Номер телефона Петрова: " + phoneNumber);

        EmployeeDirectory.Employee employee = directory.findEmployeeByEmployeeId(1);
        if (employee != null) {
            System.out.println("Сотрудник с табельным номером 1 найден: " + employee.getName());
        } else {
            System.out.println("Сотрудник с табельным номером 1 не найден.");
        }
    }
}