package com.fuse.app;

public class App 
{
  public static int nickelsInserted = 0;
  public static int dimesInserted = 0;
  public static int quartersInserted = 0;

  public static void insertCoin (String coinType) {
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

  public static void main (String[] args)
  {
    System.out.println("something goes here eventually");
  }
}