package controller;

public class PaypalPayment implements Payment {
    String username;
    String password;

    public PaypalPayment(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public void pay(double amount) {

        System.out.println(amount+" payed with payPal");

    }
}
