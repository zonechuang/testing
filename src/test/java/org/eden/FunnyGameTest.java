package org.eden;

import org.junit.Assert;
import org.junit.Test;

public class FunnyGameTest {

    @Test
    public void testRightShoutViaMod() {
        int position = 1;
        String result = FunnyGame.shoutViaMod(position);
        Assert.assertEquals("wrong logic for the number: " + position, "1", result);

        position = 3;
        result = FunnyGame.shoutViaMod(position);
        Assert.assertEquals("wrong logic for the number: " + position, "Fizz", result);

        position = 5;
        result = FunnyGame.shoutViaMod(position);
        Assert.assertEquals("wrong logic for the number: " + position, "Buzz", result);

        position = 15;
        result = FunnyGame.shoutViaMod(position);
        Assert.assertEquals("wrong logic for the number: " + position, "FizzBuzz", result);
    }

    @Test
    public void testWrongShoutViaMod() {
        int position = 3;
        String result = FunnyGame.shoutViaMod(position);
        Assert.assertNotEquals("wrong logic for the number: " + position, "3", result);

        position = 5;
        result = FunnyGame.shoutViaMod(position);
        Assert.assertNotEquals("wrong logic for the number: " + position, "5", result);

        position = 15;
        result = FunnyGame.shoutViaMod(position);
        Assert.assertNotEquals("wrong logic for the number: " + position, "15", result);

    }

    @Test
    public void testRightShoutViaModOrContains() {
        int position = 31;
        String result = FunnyGame.shoutViaModOrContains(position);
        Assert.assertEquals("wrong logic for the number: " + position, "fizz", result);

        position = 59;
        result = FunnyGame.shoutViaModOrContains(position);
        Assert.assertEquals("wrong logic for the number: " + position, "buzz", result);
    }

    @Test
    public void testWrongShoutViaModOrContains() {
        int position = 37;
        String result = FunnyGame.shoutViaModOrContains(position);
        Assert.assertNotEquals("wrong logic for the number: " + position, "buzz", result);

        position = 57;
        result = FunnyGame.shoutViaModOrContains(position);
        Assert.assertNotEquals("wrong logic for the number: " + position, "57", result);
    }
}