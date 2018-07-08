package com.lz.concurent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i = 0; i < 5; i ++)
		{
			exec.submit(new LiftOff());
		}
		exec.shutdown();
	}
}
/**
 * 1）CachedThreadPool的特点：为每一个任务创建一个线程。
 * 2）shutdown方法的作用：在调用shutdown方法后，新的任务不会再被提交给执行器，执行器会继续指向已提交的任务。
 * 
 * */
 