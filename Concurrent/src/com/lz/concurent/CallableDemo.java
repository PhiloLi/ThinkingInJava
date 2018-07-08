package com.lz.concurent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/**
 * time:2018-07-01
 * 示例：从任务中产生返回的值。
 * 方法：实现Callable接口，并实现call（）方法。并且使用Executor.submit()方法调用它。
 * submit方法会产生一个Future对象。
 * 
 * */

public class CallableDemo {
   public static void main(String[] args) {
	ExecutorService exec = Executors.newCachedThreadPool();
	List<Future<String>> results = new ArrayList();
	for(int i = 0; i < 10; i ++)
	{
		results.add(exec.submit(new TaskWithResult(i)));
	}
	
	for(Future<String> rs : results)
	{
		try {
			System.out.println(rs.get());
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			exec.shutdown();
		}
	}
}
}
class TaskWithResult implements Callable<String>{
    private int id;
    public TaskWithResult(int id) {
    	this.id = id;
    }
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "result of TaskWithResult " + id;
	}
	
}
