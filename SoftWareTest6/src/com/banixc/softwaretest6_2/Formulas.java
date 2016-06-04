package com.banixc.softwaretest6_2;

class Formulas {

    static int clip(int lower, int upper, int x) {

        if (x < lower) {
            x = lower;
        }

        if (x > upper) {
            x = upper;
        }
        return x;
    }

    static int max(int a, int b, int c) {

        if (a < b) {

            if (b < c) {

                return c;

            } else {

                return b;
            }

        } else {

            if (a < c) {

                return b;
            } else {

                return a;

            }
        }

    }

}
