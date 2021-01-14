import controller.CreditCardPayment;
import controller.Payment;
import controller.PaypalPayment;
import controller.ShoppingCart;
import model.Product;

public class Main {

    public  static  void main(String args[]){
        ShoppingCart shoppingCart=new ShoppingCart();
        Product book=new Product("Bk123",340.50);
        Product phone=new Product("ph978",10000);
        Product chair=new Product("ch908",200);
        shoppingCart.addProduct(book);
        shoppingCart.addProduct(phone);
        shoppingCart.addProduct(chair);
        shoppingCart.removeProduct(phone);
        shoppingCart.calculateTotal();
        shoppingCart.pay(new CreditCardPayment("Deepika","1234567"));
        shoppingCart.pay(new PaypalPayment("deepu0894","abc1234"));

    }
}
