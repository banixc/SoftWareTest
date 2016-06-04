package com.banixc.softwaretest6_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Triangle {

    private static int stdin() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static int count;

    private int a, b, c;

    private Triangle() {

        System.out.println("Enter three integers which are sides of a triangle");
        a = stdin();
        b = stdin();
        c = stdin();
        System.out.println("Side A is " + a + " Side B is " + b + " Side C is " + c);
        if ((a < b + c) & (b < a + c) & (c < a + b)) {
            if (a == b ^ a == c ^ b == c & !(a == b & a == c))
                System.out.println("Triangle is Isosceles");
            if (a == b & b == c)
                System.out.println("Triangle is Equilateral");
            if (a != b & a != c & b != c)
                System.out.println("Triangle is Scalene");
        } else {
            System.out.println("Bot a Triangle");
        }
        count++;
    }

    public static void main(String[] args) {
        System.out.println("Enter the parameters, max and count:");
        int max = stdin();
        count = stdin();
        Triangle[] list = new Triangle[max];
        while (count > 0 & count <= max) {
            list[count - 1] = new Triangle();
        }
    }

    private static String cul(){

        List<String> l = new ArrayList<>();


        String[][] list = new String[][]{
                {"31-C-","31-D-32-"},
                {"33-E-","33-F-34-"},
                {"35-G-","35-H-36-"}
        };
        String s="";
        for(int i = 0b0; i < 8 ; i++){
            s+="29-30-B-";
            for(int j = 0 ; j < list.length ; j ++){
                int t = 0b1 << list.length-j-1;
                int m = i & (0b1 << list.length-j-1);
                int n = (i & (0b1 << list.length-j-1)) >> list.length-j-1;
                s+=list[j][(i & (0b1 << list.length-j-1)) >> list.length-j-1];
            }
            s+="40\n";
        }
        return s;


    }
}
