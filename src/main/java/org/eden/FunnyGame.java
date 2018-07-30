package org.eden;

public class FunnyGame {
    public static void main(String[] args) {
        int index = 1;
        int maxNum = 100;
        System.out.println("requirement1");
        while (index <= maxNum - 1) {
            System.out.println(shoutViaMod(index));
            index++;
        }
        System.out.print(shoutViaMod(maxNum));

        System.out.println(System.lineSeparator());

        index = 1;
        System.out.println("requirement2");
        while (index <= maxNum - 1) {
            System.out.println(shoutViaModOrContains(index));
            index++;
        }
        System.out.print(shoutViaModOrContains(maxNum));
    }

    /**
     * for position:
     * 1. multiples of three, then return "Fizz",
     * 2. multiples of five, then return "Buzz",
     * 3. multiples of both three and five, then return "FizzBuzz",
     * 4. otherwise, return the string-value-type of position
     *
     * @param position
     * @return
     */
    public static String shoutViaMod(int position) {
        if (position % 15 == 0) {
            return "FizzBuzz";
        } else if (position % 3 == 0) {
            return "Fizz";
        } else if (position % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(position);
        }
    }

    /**
     * for position:
     * 1. divisible by 3 or if it has 3 int it, then return "fizz",
     * 2. divisible by 5 or if it has 5 int it, then return "buzz",
     * @param position
     * @return
     */
    public static String shoutViaModOrContains(int position) {
        if (position % 15 == 0) {
            return "FizzBuzz";
        } else if (position % 3 == 0 || String.valueOf(position).indexOf("3") != -1) {
            return "fizz";
        } else if (position % 5 == 0 || String.valueOf(position).indexOf("5") != -1) {
            return "buzz";
        } else {
            return String.valueOf(position);
        }
    }
}
