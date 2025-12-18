
package com.test.HelloWorldMaven;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");

        // Keep container alive
        while (true) {
            Thread.sleep(10000);
        }
    }
}
