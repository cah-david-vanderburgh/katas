package com.fuse.app;

public class VendingMachine {
  private int nickelsInserted = 0;
  private int dimesInserted = 0;
  private int quartersInserted = 0;

  public void insertCoin(String coinType) {
    switch (coinType) {
      case "nickel":
        nickelsInserted++;
        break;
      case "dime":
        dimesInserted++;
        break;
      case "quarter":
        quartersInserted++;
        break;
    }
  }

  public int getNickelsInserted() {
    return nickelsInserted;
  }

  public int getDimesInserted() {
    return dimesInserted;
  }

  public int getQuartersInserted() {
    return quartersInserted;
  }

  public static void main(String[] args) {
    System.out.println("something goes here eventually");
  }
}