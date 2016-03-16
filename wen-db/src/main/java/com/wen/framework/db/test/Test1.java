package com.wen.framework.db.test;

public class Test1 {
	
	public static void main(String[] args) {
		
		test3();
	}
	
	public static void test1(){
		Entity1 entity1 = new Entity1();
		
		System.out.println(entity1.getNum());
		System.out.println(entity1.getNum());
		System.out.println(entity1.getNum());
		
		Entity2 entity2 = new Entity2();
		
		System.out.println(entity2.getNum());
		System.out.println(entity2.getNum());
		System.out.println(entity2.getNum());
	}
	
	
	public static void test2(){
		Entity1 entity = new Entity1();
		
		ThreadTest1 thread1 = new ThreadTest1(entity);
		ThreadTest1 thread2 = new ThreadTest1(entity);
		ThreadTest1 thread3 = new ThreadTest1(entity);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
	
	public static void test3(){
		Entity2 entity = new Entity2();
		
		ThreadTest2 thread1 = new ThreadTest2(entity);
		ThreadTest2 thread2 = new ThreadTest2(entity);
		ThreadTest2 thread3 = new ThreadTest2(entity);
		
		thread1.start();
		thread2.start();
		thread3.start();
	}
}

class Entity1{
	private int num;
	

	public Integer getNum() {
		
		return num++;
	}
}

class ThreadTest1 extends Thread{
	private Entity1 entity;
	private int count = 3;
	
	public ThreadTest1(Entity1 entity){
		this.entity = entity;
	}

	@Override
	public void run() {
		while(0 < count--){
			System.out.println(Thread.currentThread().getName() + " ---> " +  entity.getNum());
		}
	}
	
}

class Entity2 extends ThreadLocal<Integer>{
	
	@Override
	protected Integer initialValue() {
		
		return 0;
	}

	public Integer getNum() {
		int res = get();
		
		set(res + 1);
		
		return res;
	}
}

class ThreadTest2 extends Thread{
	private Entity2 entity;
	private int count = 3;
	
	public ThreadTest2(Entity2 entity){
		this.entity = entity;
	}

	@Override
	public void run() {
		while(0 < count--){
			System.out.println(Thread.currentThread().getName() + " ---> " +  entity.getNum());
		}
	}
	
}