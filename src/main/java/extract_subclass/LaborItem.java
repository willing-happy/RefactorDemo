package extract_subclass;

public class LaborItem extends JobItem {

    protected Employee employee;

    public LaborItem(int quantity, Employee employee) {
        super(0, quantity);
        this.employee = employee;
    }
    public Employee getEmployee() {
        return employee;
    }

    public int getUnitPrice() {
        return employee.getRate();
    }
}
