package com.lz.concurent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(1);
		for(int i = 0; i < 5; i ++)
		{
			exec.execute(new LiftOff());
		}
		exec.shutdown();
		System.out.println("heloooooo");
	}
}
 /**
  *1)FixedThreadPool的特点：为任务创建指定数量的线程。
  *
  * 
  * 
  * */
  