package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheezePrice;
    private int toppingsprice;
    private int takeAwayPrice;
    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenereated;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheezePrice=80;
        this.takeAwayPrice=20;

        // your code goes here
        if(isVeg == true){
            this.price=300;
            this.toppingsprice=70;
        }
        else{
            this.price=400;
            this.toppingsprice=120;
        }
        this.isCheeseAdded=false;
        this.isTakeAwayAdded=false;
        this.isToppingsAdded=false;
        this.isBillGenereated=false;
        this.bill=  "Base Price Of The Pizza: " + this.price + "\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            this.price=this.price+this.cheezePrice;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingsAdded==false){
            this.price=this.price+this.toppingsprice;
            isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded==false){
            this.price=this.price+this.takeAwayPrice;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
if(isBillGenereated==false){

    if(isCheeseAdded==true)
        this.bill = this.bill + "Extra Cheese Added: " + this.cheezePrice + "\n";
    if(isToppingsAdded==true)
        this.bill= this.bill + "Extra Toppings Added: " + this.toppingsprice + "\n";
    if(isTakeAwayAdded==true)
        this.bill= this.bill + "Paperbag Added: " + this.takeAwayPrice + "\n";
    this.bill= this.bill + "Total Price: " + this.price + "\n";
    isBillGenereated=true;
}

        return this.bill;
    }
}
