package ru.netology.service;

//import org.junit.Test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {
    CashbackHackService cashback = new CashbackHackService();

    @Test
    public void shouldAmountEqual1000() {
        int amount = 1000;

        int expected = 0;
        int actual = cashback.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountAbove1000() {
        int amount = 1200;

        int expected = 800;
        int actual = cashback.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountBelow1000() {
        int amount = 800;

        int expected = 200;
        int actual = cashback.remain(amount);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldAmountEqual1000Junit5() {
        int amount = 1000;

        int expected = 0;
        int actual = cashback.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountAbove1000Junit5() {
        int amount = 1200;

        int expected = 800;
        int actual = cashback.remain(amount);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void shouldAmountBelow1000Junit5() {
        int amount = 800;

        int expected = 200;
        int actual = cashback.remain(amount);

        Assert.assertEquals(expected, actual);
    }
}
