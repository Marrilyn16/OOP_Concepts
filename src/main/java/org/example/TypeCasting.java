package org.example;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        Two conditions for type conversion
//        1. The two types should be compatible e.g. int & float not string & int.
//        2. The left hand type(destination) should be greater than the right hand side (source)e.g float > int-This will work. the reverse will not.
//        Type Conversion Vs. Type casting(Narrowing conversion)
//        Type conversion is used on data types that are compatible while type casting is used on data types that are not

//Type Casting
        //Example 1:
//        int num = (int)(5.67f);
//        float num1 = (float)(5);
//        System.out.println(num);
//        System.out.println(num1);

        //Example 2:
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//        System.out.println(d);

//          //Example 3
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b); //257 % 256 = 1. this returns the remainder of what byte can hold.

    // A final example to put all together
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d * s);
        //float + int - double = double
        System.out.println((f * b) + " " + (i / c)+ " " +  (d * s));
        System.out.println(result);
    }
}
