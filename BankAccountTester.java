package Week6;

public class BankAccountTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the Bank Account Tester");
        // Create a new BankAccount object
        // ClassName NAME = new ClassName(ARGUMENTS);
        BankAccount account1 = new BankAccount("BobBankAccount", 100);
        System.out.println(account1);
        System.out.println("Cammesa");
        // System.out.println(x: account1.new BobBankAccount();
        System.out.println(account1.getBalance());
        // BankAccount blankAccount = new BankAccount(BobBankAccount);
        // System.out.println(blankAccount.getName());
        BankAccount.setName("Cammesa");
        // System.out.println(blankAccount.getName());
    }

}
