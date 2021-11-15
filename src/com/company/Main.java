package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	mainmenu();
    }

    public static void mainmenu() {
        try {
            raffleAsk();
            switch( raffleAsk()) {
                case ("yes"):
                    name();
                    ArrayList<String> nameAndTickets = new ArrayList<>();
                    nameAndTickets.add(name());

                break;
                default:
                    System.out.println("Then why are you here");
                    System.exit(0);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    private static String name() {
        System.out.println("What is your name");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            return bufferedReader.readLine();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    private static String raffleAsk() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("do you want a raffle ticket");
        try {
            return bufferedReader.readLine();
        }
        catch (Exception e){
            System.out.println(e);
        }
        return "";
    }
    public static int getRandom({
        Random random = new Random();
        return random(0,1000);
    }
}
