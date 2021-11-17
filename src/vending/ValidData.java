package vending;

import java.util.regex.Pattern;

public class ValidData {
    public static boolean checkBlank(String str) {
        if (str.trim().isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean checkOption(String choiceStr, int min, int max) {
        if (!checkBlank(choiceStr)) {
            return false;
        }
        int option;

        // if user enter non-integer
        try {
            option = Integer.parseInt(choiceStr.trim());
        } catch (Exception e) {
            System.out.println("This cannot contains non-digit character");
            return false;
        }

        if (option < min || option > max) {
            System.out.println("Please input number in range rage [" + min + ", " + max + "]");
            System.out.println("Enter again");
            return false;
        }

        return true;
    }

    public static boolean checkCash(String cash) {
        if (Pattern.matches("\\d,\\d,\\d,\\d,\\d", cash)) {
            return true;
        } else {
            System.out.println("Wrong format. Enter again:");
            return false;
        }
    }

    public static boolean validateExit(String exit) {
        if(!checkBlank(exit)) return false;
        //if user not enter y or n ignore case
        if(!(exit.equalsIgnoreCase("y") || exit.equalsIgnoreCase("n"))) {
            System.out.println("Must enter Y or N.");
            return false;
        }
        return true;
    }
}
