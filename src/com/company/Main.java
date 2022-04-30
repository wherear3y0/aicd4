package com.company;

import java.util.*;

//my task: Implement comb sorting. Apply this sort to sort strings according to the following criteria:
//  - first, according to the number of vowels in a line (for the English alphabet), lines with a large number of vowels should come first;
//  - then along the length of the line, longer words in front.
public class Main {
    public static void main(String[] args) {

        String[] myStringArray = {"Suggestion for the implementation of my assignment about programming", "I wanted a beautiful fate, like in the Roots video by Eric Badu Storytelling on the go",
                "I MC scourged and lynched everyone who rested on their laurels And lunched with their mediocre texts",
                "If you resist the surrounding whore It's not with a sad face"};

        ArrayList<String> myStringArray1 = new ArrayList<>(Arrays.asList(myStringArray));

        System.out.println("My task with words");
        System.out.println("Array before sort: ");
        for(int i = 0; i < myStringArray.length; i++){
        System.out.println(myStringArray[i]);}
        System.out.println("-------------------------------------");
        solve(myStringArray1);
    }

    public static void solve(ArrayList<String> myStringArray){

        for (int i = 0; i < myStringArray.size(); i++){
            myStringArray.set(i, str(myStringArray.get(i)));
        }
        SortToString(myStringArray);
        System.out.println("Array after sort: ");
        for(int i =0; i < myStringArray.size(); i++){
        System.out.println( myStringArray.get(i));}
    }
    public static void SortToString(ArrayList<String> myStringArray){
        //сортировка расческой
        int gap = myStringArray.size();
        boolean isSorted = false;
        while(!isSorted || gap != 1){
            if(gap > 1){
                gap = gap * 10 / 13;

            }else{
                gap = 1;
            }

            isSorted = true;
            for(int i = gap; i < myStringArray.size(); i++){
                if(sorted(myStringArray.get(i - gap)) < sorted(myStringArray.get(i))){
                    String tmp = myStringArray.get(i);
                    myStringArray.set(i, myStringArray.get(i - gap));
                    myStringArray.set(i - gap, tmp);
                    isSorted = false;
                }
            }
        }

    }
    public static int sorted(String pattern){
        String vowel = "aeiouy";
        int k = 0;
        for (int i = 0; i < pattern.length(); i++){
            for (int j = 0; j < vowel.length(); j++){
                if (pattern.charAt(i) == (vowel.charAt(j))){
                    k++;
                }
            }
        }
        return k;
    }
    public static String str(String pattern){
        String simbol = "[-.?!)(,:] ";
        StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < pattern.length(); i++){
            sb.append(pattern.charAt(i));
            for (int j = 0; j < simbol.length(); j++){
                if (pattern.charAt(i) == (simbol.charAt(j))){
                    sb.deleteCharAt(sb.length()-1);
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        list.add(sb.toString());
        SortToString(list);
        return String.join(" ", list);
    }

}