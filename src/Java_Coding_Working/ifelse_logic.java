package Java_Coding_Working;

public class ifelse_logic {
	
	int age;
	double  monthlyincome;
	int creditscore;
	boolean hasloandefault;
	
	public void loanchecker() {
		
		if (age >= 21 && monthlyincome >= 50000 && creditscore >= 700 && !hasloandefault) {
			System.out.println("Load Approaved");
		}
		else {
			System.out.println("Loan Rejected");
		}		
	}
	
	public static void main(String args[]) {
		ifelse_logic f = new  ifelse_logic();
		f.age = 22;
		f.monthlyincome = 60000;
		f.creditscore = 800;
		f.hasloandefault = false;
		
		f.loanchecker();
		
	}
}


class ifelse_logic {

    int age;
    double monthlyIncome;
    int creditScore;
    boolean hasLoanDefault;

    // Constructor
    public ifelse_logic(int age, double monthlyIncome,
                        int creditScore, boolean hasLoanDefault) {

        this.age = age;
        this.monthlyIncome = monthlyIncome;
        this.creditScore = creditScore;
        this.hasLoanDefault = hasLoanDefault;

        // validation logic
        if (age >= 21 && monthlyIncome >= 50000
                && creditScore >= 700
                && !hasLoanDefault) {

            System.out.println("Loan Approved");

        } else {
            System.out.println("Loan Rejected");
        }
    }

    public static void main(String[] args) {
    	ifelse_logic loan = new ifelse_logic(25, 60000, 720, false);
    }
}

 
public class ifelse_logic{
	
	boolean isactive;
	int experienceyears;
	int performance_rating;
	
	public void performance_check() {
		
		if(!isactive) {
		if (experienceyears >= 5) {
			if (performance_rating >= 4) {
				System.out.println("Promotion Approved");
			}
			else {
				System.out.println("Improve Performance");
				}
		}
			else {
				System.out.println("Not Enough Experience");
			}
			}
		else {
			System.out.println("Employee Not Active");
		}
		}
			
	public static void main(String[] args) {

		ifelse_logic emp = new ifelse_logic();

        emp.isactive = true;
        emp.experienceyears = 6;
        emp.performance_rating = 4;

        emp.performance_check();
    }

}

public class ifelse_logic {

    int riskScore = 78;

    public void classifyRisk() {

        if (riskScore >= 90) {
            System.out.println("Very High Risk");

        } else if (riskScore >= 70) {
            System.out.println("High Risk");

        } else if (riskScore >= 50) {
            System.out.println("Medium Risk");

        } else if (riskScore >= 30) {
            System.out.println("Low Risk");

        } else {
            System.out.println("Very Low Risk");
        }
    }

    public static void main(String[] args) {

        firstclass customer = new firstclass();
    //    customer.riskScore = 72;

        customer.classifyRisk();
    }
} 

// Find Largest of 3 Numbers
public class ifelse_logic {

    public static void main(String[] args) {

        int a = 10;
        int b = 25;
        int c = 15;

        if(a > b && a > c) {

            System.out.println("A is largest: " + a);

        }
        else if(b > a && b > c) {

            System.out.println("B is largest: " + b);

        }
        else {

            System.out.println("C is largest: " + c);

        }

    }
}

// Check Number is Even or Odd
public class ifelse_logic {

	    public static void main(String[] args) {

	        int number = 7;

	        if(number % 2 == 0) {

	            System.out.println("Even Number: " + number);

	        }
	        else {

	            System.out.println("Odd Numbe:r " + number);

	        }

	    }

	}

// Check Positive, Negative, Zero
public class ifelse_logic {

    public static void main(String[] args) {

        int num = -5;

        if(num > 0) {

            System.out.println("Given number is Positive: " + num);

        }
        else if(num < 0) {

            System.out.println("Given number is Negative: " + num);

        }
        else {

            System.out.println("Zero");

        }
    }
}



