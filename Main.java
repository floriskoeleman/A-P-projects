package com.company;

import java.util.Scanner;

public class Main {


    public static boolean checkmail(String input){
        return input.matches("([\\w.+]*)\\w+@hva.nl");
    }

    public static void main(String[] args) {
        //noinspection InfiniteLoopStatement
        while (true) {
            Scanner input = new Scanner(System.in);
            String test = input.next();

            if (checkmail(test)) {
                System.out.println("jeej");
            } else {
                System.out.println("mhhh..nee");
            }
        }
    }
}
