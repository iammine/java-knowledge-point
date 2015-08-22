package com.gzy.test;

/**
 * 
 * Title:ThreadLocalTest
 * @Description:
 * @Create_by:guozy
 * @Create_date:2015年8月22日
 * @Last_Edit_By:
 * @Edit_Description:
 * @version:javaEveryday 1.0
 */
public class ThreadLocalTest {
	private final static ThreadLocal<String> testThread = new ThreadLocal<String>();
	
	public static void main(String[] args){
		try{
			System.out.println("进入执行方法");
			testThread.set("hello,world");
			System.out.println("休眠3秒。。。");
			Thread.sleep(3000);
			System.out.println(testThread.get());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
