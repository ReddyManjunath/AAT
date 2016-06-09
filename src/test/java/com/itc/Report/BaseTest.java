package com.itc.Report;

import org.testng.ITest;

public abstract class BaseTest implements ITest
{
    private String testName;

    public String getTestName()
    {
        return this.testName;
    }

    public void setTestName( String tn )
    {
        this.testName = tn;
    }

    public void randomWait() {
        try {
            Thread.sleep((long)(Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
