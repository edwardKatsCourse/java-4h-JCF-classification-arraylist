package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //String [] words = new String[10];
        ArrayList<String> words = new ArrayList<>(); //10 -> capacity

        //capacity (internal)
        //size (external)

        words.add("bee");
        words.add("apple");
        words.add("table");
        words.add("table");
        words.add("table");
        words.add("table"); //6th
        //String [] words = new String[10 * 2]; -> //20 | 14 empty
        words.add("table");
        words.add("table");
        words.add("table");
        words.add("table"); //10th

        words.add("eleven"); //11th
        //capacity = 20
        //size = 11



        //Adding 1 element per hour
        //There should be 1000 (1 thousand) more
        //words.ensureCapacity(1000);

        //words.trimToSize();
        //size = 11
        //capacity 20 -> 11
        List<String> russianWords = new ArrayList<>();
        russianWords.add("привет");
        russianWords.add("стол");
        russianWords.add("чашка");
        russianWords.add("ложка");

        words.addAll(russianWords);
        System.out.println(words);

        //words.clear(); //delete all elements from list
        //System.out.println(words);

        System.out.printf("Index of [%s]: %s\n", "стол", words.indexOf("стол")); //printf -> print + String.format

        //words.isEmpty() SAME AS words.size() == 0
        words.set(0, "Java 4H"); //insert -> set/replace by index
        //   .add("new word");     adds a new element to the end
        System.out.printf("ArrayList after .set() : \n%s\n", words);
        System.out.println();

        String removedWord = words.remove(0); //capacity not decreased after deletion
        System.out.printf("Word [%s] was removed from AL\n", removedWord);
        System.out.println(words);

        System.out.printf("Zero index word is: [%s]\n", words.get(0));

        words.remove("стол"); //Removing from Lists by value - is a bad practice
        System.out.println(words);

//        String wordToDelete = "abc";
//        for (int i = 0; i < words.size(); i++) {
//
//            if (words.get(i).equals(wordToDelete)) {
//                words.remove(i);
//            }
//        }

        List<String> otherWords = new ArrayList<>();
        otherWords.add("eleven");
        otherWords.add("чашка");


        words.retainAll(otherWords); //Keep in "words" all matches from "otherWords" | intersection
        System.out.println(words);

        words.set(0, null);


        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ivan"));
        personList.add(new Person("Sarah"));

        Person ivan = personList.get(0);
        ivan.name = "stolen";

        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i).getName());
        }
    }




}


class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}