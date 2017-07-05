package com.epb.playground.review;

import com.epb.playground.review.ClassesXLooping;

public class ClassesXLoopingMain {
    public static void main(String[] args) {
        ClassesXLooping[] classesXLoopings = new ClassesXLooping[4];

        classesXLoopings[0] = new ClassesXLooping(5.0f,10.0f,'a');
        classesXLoopings[1] = new ClassesXLooping(2.0f,25.0f,'s');
        classesXLoopings[2] = new ClassesXLooping(20.0f,2.0f,'m');
        classesXLoopings[3] = new ClassesXLooping(11.0f,32.0f,'d');

        for (ClassesXLooping classesXLooping : classesXLoopings) {
            classesXLooping.calculation();
            System.out.println("Result of calulation: " + classesXLooping.getResult()); 
        }
    }


}