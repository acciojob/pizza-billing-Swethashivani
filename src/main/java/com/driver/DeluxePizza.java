package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(boolean isVeg) {
        super(isVeg);

        // your code goes here
        addExtraCheese();
        addExtraToppings();
    }
}
