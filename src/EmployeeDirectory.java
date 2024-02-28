import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeDirectory {
    private Map<Integer, Employee> employees = new HashMap<>();
    public class Employee {
        private int employeeId;
        private String phoneNumber;
        private String name;
        private int experience;
        public Employee(int employeeId, String phoneNumber, String name, int experience) {
            this.employeeId = employeeId;
            this.phoneNumber = phoneNumber;
            this.name = name;
            this.experience = experience;
        }
        public int getEmployeeId() {
            return employeeId;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }
        public String getName() {
            return name;
        }
        public int getExperience() {
            return experience;
        }
    }
    public void addEmployee(int employeeId, String phoneNumber, String name, int experience) {
        Employee newEmployee = new Employee(employeeId, phoneNumber, name, experience);
        employees.put(employeeId, newEmployee);
    }
    public List<Employee> findEmployeesByExperience(int targetExperience) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees.values()) {
            if (employee.getExperience() == targetExperience) {
                result.add(employee);
            }
        }
        return result;
    }
    public String findPhoneNumberByName(String targetName) {
        for (Employee employee : employees.values()) {
            if (employee.getName().equals(targetName)) {
                return employee.getPhoneNumber();
            }
        }
        return "Сотрудник с именем " + targetName + " не найден.";
    }
    public Employee findEmployeeByEmployeeId(int employeeId) {
        return employees.get(employeeId);
    }
}