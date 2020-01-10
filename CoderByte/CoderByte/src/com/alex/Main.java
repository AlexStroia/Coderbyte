package com.alex;

public class Main {

    public static void main(String[] args) {


        int[] array = {5, 4, 3, 2, 10, 11};

        String coderbyte = "(coder)[byte)]";

        System.out.println(MultipleBrackets(coderbyte));

    }

    public static int ChangingSequence(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] < arr[i + 1]) {
                if (arr[i + 1] >= arr[i + 2]) {
                    return i + 1;
                }
            } else {
                if (arr[i + 1] <= arr[i + 2]) {
                    return i + 1;
                }
            }
        }
        return -1;
    }
    public static String MultipleBrackets(String str) {
        int roundBracketLeft = 0;
        int roundBracketRight = 0;
        int squareBracketLeft = 0;
        int squareBracketRight = 0;

        for (var i = 0; i < str.length(); i++) {
            if (Character.toString(str.charAt(i)).equals("(")) {
                roundBracketLeft++;
            }
            if (Character.toString(str.charAt(i)).equals(")")) {
                roundBracketRight++;
            }
            if (Character.toString(str.charAt(i)).equals("[")) {
                squareBracketLeft++;
            }
            if (Character.toString(str.charAt(i)).equals("]")) {
                squareBracketRight++;
            }
        }
        if (roundBracketLeft == 0 && roundBracketRight == 0 && squareBracketLeft == 0 && squareBracketRight == 0) {
            return "1";
        } else if (roundBracketLeft == roundBracketRight && squareBracketLeft == squareBracketRight) {
            return 1 + " " + (roundBracketLeft + roundBracketLeft);
        }
        return "0";
    }

}