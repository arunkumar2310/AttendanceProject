package org.springframework.spring_context;


public class App extends Thread implements Runnable
{
	public void run() {
		System.out.println("arun");
	}
    public static void main( String[] args )throws Exception
    {
        Thread t=new Thread();
        t.start();
        t.run();
    }
}
