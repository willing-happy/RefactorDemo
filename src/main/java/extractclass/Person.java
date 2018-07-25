package extractclass;

public class Person {
    private String name;
    private TelephoneNumber telephoneNumber = new TelephoneNumber();

    public String getName() {
        return name;
    }

    public String getTelePhoneNumber(){
        return telephoneNumber.getTelePhoneNumber();
    }
}
