package com.github.leosant.romanToInteger;

public class Main {

    public static void main(String[] args) {

        String s = "MMCDXXV";

        System.out.println("Algarismos romanos: " + romanToInt(s));
    }

    public static int romanToInt(String letterRoman) {

        int totalRoman = 0;
        int i = 0;

        while (i < letterRoman.length()) {

            int letterRomanActual = switchAphalbetRoman(letterRoman.charAt(i));

            if (intHasNext(i, letterRoman.length())) {
                int letterRomanNext = switchAphalbetRoman(letterRoman.charAt(i+1));

                if (letterRomanActual < letterRomanNext) {

                    totalRoman += letterRomanNext - letterRomanActual;
                    i++;
                }
                else {
                    totalRoman += letterRomanActual;
                }
            }
            else {
                totalRoman += letterRomanActual;
            }
            i++;
        }

        return totalRoman;
    }

    public static int switchAphalbetRoman(char letterRoamn) {

        switch (letterRoamn){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalStateException("Unexpected value: " + letterRoamn);
        }
    }

    /**
     * method evita que lanca erro arrayindexofbout
     */
    public static boolean intHasNext(int positionActual, int arraySize) {
        return positionActual < (arraySize-1);
    }
}