package com.fuse.app;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void insertCoin_nickel_oneNickel() {
      int expectedNickelCount = 1;

      App.insertCoin("nickel");
  
      Assert.assertEquals(expectedNickelCount, App.nickelsInserted);
    }    
}