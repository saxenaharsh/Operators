package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int result = 1 + 2;
        System.out.println(" 1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " -1 = " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println(" The result is = " + result);
        result++;
        System.out.println(" The result is = " + result);
        previousResult = result;
        result--;
        System.out.println(" The result is = " + result);

        result += 2;
        System.out.println(" The result is = " + result);

        result *= 10;
        System.out.println(" The result is = " + result);

        result -= 10;
        System.out.println(" The result is = " + result);

        result /= 2;
        System.out.println(" The result is = " + result);

        boolean isAlien = false;
        if(isAlien == true){
            System.out.println("It is not an alien!");
        }

        int topScore = 80;
        if(topScore < 100){
            System.out.println("You got the high score");
        }

        int secondTopScore = 95;
        if((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than secondTopScore and less than 100");

        if((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests are true");

        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is an error");

        isCar = true;
        boolean wasCar = isCar ? true : false;

        if(wasCar)
            System.out.println("wasCar is true");


    }
}
