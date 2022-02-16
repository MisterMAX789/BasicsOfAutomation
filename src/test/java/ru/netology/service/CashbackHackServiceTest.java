package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();


    @Test
    public void shouldUseInLimit() {
        int amount = 910;
        int actual = service.remain(amount);
        int expected = 90;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldUseOverLimit() {
        int amount = 1900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldUseLimit() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }
}