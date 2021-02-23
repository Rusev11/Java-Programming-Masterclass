public class VipCustomerChallenge {
    public static void main(String[] args) {
        String name = "Pesho";
        double limit = 100;
        String email = "pesho@gmail.com";

        VipCustomer firstCustomer = new VipCustomer("ivan",200);
        System.out.println(firstCustomer.getName());
        VipCustomer secondCustomer = new VipCustomer("gosho",300, "random@email.com");
        System.out.println(secondCustomer.getName());
        VipCustomer thirdCustomer = new VipCustomer();
        System.out.println(thirdCustomer.getName());
    }

    public static class VipCustomer {
        private String name;
        private double creditLimit;
        private String email;

        public VipCustomer() {
            this("default name", 50000, "default email");
        }

        public VipCustomer(String name, double creditLimit) {
            this(name, creditLimit, "unknown@email.com");
        }

        public VipCustomer(String name, double creditLimit, String email) {
            this.name = name;
            this.creditLimit = creditLimit;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public double getCreditLimit() {
            return creditLimit;
        }

        public String getEmail() {
            return email;
        }
    }
}
