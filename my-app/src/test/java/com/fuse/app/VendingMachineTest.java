package com.fuse.app;

import org.junit.*;

public class VendingMachineTest {
  private VendingMachine vendingMachine;

  @Before
  public void setup() {
    vendingMachine = new VendingMachine();
  }

  @Test
  public void insertCoin_nickel_oneNickel() {
    int expectedNickelCount = 1;

    vendingMachine.insertCoin("nickel");

    Assert.assertEquals(expectedNickelCount, vendingMachine.getNickelsInserted());
  }    
}