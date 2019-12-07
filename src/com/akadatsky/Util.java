package com.akadatsky;

public class Util {

    public static void save(String str, Destination destination) {
        switch (destination) {
            case DB:
                System.out.println("db");
                break;
            case FILE:
                System.out.println("FILE");
                break;
            case SERVER:
                System.out.println("SERVER");
                break;
            default:
                System.out.println("unknown");
        }

        if (destination == Destination.SERVER) {
            System.out.println("test");
        }

    }


}
