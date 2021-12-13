package ru.mirea.task30;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class OperationsTest {

    @Test
    public void sum() {
        Number number = new Number(35, 6);
        int expected = Number.sum();
        int actual = 35+6;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void diff() {
        Number number = new Number(35, 6);
        int expected = Number.diff();
        int actual = 6-35;
        Assert.assertEquals(expected, actual);
    }


}