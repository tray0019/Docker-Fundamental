package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        int count = 0;
        try {
            while (true) {
                Thread.sleep(2*1000);
                System.out.println("I'm still here! Iteration"+ count++);
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}