package remove_switch;

public class Engineer extends EmployeeType {
    int getTypeCode() {
        return 0;
    }

    int payAmount(Employee employee) {
        return employee.getMonthlySalary();
    }
}
