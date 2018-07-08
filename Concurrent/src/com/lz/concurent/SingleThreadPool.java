package com.lz.concurent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadPool {
   public static void main(String[] args) {
	ExecutorService exec = Executors.newSingleThreadExecutor();
	for(int i = 0; i < 5; i ++)
	{
		exec.execute(new LiftOff());
	}
	exec.shutdown();
}
}
 /**
  * SingleThreadPool:线程数为1的FixedThreadPool
  * singleThreadPool的优势：如果向singleThreadPool中提交多个任务，那么这些任务将排队，每个任务都会在下一个
  * 任务开始之前结束，所有的任务将使用相同的线程。
  * 
  * */

