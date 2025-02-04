package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingsPrice;
    private int takeAwayPrice;
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isTakeAwayAdded;
    private boolean isBillGenerated;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        this.cheesePrice = 80;
        this.takeAwayPrice = 20;

        // Initialize price and toppings price based on type of pizza
        if (isVeg) {
            this.price = 300;
            this.toppingsPrice = 70;
        } else {
            this.price = 400;
            this.toppingsPrice = 120;
        }

        this.isCheeseAdded = false;
        this.isTakeAwayAdded = false;
        this.isToppingsAdded = false;
        this.isBillGenerated = false;

        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        // Add cheese price only if it has not been added already
        if (!isCheeseAdded) {
            this.price += this.cheesePrice;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        // Add toppings price only if they have not been added already
        if (!isToppingsAdded) {
            this.price += this.toppingsPrice;
            isToppingsAdded = true;
        }
    }

    public void addTakeaway() {
        // Add takeaway price only if it has not been added already
        if (!isTakeAwayAdded) {
            this.price += this.takeAwayPrice;
            isTakeAwayAdded = true;
        }
    }

    public String getBill() {
        // Generate bill only once
        if (!isBillGenerated) {
            if (isCheeseAdded) {
                this.bill += "Extra Cheese Added: " + this.cheesePrice + "\n";
            }
            if (isToppingsAdded) {
                this.bill += "Extra Toppings Added: " + this.toppingsPrice + "\n";
            }
            if (isTakeAwayAdded) {
                this.bill += "Paperbag Added: " + this.takeAwayPrice + "\n";
            }
            this.bill += "Total Price: " + this.price + "\n";
            isBillGenerated = true;
        }

        return this.bill;
    }
}