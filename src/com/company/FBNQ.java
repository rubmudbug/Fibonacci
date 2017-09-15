package com.company;
//c=a+b
public class FBNQ implements Runnable {
    @Override
    public void run() {
        Thread.yield();
    }
    public int FB(int a,int b){
        return a+b;
    }
}
