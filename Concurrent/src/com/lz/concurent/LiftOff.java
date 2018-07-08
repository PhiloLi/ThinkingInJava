package com.lz.concurent;

public class LiftOff implements Runnable{
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount ++;
    public LiftOff() {}
    public LiftOff(int count)
    {
    	this.countDown = count;
    }
    public String status()
    {
    	return "#" + id + "(" + (countDown > 0 ? countDown: "liftoff!") + ").";
    }
    public void run()
    {
    	while(countDown -- > 0)
    	{
    		System.out.println(status());
    		Thread.yield();
    	}
    }
}
