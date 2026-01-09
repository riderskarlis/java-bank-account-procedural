class Account {
    double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            System.out.println("\nSummai jābūt pozitīvai");
        } else {
            this.balance += sum;
        }
    }

    public void withdraw(double sum) {
        if (sum < 0) {
            System.out.println("\nSummai jābūt pozitīvai");
        } else if (sum > balance) {
            System.out.println("\nNepietiekami līdzekļi");
        } else {
            balance -= sum;
        }
    }

    public void balance() {
        return this.balance;
    }
}