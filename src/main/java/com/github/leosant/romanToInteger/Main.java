package com.github.leosant.romanToInteger;

public class Main {

    public static void main(String[] args) {

        String s = "MCMXCIV";

        System.out.println("Algarismos romanos: " + romanToInt(s));
    }

    public static int romanToInt(String letterRoman) {

        int totalRoman = 0;

        int i = 1;
        int lRomanRepeater = 1;
        while (i <= letterRoman.length()) {
            int countInversion = letterRoman.length() - i;
            int letterRomanActual = switchAphalbetRoman(letterRoman.charAt(countInversion));



            if (intHasNext(i, letterRoman.length())) {
                int letterRomanNext = switchAphalbetRoman(letterRoman.charAt(countInversion-1));

                if (letterRomanActual > letterRomanNext) {
                    totalRoman += letterRomanActual - letterRomanNext;
                    i++;
                }
                else if (letterRomanActual < letterRomanNext) {

                    totalRoman += letterRomanActual + letterRomanNext;
                }
                else {
                    lRomanRepeater++;
                    totalRoman += letterRomanActual;
                    if (lRomanRepeater > 3) {
                        throw new IllegalArgumentException("Max of number roman repeater");
                    }
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
        return positionActual < arraySize;
    }
}