package com.fuse.app;

import org.junit.*;

public class VendingMachineTest {
  private VendingMachine vendingMachine;

  @Before
  public void setup() {
    vendingMachine = new VendingMachine();
  }

  @Test
  public void insertNickelTest() {
    int expectedNumberOfCoins = 1;

    vendingMachine.insertCoin("nickel");

    Assert.assertEquals(expectedNumberOfCoins, vendingMachine.getNumberOfNickels());
  }  
  
  public void insertDimeTest() {

  }

  public void insertQuarterTest() {

  }
}