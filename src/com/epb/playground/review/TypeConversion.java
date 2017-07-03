package com.epb.playground.review;
public class TypeConversion {
    public static void main (String [] args) {
        int intVal = 23;
        float floatVal = 9.0f;
        double doubleVal = 4.0d;
        byte byteVal = 125;
        short shortVal = 7;
        long longVal = 5;

    /*integer arithmatic*/

        // 23 * 23 ::  this should work ok 
        int intResult1 = intVal * intVal;
        
        // 23 * 9.0 ::  this should fail. implicit cast float which is large than int
        // int intResult2 = intVal * floatVal;
        
        // 23 * 4.0 this should fail. inplicit cast to double which is larger than int
        // int intResult3 = intVal * doubleVal;
       
        // 23 * 125 this should work
        int intResult4 = intVal * byteVal;

        // 23 * 7 this should work
        int intResult5 = intVal * shortVal;

        // 23 * 5 this should fail. implicit cas to long which larger than int
        // int intResult6 = intVal * longVal;

        // System.out.println(intResult5);


    /*floating point arithmatic*/

        // this should work
        float floatResult1 = floatVal * intVal;

        // this should work
        float floatResult2 = floatVal * floatVal;

        // this should fail. implcit cast to double, which is not a float
        // float floatResult3 = floatVal * doubleVal;

        //this should work
        float floatResult4 = floatVal * byteVal;

        //this should work
        float floatResult5 = floatVal * shortVal;
        
        //this should work. implicit cast to float. result may be hairy
        float floatResult6 = floatVal * longVal;
        // System.out.println(floatResult6);

    /*double precision arithmatic*/
        //this should work
        double doubleResult1 = doubleVal * intVal;
        
        //this should work
        double doubleResult2 = doubleVal * floatVal;
        
        //this should work
        double doubleResult3 = doubleVal * doubleVal;
        
        //this should work
        double doubleResult4 = doubleVal * byteVal;
       
        //this should work
        double doubleResult5 = doubleVal * shortVal;

        //this should work
        double doubleResult6 = doubleVal * longVal;

        // System.out.println(doubleResult6);

    /*byte precision arithmatic*/

        //this should fail. implicit cast to int, which is bigger than byte
        // byte byteResult1 = byteVal * intVal;

        //this should fail. implicit cast to float, wich is bigger than byte
        // byte byteResult2 = byteVal * floatVal;
        
        //this should fail. implicit cast to double, wich is bigger than byte
        // byte byteResult3 = byteVal * doubleVal;
      
        //this should fail, the result is more than a byte.
        // byte byteResult4 = byteVal * byteVal;

        //this should fail. implicit cast to short, wich is bigger than byte        
        // byte byteResult5 = byteVal * shortVal;

        //this should fail. implicit cast to long, wich is bigger than byte
        // byte byteResult6 = byteVal * longVal;
        
        // System.out.println(byteResult4);

    /*short precision arithmatic*/
        // short arithmatic operation always return and int value

        //this should fail. implicite cast to int, which is larger than a short
        // short shortResult1 = shortVal * intVal;
        
        //this should fail. implicite cast to float, which is larger than short 
        // short shortResult2 = shortVal * floatVal;

        //this should fail. implicate cast to double, which is larger than short
        // short shortResult3 = shortVal * doubleVal;

        //this should work.
        // short shortResult4 = shortVal * byteVal;
       
        //this should work.
        short shortResult5 = (short)(shortVal + shortVal);
        
        //this should fail. implicate cast to long which is bigger than short
        // short shortResult6 = shortVal * longVal;

        // System.out.println(shortResult5);

    /*long precision arithmatic*/
        
        //this should work
        long longResult1 = longVal * intVal;
        
        //this should fail. you cannot down cast from decimal point data
        //long longResult2 = longVal * floatVal;

        //this should fail. you cannot down cast from decimal point data
        //long longResult3 = longVal * doubleVal;

        //this should work
        long longResult4 = longVal * byteVal;

        //this should work
        long longResult5 = longVal * shortVal;

        //this should work
        long longResult6 = longVal * longVal;

        // System.out.println(floatResult3);




    // order of size: byte (8), short(16), int(32), float(32 precision), long(64), double(64 precision)
    //int and float are both 32 bit in size, but float takes into account decimal places
    //long and double are both 64 bit in size, but double takes into account decimal places
    //decimal places takes precidence in arimatic point operations over integer values

System.out.println("It Worked!");
    }
}