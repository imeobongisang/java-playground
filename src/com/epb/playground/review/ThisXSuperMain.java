package com.epb.playground.review;

public class ThisXSuperMain {
    public static void main(String[] args) {
        ThisXSuper t1 = new ThisXSuper(156);
        ThisXSuper t2 = t1;

        if(t1.equals(t2)){
            System.out.println("lol");
        }


    }
}