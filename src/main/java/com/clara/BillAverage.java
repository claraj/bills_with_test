package com.clara;

/**
 * Created by admin on 9/1/16.
 */
public class BillAverage {

    public static void main(String[] args) {

        //TODO get data from user

        //TODO figure out average

        //TODO display average

        //Display a table of all bills - done!

        //Hard-coding some test data, until we've written the rest of the program :)

        String[] billPeriods = { "January" , "February", "March", "April", "May"};
        double[] billAmounts = { 236, 223, 170, 150, 96};

        displayMonthsBills(billPeriods, billAmounts);

    }


    /** Format and display the bill period names and corresponding bill amounts */
    public static void displayMonthsBills(String[] billPeriodNames, double billAmounts[]) {


        int lengthLongestName = longestString(billPeriodNames);

        String[] displayNames = padStringArray(billPeriodNames, lengthLongestName);

        displayTable(displayNames, billAmounts);

    }

    // Some generic helper methods. Each has one task, and we can write a test for each

    /** Pad all Strings in an array with spaces to make each at least the given length */
    public static String[] padStringArray(String[] stringArray, int length) {

        String[] displayNames = new String[stringArray.length];

        for (int x = 0 ; x < stringArray.length ; x++) {
            displayNames[x] = padWithSpaces(stringArray[x], length);
        }

        return displayNames;
    }


    /** Display two arrays in a table separated by tabs */
    public static void displayTable(String[] firstcol, double[] secondcol) {
        //todo verify arrays are the same length. What to do if they are not?
        for (int x = 0 ; x < firstcol.length ; x++) {
            System.out.println(firstcol[x] + "\t" + secondcol[x]);
        }
    }


    /** Pad a String with spaces to produce a String of the length given by totalLength.
    // If given String is longer than the requested length, return the original String. */
    public static String padWithSpaces(String str, int totalLength) {

        // If the String is the same length, or shorter than the total length requested, then return the original String
        if (str.length() >= totalLength) {
            return str;
        }

        //Else, calculate how many spaces to add
        int spacesToAdd = totalLength - str.length();

        //Loop that many times, add one space per loop iteration
        for (int x = 0 ; x < spacesToAdd ; x++) {
            str = str + " ";
        }

        return str;

    }

    /** Determine the longest String in a String array,
     * return the length of that String */
    public static int longestString(String[] strings) {

        //Assume longest string is the shortest possible String: 0 characters
        int longestStringLength = 0;

        //Loop over all the Strings. For each String, compare length to longest String seen so far
        //If this String is longer, then update longestStringLength to the length of this String.
        for (String str : strings) {
            if (str.length() > longestStringLength)  {
                longestStringLength = str.length();
            }
        }

        return longestStringLength;
    }


}
