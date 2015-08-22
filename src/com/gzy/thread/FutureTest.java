package com.gzy.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * 
 * Title:FutureTest
 * @Description:
 * @Create_by:guozy
 * @Create_date:2015年8月22日
 * @Last_Edit_By:
 * @Edit_Description:
 * @version:javaEveryday 1.0
 */
public class FutureTest {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newSingleThreadScheduledExecutor();
		FutureTask<String> future = new FutureTask<String>(new Callable<String>() {

			@Override
			public String call() throws Exception {
				Thread.sleep(4000);
				return "future execute";
			}
			
		});
		executor.execute(future);
		try{
			
			String result = future.get(3, TimeUnit.SECONDS);
			System.out.println(result);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
