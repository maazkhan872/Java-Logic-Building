package Java_Coding_Working;

public class Access_Modifier {

    public String accountHolder = "Maaz";

    protected double balance = 50000;

    String bankName = "HBL"; // default

    private int pin = 1234;

    public void showPublic() {
        System.out.println(accountHolder);
    }

    protected void showProtected() {
        System.out.println(balance);
    }

    void showDefault() {
        System.out.println(bankName);
    }

    private void showPrivate() {
        System.out.println(pin);
    }


public static void main(String args[]) {

	Access_Modifier b = new Access_Modifier();

    System.out.println(b.accountHolder);

    System.out.println(b.balance);

    System.out.println(b.bankName);
    
    b.showPublic();

    // System.out.println(b.pin); ERROR (private)

}
}


class Student {

    public String name = "Maaz";        // accessible everywhere

    protected String course = "BSCS";  // same package + subclass

    String institute = "NED University"; // default (same package only)

    private int fee = 50000;           // only inside this class

    public void showFee() {

        System.out.println("Fee is " + fee);

    }


    public static void main(String args[]) {

        Student s = new Student();

        System.out.println(s.name);       // ✅ public

        System.out.println(s.course);     // ✅ protected

        System.out.println(s.institute);  // ✅ default

        // System.out.println(s.fee);     ❌ private not allowed

        s.showFee();                     // ✅ access via public method

    }

}