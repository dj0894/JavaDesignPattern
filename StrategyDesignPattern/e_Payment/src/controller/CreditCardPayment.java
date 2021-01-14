package controller;

public class CreditCardPayment implements Payment  {

    private String name;
    private String cardNUmber;

    public CreditCardPayment(String name, String cardNUmber) {
        this.name = name;
        this.cardNUmber = cardNUmber;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount+" payed with CreditCard");
    }
}
