package org.example;

public abstract class Pet {
    public float price = 0;

    public Pet(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pet price = " + price + "; ";
    }
}
