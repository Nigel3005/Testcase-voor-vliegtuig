package SelfLearning;

import java.util.ArrayList;
import java.util.Scanner;   // import the Scanner class

class testCase {
    private String test;    // create a private string
    private boolean boolTest;  // create a private boolean

    public testCase(String test, boolean boolTest) {  // create a public constructor
        this.test = test; // set the value of test
        this.boolTest = boolTest; // set the value of bool
    }

    public testCase(String test) {  // create a public constructor
        this(test, true);   // set the value of test and bool
    }

    public void setTest(String test) {   // create a public method to set the value of test
        this.test = test;   // set the value of test
    }

    public String getTest() {   // create a public method to get the value of test
        return test;    // return the value of test
    }

    public void setBoolTest(boolean boolTest) {   // create a public method to set the value of bool
        this.boolTest = boolTest;   // set the value of bool
    }

    public boolean getBoolTest() {   // create a public method to get the value of bool
        return boolTest;    // return the value of bool
    }
}

class ArchiefData {
    public ArrayList<String> strings = new ArrayList<String>(); // create a public arraylist of strings
    public ArrayList<Boolean> bools = new ArrayList<Boolean>(); // create a public arraylist of booleans
}

class combineArray {
    public ArrayList<String> strings = new ArrayList<String>(); // create a public arraylist of strings
    public ArrayList<Boolean> bools = new ArrayList<Boolean>(); // create a public arraylist of booleans
    public ArrayList<String> combined = new ArrayList<String>();    // create a public arraylist of strings to combine the other two

    public void combine() {  // create a public method to combine the two arraylists
        if (strings.size() == bools.size()) { // check if the arraylists are the same size
            for (int i = 0; i < strings.size(); i++) {    // loop through the arraylists
                combined.add(strings.get(i) + " " + bools.get(i));  // add the values to the combined arraylist
            }
        }
    }
}

public class Main { // class name
    public static void main(String[] args) { // method name
        testCase testcase = new testCase(" "); // create a new object
        Scanner scanner = new Scanner(System.in);   // Create a Scanner object

        ArchiefData data = new ArchiefData();   // create a new object

        System.out.println("Geef een string naam");
        String test = scanner.nextLine();    // Read user input
        System.out.println("Geef een boolean waarde met true of false: ");
            String boolTest = scanner.nextLine();    // Read user input
            testcase.setTest(test); // set the value of test
        testcase.setBoolTest(boolTest.equals("true"));  // set the value of bool to true or false
        data.strings.add(testcase.getTest());
        data.bools.add(testcase.getBoolTest());
        System.out.println("Het systeem heeft deze input gelezen: ");
        System.out.println("String naam: " + testcase.getTest());    // Output user input
        System.out.println("Boolean waarde: " + testcase.getBoolTest() + "\n");    // Output user input
        System.out.println("De arraylist bevat: ");
        System.out.println("String namen: " + data.strings);    // Output user input
        System.out.println("Boolean waardes: " + data.bools + "\n");    // Output user input

        System.out.println("De gecombineerde arraylist bevat: ");   // Output user input
        combineArray combine = new combineArray();  // create a new object
        combine.strings = data.strings; // set the value of strings
        combine.bools = data.bools; // set the value of bools
        combine.combine();  // combine the two arraylists
        System.out.println(combine.combined);   // Output user input
    }
}