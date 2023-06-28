public class Account {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private int contactNumber;

    public void depositFund(double depositAmount){
        accountBalance = accountBalance + depositAmount;
        System.out.println("You have deposited " + depositAmount + " rupees. Your current balance is " + accountBalance + " rupees");
    }

    public void withdrawFund(double withdrawalAmount){
        if (accountBalance - withdrawalAmount < 0){
            System.out.println("We cannot process this withdrawal. You have only " + accountBalance + " rupees in your account.");
        }
        else {
            accountBalance = accountBalance - withdrawalAmount;
            System.out.println("You have withdrawn " + withdrawalAmount + " rupees from your account. Your current balance is " + accountBalance + " rupees");
        }
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }
    
}
