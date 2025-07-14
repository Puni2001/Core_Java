package Multithreading;


class MyThread extends  Thread {

    // @Override
    public void  run(){
        for (int i=0; i<5; i++){
            System.out.println("code executed by the thread: "+ i +" " + Thread.currentThread().getName());
        }
    }
}

class MyThreadByRunnable implements Runnable{

    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Code by the runnable logic: " + i +" "+ Thread.currentThread().getName() );
        }
    }
}

public class ThreadingPractice{
    public static void main(String[] args){

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThreadByRunnable tr1 = new MyThreadByRunnable();
        Thread threadByrunnable = new Thread(tr1);

        t1.start();
        t2.start();

        threadByrunnable.start();
    }
}