package com.gzy.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Title:TreadPoolTest
 * @Description:
 * @Create_by:guozy
 * @Create_date:2015年8月22日
 * @Last_Edit_By:
 * @Edit_Description:
 * @version:javaEveryday 1.0
 */
public class TreadPoolTest {

	public static void main(String[] args) {
		// cachedTreadPool
		ExecutorService executor = Executors.newCachedThreadPool();
		
		executor.execute(new Runnable() {
			@Override
			public void run() {
				System.out.print("thread in cach thread pool run");
			}
		});
		
		// fixedthreadpool
		ExecutorService fixedExecutor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 10);
		fixedExecutor.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("thread in fix thread pool run");
			}
		});
		
		// singlethreadpool
		ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
		singleExecutor.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("thread in single thread pool run");
			}
		});
		
		// scheduledthreadpool
		ExecutorService scheduledExecutor = Executors.newScheduledThreadPool(10);
		scheduledExecutor.execute(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("thread in scheduled pool run");
			}
		});
	}

	
}
