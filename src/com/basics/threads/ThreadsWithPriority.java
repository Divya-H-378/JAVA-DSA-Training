package com.basics.threads; // MaxP=10; MinP=1; NormP=5

public class ThreadsWithPriority extends Thread{
    public void run(){
        for (int i=1; i<=3; i++){
            System.out.println(Thread.currentThread().getName() + " | Priority: " +
                    Thread.currentThread().getPriority());
        }
    }
    public static void main(String[] args) {
        ThreadsWithPriority t1 = new ThreadsWithPriority();
        ThreadsWithPriority t2 = new ThreadsWithPriority();
        ThreadsWithPriority t3 = new ThreadsWithPriority();
        t1.setName("Low priority thread");
        t2.setName("Medium priority thread");
        t3.setName("High priority thread");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
//        t1.setPriority(11); // Illegal argument Exception
        t1.start();;
        t2.start();
        t3.start();
    }
}
/*
🟪 Points to Remember:
🟡 Thread priority is only a suggestion to the JVM or Scheduler
🟡 Higher priority does'nt quarantee earlier order of execution
🟡 Higher priority threads may get more CPU time by the Scheduler
🟡 The actual behaviour depends on JVM or operating system.
 */
