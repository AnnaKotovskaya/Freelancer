package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.Provider;
import java.util.ServiceLoader;

import static org.junit.jupiter.api.Assertions.*;

class FreelanserServiceTest {

    @Test
    public void calculateMounthRest1() {
        FreelanserService service = new FreelanserService();

        int actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void calculateMounthRest2() {
        FreelanserService service = new FreelanserService();

        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }
}