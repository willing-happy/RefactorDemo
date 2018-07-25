package extractclass;

public class Person {
    private String name;
    private String officeAreaCode;
    private String officeNumber;
    private TelephoneNumber telephoneNumber = new TelephoneNumber();

    public String getName() {
        return name;
    }

    public String getOfficeAreaCode() {
        return officeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getTelePhoneNumber(){
        return "(" + officeAreaCode + " )" + officeNumber;
    }
}
