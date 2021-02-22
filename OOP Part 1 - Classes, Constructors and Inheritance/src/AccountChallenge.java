public class AccountChallenge {
    public static void main(String[] args) {
        Account bobsAccount = new Account();
        bobsAccount.deposit(50);
        bobsAccount.withdraw(100);
        bobsAccount.deposit(51);
        bobsAccount.withdraw(100);

    }

    public static class Account {
        private String number;
        private double balance;
        private String customerName;
        private String customerEmailAddress;
        private String customerPhoneNumber;

        public void deposit(double depositAmount) {
            this.balance += depositAmount;
            System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.balance);
        }

        public void withdraw(double withdrawAmount) {
            if (withdrawAmount > this.balance) {
                System.out.println("Only " + this.balance + " available. Withdraw not processed.");
            } else {
                this.balance -= withdrawAmount;
                System.out.println("Withdraw of " + withdrawAmount + " processed. Remaining balance " + this.balance);
            }
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getCustomerEmailAddress() {
            return customerEmailAddress;
        }

        public void setCustomerEmailAddress(String customerEmailAddress) {
            this.customerEmailAddress = customerEmailAddress;
        }

        public String getCustomerPhoneNumber() {
            return customerPhoneNumber;
        }

        public void setCustomerPhoneNumber(String customerPhoneNumber) {
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
