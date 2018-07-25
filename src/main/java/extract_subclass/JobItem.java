package extract_subclass;

public class JobItem {
    private int unitPrice;
    private int quantity;
    private Employee employee;
    private boolean isLabor;

    public JobItem(int unitPrice, int quantity, Employee employee, boolean isLabor) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.employee = employee;
        this.isLabor = isLabor;
    }

    public int getTotalPrice(){
        return getUnitPrice() * quantity;
    }

    private int getUnitPrice() {
        return isLabor ? employee.getRate() : unitPrice;
    }

    public Employee getEmployee() {
        return employee;
    }
}
