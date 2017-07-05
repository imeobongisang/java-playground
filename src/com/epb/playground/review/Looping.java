package com.epb.playground.review;
public class Looping {
    public static void main(String [] args) {
        int someValue = 200;

        float leftValues[] = {10.0f, 25.0f, 2.0f, 32.0f};
        float rightValues[] = {5.0f, 2.0f, 20.0f, 11.0f};
        char opCodes[] = {'a', 's', 'm', 'd'};

        for (int x = 0; x < opCodes.length; x++) {
            float left = leftValues[x];
            float right = rightValues[x];
            switch(opCodes[x]) {
                case 'a':
                    System.out.println(left + " + " + right + " = " + (left + right) );
                    break;
                case 's':
                    System.out.println(left + " - " + right + " = " + (left - right) );
                    break;
                case 'm':
                    System.out.println(left + " * " + right + " = " + (left * right) );
                    break;
                case 'd':
                    System.out.println(left + " / " + right + " = " + (left / right) );
                    break;          
                default :
                    System.out.println("You entered the wrong opCode");
                    break;
            }
        }

    // //Do-While Loop//
    //     do {
    //         System.out.print(someValue);
    //         System.out.print(" * 2 = ");
    //         System.out.println(someValue /= 2);


    //     } while (someValue >= 10);
    }

}