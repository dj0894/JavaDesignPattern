package model;

public class Product {
    private int productId;
    private String productName;
    private String upcCode;
    private double price;


    public Product(String upcCode, double price){
        this.upcCode=upcCode;
        this.price=price;
    }
    public Product(int productId, String productName, String upcCode,double price){
        this.productId=productId;
        this.productName=productName;
        this.upcCode=upcCode;
        this.price=price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
