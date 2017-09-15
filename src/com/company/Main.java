package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num=0;
        int a=0;
        int b=1;
        FBNQ fbnq1=new FBNQ();
        FBNQ fbnq2=new FBNQ();
        Thread threadOne=new Thread(fbnq1);
        Thread threadTwo=new Thread(fbnq2);
        threadOne.start();
        threadTwo.start();
        for (int i=0;i<=20;i++){

            if (num % 2 == 0) {
                a=fbnq1.FB(a,b);
                num++;
                System.out.println(a);
            }
            if (num % 2 != 0) {
                b=fbnq2.FB(a,b);
                num++;
                System.out.println(b);
            }


        }

    }
}
