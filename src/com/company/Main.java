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

       String str = "\"Suggestion for the implementation of my assignment about programming\"";

        String[] stroke = {"Suggestion for the implementation of my assignment about programming", "I wanted a beautiful fate, like in the Roots video by Eric Badu Storytelling on the go",
                "I MC scourged and lynched everyone who rested on their laurels And lunched with their mediocre texts",
                "If you resist the surrounding whore It's not with a sad face"};


        str = str.toLowerCase();// create stroke with lowercase words
        String[] words = str.split(" "); //split the string around the spaces and put it directly into the array
       // string of vowels

        System.out.println("Array with numbers for example");
        System.out.println("Array before sort: " + Arrays.toString(myArray));
        Sort(myArray);

        System.out.println("Stroke before sort: " + str);
        SortToString(words);
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
    public static void SortToString(String[] words){

        //comb sort
        int gap = words.length;

        boolean isSorted = false;
        while(!isSorted || gap != 1){
            if(gap > 1){
                gap = gap * 10 / 13;

            }else{
                gap = 1;
            }

            isSorted = true;
            for(int i = gap; i < words.length; i++){
                if(FindVowel(words[i - gap]) < FindVowel(words[i])){
                    String tmp = words[i];
                    words[i] = words[i - gap];
                    words[i - gap] = tmp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(words));
    }
    public static int FindVowel(String word){
        int k = 0;
        String vowel = "aeiouy";
        for(int i = 0; i < word.length(); i++){
            for(int j = 0; j < vowel.length(); j++){
                if(word.charAt(i) == vowel.charAt(j)){
                    k++;
                }
            }
        }
        return k;
    }
}
