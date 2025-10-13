package factory.simple_factory;


class BankTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing bank transfer of $" + amount);
    }
}
