package com.example;

import junit.framework.TestCase;

public class ProjectTest extends TestCase {

    public Actionwords actionwords = new Actionwords();

    public void testAverage() {
        // Then should return the average
        actionwords.shouldReturnTheAverage();
    }

    public void testMaximum() {
        // Then should return the maximum number
        actionwords.shouldReturnTheMaximumNumber();
    }

    public void testMinimum() {
        // Then should return the minimum number
        actionwords.shouldReturnTheMinimumNumber();
    }
}