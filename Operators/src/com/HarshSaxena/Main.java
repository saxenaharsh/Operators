package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int prevResult = result;
        result = result - 1;
        System.out.println(prevResult + " - 1 = " + result );

        prevResult = result;
        System.out.println(prevResult);

        result = result * 10;
        System.out.println(prevResult + " * 10 = " + result);

        prevResult = result;
        result = result / 5;
        System.out.println(prevResult + " / 5 = " + result);

        prevResult = result;
        result = result % 3;
        System.out.println(prevResult + " % 3 = " + result);

        prevResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);
        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if(isAlien == true){
            System.out.println("It is not an alien");
        }

        int topScore = 80;
        if(topScore < 100)
            System.out.println("You have got a high score!");

        int secondTopScore = 81;
                if(topScore > secondTopScore && topScore < 100)
                    System.out.println("Greater than second score and less than 100");



    }
}
