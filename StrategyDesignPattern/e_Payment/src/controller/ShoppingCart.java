package controller;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> productList;

        public ShoppingCart(){
            this.productList=new ArrayList<>();
        }

        public  void addProduct(Product product){
            productList.add(product);
        }
        public  void removeProduct(Product product){
            productList.remove(product);
        }

        public double calculateTotal(){
            double sum=0.0;
            for(Product product:productList){
                sum=sum+product.getPrice();
            }

            return sum;
        }

        public void pay(Payment paymentStrategy){
            double amount=calculateTotal();
            paymentStrategy.pay(amount);

        }

}
