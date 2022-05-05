package com.company.pointofsale;

public class IceCream {
    private String flavor;
    private double price;
    private int quantity;

    public IceCream(String flavor, double price, int quantity) {
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


//    Methods
    public int MakeASale(int a) {
        int newQuantity = this.quantity - a;
        setQuantity(newQuantity);
        return quantity;
    }

    public void increasePriceByDemand() {
        if (this.quantity < 20) {
            double newPrice = this.price + 2;
            setPrice(newPrice);
        }
    }

}
