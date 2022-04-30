package com.company;

import java.util.*;



//my task: Implement comb sorting. Apply this sort to sort strings according to the following criteria:
//  - first, according to the number of vowels in a line (for the English alphabet), lines with a large number of vowels should come first;
//  - then along the length of the line, longer words in front.
public class Main {
    public static void main(String[] args) {
        String vowel = "aeiouy";
        int[] myArray = new int[10];
        myArray[0] = 1;
        myArray[1] = 3;
        myArray[2] = 9;
        myArray[3] = 7;
        myArray[4] = 5;
        myArray[5] = 2;
        myArray[6] = 6;
        myArray[7] = 4;
        myArray[8] = 9;
        myArray[9] = 6;

        String[] myStringArray = new String[10];
        myStringArray[0] = "lunges";
        myStringArray[1] = "acacia";
        myStringArray[2] = "pelvis";
        myStringArray[3] = "erosion";
        myStringArray[4] = "promise";
        myStringArray[5] = "castigation";
        myStringArray[6] = "quick";
        myStringArray[7] = "much";
        myStringArray[8] = "ophthalmologist";
        myStringArray[9] = "nightclub";

        System.out.println("Array with numbers for example");
        System.out.println("Array before sort: " + Arrays.toString(myArray));
        Sort(myArray);

        System.out.println("My task with words");
        System.out.println("Array before sort: " + Arrays.toString(myStringArray));
        SortToString(myStringArray, vowel);
    }

    public static void Sort(int [] myArray) {
        int gap = myArray.length;

        boolean isSorted = false;
        while(!isSorted || gap != 1){
            if(gap > 1){
                gap = gap * 10 / 13;

            }else{
                gap = 1;
            }

            isSorted = true;
            for(int i = gap; i < myArray.length; i++){
                if(myArray[i - gap] > myArray[i] ){
                    int tmp = myArray[i];
                    myArray[i] = myArray[i - gap];
                    myArray[i - gap] = tmp;
                    isSorted = false;
                }
            }
        }
        System.out.println("Array after sort: " + Arrays.toString(myArray));
        System.out.println("-------------------------------------------------");
    }
    public static void SortToString(String[] myStringArray, String vowel){

        for (int i = 0; i < myStringArray.length; i++) {
            for (int j = 0; j < myStringArray[i].length(); j++) {
                int index = vowel.indexOf(myStringArray[i].charAt(j));
            }
        }

        int[] count = new int[myStringArray.length];

        for (int i = 0; i < myStringArray.length; i++) {
            for (int j = 0; j < myStringArray[i].length(); j++) {
                int index = vowel.indexOf(myStringArray[i].charAt(j));
                if (index > 0) {
                    count[i] = count[i] + 1;
                }
            }
        }

        int gap = myStringArray.length;
        boolean isSorted = false;
        while(!isSorted || gap != 1){
            if(gap > 1){
                gap = gap * 10 / 13;

            }else{
                gap = 1;
            }

            isSorted = true;
            for(int i = gap; i < myStringArray.length; i++){
                if(myStringArray[i - gap] > myStringArray[i] ){
                    int tmp = myStringArray[i];
                    myStringArray[i] = myStringArray[i - gap];
                    myStringArray[i - gap] = String.valueOf(tmp);
                    isSorted = false;
                }
            }


        }
        System.out.println("Array after sort: " + Arrays.toString(myStringArray));

    }
    public static void WordIndex(String[] myStringArray, String vowel){

        for (int i = 0; i < myStringArray.length; i++) {
            for (int j = 0; j < myStringArray[i].length(); j++) {
                int index = vowel.indexOf(myStringArray[i].charAt(j));
            }
        }
    }

}
