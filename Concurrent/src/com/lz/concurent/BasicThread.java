package com.lz.concurent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BasicThread {
    public static void main(String[] argv)
    {
//    	for(int i = 0; i < 5; i ++)
//    	{
//    		new Thread(new LiftOff()).start();
//        
//    	}
//    	Thread thread = new Thread(new LiftOff());
//    	thread.start();
//    	System.out.println("wait for LiffOff");
    	ExecutorService exec = Executors.newCachedThreadPool();
    	for(int i = 0; i < 5; i ++)
    	{
    		exec.execute(new LiftOff());
    	}
    	exec.shutdown();
    }
}
