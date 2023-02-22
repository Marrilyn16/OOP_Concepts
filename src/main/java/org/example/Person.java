package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {
//    private String name; //private-restricted access
//    // Getter
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
static List<Double> squareDigits(int n) {

    double cc=0.0;
    List<Double> mt = new ArrayList<>();
    // TODO Implement me
    String b=""+n+"";
    for(int x =0;x<b.length();x++) {
        int sh = Integer.parseInt(b);
        char c = b.charAt(x);
        cc= Math.pow(c,2);
        mt.add(cc);

    }
    return mt;
}
    public static void main(String[] args) {
//        Person myObj = new Person();
//        myObj.setName("Marrilyn");
//        System.out.println(myObj.getName());
        int y =811181;

        System.out.println(squareDigits(y));



//        for(int x =0;x<b.length();x++) {
//            int sh = Integer.parseInt(b);
//            char c = b.charAt(x);
//            double cc= Math.pow(c,2);
//            System.out.println((int) cc);
//        }

    }
}
