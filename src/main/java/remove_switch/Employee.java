package remove_switch;

public class Employee {
    private EmployeeType type;
    private int monthlySalary;
    private int commission;
    private int bonus;

    public Employee(EmployeeType employeeType){
        type = employeeType;
    }

    int payAmount() {
        return this.type.payAmount(this);
    }

    public void setMonthlySalary(int monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getCommission() {
        return commission;
    }

    public int getBonus() {
        return bonus;
    }
}
