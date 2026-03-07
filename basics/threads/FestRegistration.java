package com.basics.threads;

public class FestRegistration {
    // Form Fill-up
    static class FormFilling extends Thread{
        public void run() {
            System.out.println("Form filling started");
        }
    }
    // Upload Documents
    static class DocumentsUpload extends Thread{
        public void run() {
            System.out.println("Document Upload started!");
        }
    }
    // Email Notification
    static class EmailNotification extends Thread{
        public void run() {
            System.out.println("Email Notification sent.");
        }
    }

    public static void main(String[] args) {
        FormFilling t1 = new FormFilling();
        DocumentsUpload t2 = new DocumentsUpload();
        EmailNotification t3 = new EmailNotification();
        t1.start();
        t2.start();
        t3.start();
    }
}
/*
Points to remember:
💛 Java program starts with one main thread
💛 threads allow "parallel execution" -> Concurrency
💛 Output order is never guaranteed
💛 Threads share the same memory
💛 Improves the performance and responsiveness
💛 when start() is called, the JVM creates a new Thread
💛 when run() is called directly, there is no concurrency

❕❕❕  "Process vs  Thread"
💛 Process is a running program
💛 Thread is a path of execution inside the program
💛 A process has its own memory
💛 Threads share the same memory
💛 creating a thread is cheaper than creating a Process
🟢  Examples:
💛 Process -> Google chrome browser; thread -> New tab of chrome
💛 Closing a tab will not close or will not kill chrome
 */