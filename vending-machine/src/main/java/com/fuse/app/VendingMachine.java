package com.fuse.app;

public class VendingMachine {
    private int numberOfNickels = 0;
    private int numberOfDimes = 0;
    private int numberOfQuarters = 0;

    public int getNumberOfNickels() {
        return this.numberOfNickels;
    }

    public int getNumberOfDimes() {
        return this.numberOfDimes;
    }

    public int getNumberOfQuarters() {
        return this.numberOfQuarters;
    }

    public void insertCoin(String coinType) {
        if (coinType.equals("nickel")) {
            numberOfNickels++;
        } 
    }
    
    static void Main(String[] args)
    {
      System.out.println("something goes here eventually");
    }
}