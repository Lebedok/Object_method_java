package Objects;

public class BankTest {
    public static void main(String[] args) {
        BankAccount techtorial = new BankAccount();
        techtorial.signUp("Techtorial", "12345", 1000, "techtorial", "tech123");
        techtorial.display();
        techtorial.deposit(100);
        techtorial.withdraw(20);
        System.out.println(techtorial.balance);
        System.out.println(techtorial.bankName);
        System.out.println(techtorial.isLogined);
        techtorial.login("techtorial", "tech123");
        System.out.println(techtorial.isLogined);
        techtorial.display();


    }
}
