package com.company;

import java.util.*;



//my task: Implement comb sorting. Apply this sort to sort strings according to the following criteria:
//  - first, according to the number of vowels in a line (for the English alphabet), lines with a large number of vowels should come first;
//  - then along the length of the line, longer words in front.
public class Main {
    public static void main(String[] args) {

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

        String str = "Suggestion for the implementation of my assignment about programming";
        str = str.toLowerCase();// create stroke with lowercase words
        String[] words = str.split(" "); //split the string around the spaces and put it directly into the array
        String vowel = "aeiouy";// string of vowels

        System.out.println("Array with numbers for example");
        System.out.println("Array before sort: " + Arrays.toString(myArray));
        Sort(myArray);

        System.out.println("Stroke before sort: " + str);
        SortToString(words, vowel);
    }
    //поросто для чисел
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
    public static void SortToString(String[] words, String vowel){
        //поиск гласных и их индексов
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                int index = vowel.indexOf(words[i].charAt(j));
                System.out.print(index + " ");
            }
        }
        int[] count = new int[words.length];//array with amount our words and they index

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                int index = vowel.indexOf(words[i].charAt(j));
                if (index > 0) {
                    count[i] = count[i] + 1;
                }
            }
        }

        //comb sort
        int gap = count.length;

        boolean isSorted = false;
        while(!isSorted || gap != 1){
            if(gap > 1){
                gap = gap * 10 / 13;

            }else{
                gap = 1;
            }

            isSorted = true;
            for(int i = gap; i < words.length; i++){
                if(words[i - gap]) > words[i] ){
                    int tmp = words[i);
                    words[i] = words[i - gap];
                    words[i - gap] = tmp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(words));
    }
    public static void WordIndex(String[] myStringArray, String vowel){

        for (int i = 0; i < myStringArray.length; i++) {
            for (int j = 0; j < myStringArray[i].length(); j++) {
                int index = vowel.indexOf(myStringArray[i].charAt(j));
            }
        }
    }

}
