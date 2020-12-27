package Objects;

public class BankAccount {

    /*
    Create one class is called BankAccount with given variables
personName, bankName, accountNumber, balance, username, password, isLogined
1- Create one method to display all this information
2- Create one method called deposit. This method will take one param and update the balance according to given number.
3- Create one method called withdraw and this method will take one param and update the balance according to the withdraw amount.
4- Create one method called login and will take username and password, if the username and password is correct then it will update the isLogined variable.
Collapse

     */

    String personName;
    String bankName = "Bank of America";
    String accountNumber;
    double balance;
    String username;
    String password;
   boolean isLogined;

    public void display(){
        if (isLogined){
            System.out.println("Name: "+ personName);
            System.out.println("Bank: "+ bankName);
            System.out.println("Account Number: "+ accountNumber);
            System.out.println("Balance: "+ balance);
        }
        else{
            System.out.println("Please login first");
        }

    }

    public double deposit(double depositAmount){
        if (isLogined){
            balance += depositAmount;
            System.out.println(balance);

        }else {
            System.out.println("Please login first");
        }
        return balance;

    }

    public double withdraw(double withdrawAmount){
        if (isLogined){
            balance -= withdrawAmount;
            System.out.println(balance);
        }else {
            System.out.println("Please login first");
        }

        return balance;

    }
    // if the parameter and instance variable has the same name we can use
    // this keyword to call instance variable
    public void login (String username, String password){
        if (this.username.equals(username) && this.password.equals(password)){
            isLogined = true;
        }
    }

    public void signUp(String personName, String accountName, double balance, String username, String password){

        this.personName = personName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.username = username;
        this.password = password;

    }

    public void getInstructions (){
        System.out.println("Please enter 0 to Sign Up");
        System.out.println("Please enter 1 to Login");
        System.out.println("Please enter 2 to Deposit");
        System.out.println("Please enter 3 to Withdraw");
        System.out.println("Please enter 4 to Display account Information");
        System.out.println("Please enter 5 to Display the Instructions");
        System.out.println("Please enter 6 to close Application");
    }


}
