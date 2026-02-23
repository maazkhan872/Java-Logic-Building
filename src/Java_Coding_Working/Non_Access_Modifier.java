package Java_Coding_Working;


// static Modifier
public class Non_Access_Modifier {

	public static String institute_name = "ABC Institute";
	

public static void main(String args[]) {
	Non_Access_Modifier nn = new Non_Access_Modifier();
	
	System.out.println(nn.institute_name);

    System.out.println(nn.institute_name);
	
}
}

class Non_Access_Modifier {

    final double MIN_BALANCE = 500;   // final variable

    final void showMinBalance() {     // final method

        System.out.println("Minimum Balance is " + MIN_BALANCE);

    }

}

class Customer extends Non_Access_Modifier{

    // ERROR if you try to override final method
    /*
    void showMinBalance() {
        System.out.println("Changed");
    }
    */

}

    public static void main(String[] args) {

        Customer c = new Customer();

        c.showMinBalance();

        // ERROR if change final variable
        // c.MIN_BALANCE = 1000;

    }

}

abstract class Animal {

    // abstract method
    abstract void sound();

    // normal method
    void sleep() {

        System.out.println("Animal is sleeping");

    }

}

class Cat extends Animal {

    void sound() {

        System.out.println("Cat says Meow");

    }

}

class Dog extends Animal {

    void sound() {

        System.out.println("Dog says Bark");

    }

}

public class AbstractExample {

    public static void main(String[] args) {

        Cat c = new Cat();

        Dog d = new Dog();

        c.sound();

        c.sleep();

        d.sound();

        d.sleep();

    }

}